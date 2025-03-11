package com.atguigu.multiThread.waitandnotify;

/**
 * @author: zqh
 * @date: 2025年03月10日20:00
 */
public class ThreadDemo {

    public static void main(String[] args) {
        /**
         * 关键知识点：
         * 1.wait和notify方法，都必须用他们共同使用的锁对象来调用，否则会出现IllegalMonitorStateException异常。
         * 2.wait方法使得当前线程暂停，直到被notify方法唤醒，或者超时。
         * 3.notify方法唤醒一个正在等待该对象的线程，使其从wait方法中返回。
         * 4.notifyAll方法唤醒所有正在等待该对象的线程，使其全部从wait方法中返回。
         */
        
        Thread t1 = new Thread(new Cooker());
        Thread t2 = new Thread(new Foodie());
        
        t1.setName("厨师");
        t2.setName("食客");
        
        t1.start();
        t2.start();
    }
        
}
