package com.atguigu.multiThread.test1;

/**
 * @author: zqh
 * @date: 2025年03月14日16:15
 */
public class Person extends Thread{
    /**
     * 有100分礼物，两人同时发放，当剩下的礼物小于10份的时候则不再送出。
     * 利用多线程模拟该过程，并将线程的名字和礼物剩余数量打印出来
     */
    public static int giftNum = 100;
    
    public static final Object LOCK = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (LOCK){
                if (giftNum < 10){
                    System.out.println("礼品数量为："+giftNum+",少于10份，停止发放。");
                    break;
                }else {
                    giftNum--;
                    System.out.println(Thread.currentThread().getName() + "发放了1份礼物，剩余" + giftNum + "份");
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
