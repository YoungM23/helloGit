package com.atguigu.multiThread.test1;

/**
 * @author: zqh
 * @date: 2025年03月14日15:53
 */
public class TicketWindow extends Thread{
    /**
     * 一共1000张电影票，可以在2个窗口领取，假设每次领取时间为3000毫秒。
     * 要求：请用多线程模拟卖票过程并打印剩余电影票数量
     */
    
    public static int tickets = 1000;
    
    public static final Object LOCK = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (LOCK) {
                if(tickets == 0){
                    break;
                }else {
                    //电影票数量-1
                    tickets --;
                    //打印剩余电影票
                    System.out.println(Thread.currentThread().getName() + "卖了1张票,剩余票数：" + tickets);
                    //睡3秒钟
                    try {
                        sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                
            }
        }
    }
}
