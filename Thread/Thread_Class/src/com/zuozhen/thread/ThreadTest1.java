package com.zuozhen.thread;

/**
 * 创建多线程的方式二：实现Runnable接口
 *  1.创建一个实现了Runnable接口的类
 *  2.实现类去实现Runnable类中的抽象方法run
 *  3.创建类的对象
 *  4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 *  5.通过Thread类的对象调用start()
 *
 * 两种创建方式的比较：
 *  继承具有局限性，所以实现Runnable接口的方式更具灵活性
 *  实现Runnable接口的方式天然有一种共享数据的特性（构造器的参数为同一对象）
 *  所以优先选择实现Runnable接口的方式
 *
 * */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();
    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}