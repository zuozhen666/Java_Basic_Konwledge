package com.zuozhen.thread;

/**
 * 多线程的创建：方式一：继承Thread类
 * 1.创建继承于Thread类的子类
 * 2.重写Thread类的run方法
 * 3.创建子类的对象
 * 4.通过此对象调用start()方法
 */

class MyThread extends Thread {
    @Override
    public void run() {
        //遍历100以内的偶数
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();//启动线程并调用run方法
        //直接调用run的话就是单线程了
        //对一个线程对象来讲，start只能调用一次
        //遍历100以内的奇数
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        //匿名子类
        new Thread() {
            @Override
            public void run() {
                //...
            }
        }.start();
    }
}
