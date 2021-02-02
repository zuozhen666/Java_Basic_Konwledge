package com.zuozhen.thread;

public class ThreadMethodTest {
    /*
     * start():启动当前线程，调用run方法
     * run():通常需要重写此方法，将创建线程执行的操作声明在其中
     * currentThread():静态方法，返回当前代码执行的线程
     * getName():获取当前线程的名字
     * setName():设置当前线程的名字
     * yield():释放当前cpu的执行权
     * join():A中调用B.join()，此时A进入阻塞状态，等待线程B执行完之后再执行
     * stop():强制结束线程//不建议使用
     * sleep(long millitime)://睡眠（毫秒）
     * isAlive():判断当前线程是否存活
     *
     * */
    public static void main(String[] args) {
        //主线程命名
        Thread.currentThread().setName("主线程");
        TestThread t1 = new TestThread();
        t1.setName("线程1");//也可以通过带参构造器来命名
        t1.start();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if (i == 5) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(t1.isAlive());//false
    }
}

class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            } else {
                this.yield();
            }
        }
    }

    public TestThread() {
        super();
    }

    public TestThread(String name) {
        super(name);
    }
}
