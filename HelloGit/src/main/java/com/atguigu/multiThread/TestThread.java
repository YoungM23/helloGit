package com.atguigu.multiThread;

/**
 * @author: zqh
 * @date: 2025年02月19日19:07
 */
public class TestThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - " + i);
        }
    }
}
