package com.atguigu.multiThread.waitandnotify;

/**
 * @author: zqh
 * @date: 2025年03月10日20:03
 */
public class Foodie implements Runnable{
    @Override
    public void run() {
        /**
         * 1.循环
         * 2.同步代码块
         * 3.判断是否满足结束循环条件（结束）
         * 4.判断是否满足结束循环条件（未结束结束）
         */
        
        while (true){
            synchronized (Desk.lock){
                //判断是否满足结束循环条件（结束）
                if(Desk.num == 0){
                    break;
                }else{
                    //判断是否满足结束循环条件（未结束结束）
                    if(Desk.hasFood == 1){
                        Desk.hasFood = 0;
                        Desk.num--;
                        System.out.println(Thread.currentThread().getName() + "吃了1份食物,还能再吃" + Desk.num + "份");
                        Desk.lock.notifyAll();//通知厨师可以做菜了
                    }else{
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
