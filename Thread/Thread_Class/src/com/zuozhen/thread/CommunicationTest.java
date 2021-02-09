package com.zuozhen.thread;

public class CommunicationTest {
    /*
    线程通信：两个线程交替打印1-100
    //以下方法只能出现在同步代码块或者同步方法中
    //调用者必须是同步代码块或同步方法中的同步监视器
    //这三个方法是定义在Object中的
    wait():当前线程进入阻塞状态，释放同步监视器
    notify():唤醒被wait的一个线程，（优先级高的）
    notifyAll():唤醒所有
     */
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.start();
        t2.start();
    }
    /*
    sleep()与wait()的异同：
    1.相同点：一旦执行，都可是当前线程进入阻塞状态
    2.不同点：
        声明位置不同：前者Thread静态方法，后者Object；
        调用要求：前者任何需要的场景，后者必须使用在同步代码块or同步方法并由同步监视器调用；
        如果两个方法都使用在同步代码块或同步方法中，wait会释放同步监视器，sleep不会。
     */
}

class Number implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //唤醒一个线程
                notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                    try {
                        //使得调用wait()的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
