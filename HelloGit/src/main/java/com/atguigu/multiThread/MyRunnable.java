package com.atguigu.multiThread;

/**
 * @author: zqh
 * @date: 2025年02月19日19:15
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - " + i);
        }
    }
}
