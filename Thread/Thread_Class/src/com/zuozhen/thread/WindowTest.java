package com.zuozhen.thread;

/*
线程安全问题解决（同步机制）：
way1.同步代码块
synchronized(同步监视器){//同步监视器：俗称锁；任何一个类的对象都可以充当锁(要求：多个线程共用一把锁)
    //需要被同步的代码
    //操作共享数据的代码
    //共享数据：多个线程共同操作的变量
}
way2.同步方法
    如果操作共享数据的代码完整的声明在一个方法中，我们不妨声明此方法为同步的。
    仍需同步监视器，但是不需要显式声明
    非静态：this
    静态：当前类 Xxx.class

 */
public class WindowTest {
    public static void main(String[] args) {
        /*
        同步代码块
         */
        //实现Runnable接口
//        Window w = new Window();
//        Thread t1 = new Thread(w);
//        Thread t2 = new Thread(w);
//        Thread t3 = new Thread(w);
//        t1.start();
//        t2.start();
//        t3.start();
        //继承Thread类
//        Window2 w1 = new Window2();
//        Window2 w2 = new Window2();
//        Window2 w3 = new Window2();
//        w1.start();
//        w2.start();
//        w3.start();
        /*
        同步方法
         */
//        Window3 w3 = new Window3();
//        Thread t3_1 = new Thread(w3);
//        Thread t3_2 = new Thread(w3);
//        Thread t3_3 = new Thread(w3);
//        t3_1.start();
//        t3_2.start();
//        t3_3.start();

//        Window4 w4_1 = new Window4();
//        Window4 w4_2 = new Window4();
//        Window4 w4_3 = new Window4();
//        w4_1.start();
//        w4_2.start();
//        w4_3.start();
    }
}

/*
同步代码块
 */
class Window implements Runnable {
    private static int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //同步代码块
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}

class Window2 extends Thread {
    private static int tickets = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}

/*
同步方法
 */
class Window3 implements Runnable {
    private static int tickets = 100;

    @Override
    public void run() {
        while (tickets > 0) {
            show();
        }
    }

    private synchronized void show() {//同步监视器，this
        System.out.println(Thread.currentThread().getName() + ":" + tickets);
        tickets--;
    }
}

class Window4 extends Thread {
    private static int tickets = 100;

    @Override
    public void run() {
        while (tickets > 0) {
            show();
        }
    }

    private static synchronized void show() {//同步监视器，Window4.class
        System.out.println(Thread.currentThread().getName() + ":" + tickets);
        tickets--;
    }
}