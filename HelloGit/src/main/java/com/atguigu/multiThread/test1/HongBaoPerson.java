package com.atguigu.multiThread.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zqh
 * @date: 2025年03月14日16:49
 */
public class HongBaoPerson  extends Thread{
    /**
     * 抢红包：
     * 100块，分3个包，现在5个人抢。
     * 其中红包是共享数据。5个人是5条线程。
     * 要求：用多线程模拟抢红包过程并打印每个人的抢到的红包数量。
     */
    public static Double money = 100.0;
    
    public static Integer num = 3;
    
    public static final Object  LOCK = new Object();
    
    public static List<Integer> ids = new ArrayList<Integer>();

    private Integer id;

    public HongBaoPerson(Integer id) {
        this.id = id;
    }
    
    public Integer getPerId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            //每个人只能抢一次
            if (ids.contains(id)){
                System.out.println("线程" + id + "：抢到过红包了！");
                return;
            }
            
            //表示已经抢过了
            ids.add(id);
            //当红包金额为0时，线程结束
            if (num == 0){
                System.out.println("线程" + id + "：没有抢到");
                return;
            }
            
            double amount = 0.0;
            if (num == 1){
                amount = Math.round(money * 100.0) / 100.0;
            }else {
                // 生成0到100之  f 间的随机数
                double randomNumber = Math.random() * money;
                // 保留两位小数
                amount = Math.round(randomNumber * 100.0) / 100.0; 
            }
            System.out.println("线程" + id + "：抢到红包：" + amount + "元！");
            money = money - amount;
            num --;
        
        }
    }
}
