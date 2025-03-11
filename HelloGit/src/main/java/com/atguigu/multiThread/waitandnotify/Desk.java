package com.atguigu.multiThread.waitandnotify;

/**
 * @author: zqh 
 * @date: 2025年03月10日20:03
 */

public class Desk {
    //需要有1个锁
    public static  Object lock = new Object();
    //需要有1个标识，表示桌上是否有食物
    public static int hasFood = 0;
    //总个数
    public static int num = 10;
}
