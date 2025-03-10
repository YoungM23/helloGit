package com.atguigu.multiThread;

/**
 * @author: zqh
 * @date: 2025年02月21日16:51
 */
public class SaleTickets {
    public static void main(String[] args) {
        
        //2个注意点：
        //1. sycnhronized的使用要在循环内
        //2. 线程之间要共享票数，所以需要加锁
        
        //多线程模拟卖票
        TicketsSeller s1 = new TicketsSeller();
        TicketsSeller s2 = new TicketsSeller();
        TicketsSeller s3 = new TicketsSeller();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        
        t1.start();
        t2.start(); 
        t3.start();


    }
}
