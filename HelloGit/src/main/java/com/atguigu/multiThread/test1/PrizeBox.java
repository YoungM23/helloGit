package com.atguigu.multiThread.test1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: zqh
 * @date: 2025年04月02日12:16
 */
public class PrizeBox extends Thread{
    ArrayList<Integer> pool = new ArrayList<>();

    public PrizeBox(ArrayList<Integer> pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        /**
         * 有一个抽奖池，该抽奖池中存放了奖励的金额，奖项为[10,5,20,100,500,800,2,80,300,700]
         * 创建2个抽奖箱，设置线程名称分别为“抽奖箱1”，“抽奖箱2”
         * 随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
         * 每次抽出一个奖项就打印一个
         * 抽奖箱1产生了一个10大奖
         */
        
        //循环
        //同步代码
        //判断共享数据是否到达末尾
        while(true){
            synchronized (PrizeBox.class){
                if (pool.size() == 0){
                    break;
                }else{
                    Collections.shuffle(pool);
                    Integer prize = pool.remove(0);
                    System.out.println(currentThread().getName() + "产生了一个" + prize + "元大奖");
                }
                    
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
