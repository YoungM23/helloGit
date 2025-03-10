package com.atguigu.multiThread;

/**
 * @author: zqh
 * @date: 2025年02月21日16:52
 */
public class TicketsSeller implements Runnable{
    
    static int ticket = 0;
    
    static Object obj = new Object();
    @Override
    public void run() {
            while (true) {
                synchronized (obj) {
                    if (ticket < 100) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        ticket  ++;
                        System.out.println(Thread.currentThread().getName() + ":卖出第" + ticket +"张票" );
                    }else{
                        break;
                    }
                }
            }
    }
}
