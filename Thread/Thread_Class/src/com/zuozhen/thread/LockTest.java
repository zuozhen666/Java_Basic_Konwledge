package com.zuozhen.thread;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    /*
    解决线程安全的方式2：Lock锁（JDK5.0新增）
     */
    public static void main(String[] args) {
        WindowLock w = new WindowLock();
        Thread w1 = new Thread(w);
        Thread w2 = new Thread(w);
        Thread w3 = new Thread(w);
        w1.start();
        w2.start();
        w3.start();
    }
}

class WindowLock implements Runnable {
    private int tickets = 100;
    //1.实例化
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                //2.调用lock()方法
                lock.lock();
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "sold" + tickets);
                } else {
                    break;
                }
                tickets--;
            } finally {
                //3.解锁
                lock.unlock();
            }
        }
    }
}