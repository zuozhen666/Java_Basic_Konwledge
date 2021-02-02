package com.zuozhen.thread;

public class WindowTest {
    public static void main(String[] args) {
        /*
        存在线程安全问题
         */
        Window w1 = new Window("窗口1");
        Window w2 = new Window("窗口2");
        Window w3 = new Window("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread {
    private static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(getName() + ":" + tickets);
                tickets--;
            } else {
                break;
            }
        }
    }

    public Window(String name) {
        super(name);
    }
}