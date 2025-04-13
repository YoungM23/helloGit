package com.atguigu.multiThread.test1;

/**
 * @author: zqh
 * @date: 2025年03月14日16:31
 */
public class Number extends Thread{

    /**
     * 同时开启2个线程，共同获取1-100之间的所有数字。
     * 要求：将输出所有的奇数
     */
    public static int num = 0;
    
    public static final Object LOCK = new Object();
    
    @Override
    public void run() {
        while (true){
            synchronized (LOCK){
                num ++;
                if (num > 100){
                    System.out.println(Thread.currentThread().getName() + " : "+"num > 100,结束");
                    break;
                }else {
                    if (num % 2!= 0){
                        System.out.println(Thread.currentThread().getName() + " : " + num);
                    }
                }
            }
        }
    }
}
