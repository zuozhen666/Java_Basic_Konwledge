package com.zuozhen.thread;

import java.util.concurrent.*;

public class NewThreadCreateWay {
    /*
    新的线程创建方式：
    way3：实现Callable接口(call方法)
        功能更加强大，可以有返回值，可以抛出异常，可以支持泛型...
     */
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        FutureTask futureTask = new FutureTask<>(newThread);
        new Thread(futureTask).start();

        try {
            //get返回值即为call返回值
            Object obj = futureTask.get();
            System.out.println("sum = " + obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        /*
        way4：使用线程池
         */
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //...
    }
}

class NewThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
