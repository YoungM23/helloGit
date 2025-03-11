package com.atguigu.multiThread.waitandnotify;


/**生产者
 * @author: zqh
 * @date: 2025年03月10日20:04
 */
public class Cooker implements Runnable {
    @Override
    public void run() {
        /**
         * 1.循环
         * 2.同步代码块
         * 3.判断共享数据是否到达末尾（到达）
         * 4.判断共享数据是否到达末尾（未到达）
         */
        while (true) {
            synchronized (Desk.lock) {
                // 判断共享数据是否到达末尾（到达）
                if (Desk.num == 0) {
                    break;
                } else {
                    // 判断共享数据是否到达末尾（未到达）

                    if (Desk.hasFood == 0) {//桌上没有面了
                        //   生产者生产一个产品
                        Desk.hasFood = 1;
                        System.out.println(Thread.currentThread().getName() + "做了1碗面条");
                        // 通知等待的消费者
                        Desk.lock.notifyAll();
                    } else {//桌上已经有面了
                        try {
                            Desk.lock.wait();//用这个锁和线程绑定，唤醒的时候才会唤醒和锁绑定的线程
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
            }
        }
    }
}
