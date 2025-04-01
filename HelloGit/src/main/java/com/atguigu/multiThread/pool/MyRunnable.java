package com.atguigu.multiThread.pool;

/**
 * @author: zqh
 * @date: 2025年03月20日16:44
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
