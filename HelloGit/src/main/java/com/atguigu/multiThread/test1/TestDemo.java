package com.atguigu.multiThread.test1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: zqh
 * @date: 2025年03月14日15:51
 */
public class TestDemo {
    public static void main(String[] args) {
//        test1();
        
//        test2();

//        test3();
        
//        test4();
        ArrayList<Integer> pool = new ArrayList<>();
        Collections.addAll(pool, 10, 5, 20, 100, 500, 800, 2, 80, 300, 700);

        PrizeBox prizeBox1 = new PrizeBox(pool);
        PrizeBox prizeBox2 = new PrizeBox(pool); 
        
        prizeBox1.setName("抽奖箱1");
        prizeBox2.setName("抽奖箱2");
        
        prizeBox1.start();
        prizeBox2.start();
    }

    private static void test4() {
        /**
         * 抢红包：
         * 100块，分3个包，现在5个人抢。
         * 其中红包是共享数据。5个人是5条线程。
         * 要求：用多线程模拟抢红包过程并打印每个人的抢到的红包数量。
         */

        HongBaoPerson p1 = new HongBaoPerson(1);
        HongBaoPerson p2 = new HongBaoPerson(2);
        HongBaoPerson p3 = new HongBaoPerson(3);
        HongBaoPerson p4 = new HongBaoPerson(4);
        HongBaoPerson p5 = new HongBaoPerson(5);

         
        p1.setName("线程1");
        p2.setName("线程2");
        p3.setName("线程3");
        p4.setName("线程4");
        p5.setName("线程5");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }

    private static void test3() {
        /**
         * 同时开启2个线程，共同获取1-100之间的所有数字。
         * 要求：将输出所有的奇数
         */

        Number t1 = new Number();
        Number t2 = new Number();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }

    private static void test2() {
        /**
         * 有100分礼物，两人同时发放，当剩下的礼物小于10份的时候则不再送出。
         * 利用多线程模拟该过程，并将线程的名字和礼物剩余数量打印出来
         */

        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("小明");
        p2.setName("小红");

        p1.start();
        p2.start();
    }

    private static void test1() {
        /**
         * 一共1000张电影票，可以在2个窗口领取，假设每次领取时间为3000毫秒。
         * 要求：请用多线程模拟卖票过程并打印剩余电影票数量
         */

        TicketWindow t1 = new TicketWindow();
        TicketWindow t2 = new TicketWindow();
        TicketWindow t3 = new TicketWindow();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
