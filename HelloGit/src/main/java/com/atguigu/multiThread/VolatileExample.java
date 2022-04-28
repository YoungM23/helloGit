package com.atguigu.multiThread;

/**
 * volatile关键字使用，以及多线程问题
 * 
 * 内存可见性是指当一个线程修改了某个变量的值，其它线程总是能知道这个变量变化。
 * 也就是说，如果线程 A 修改了共享变量 V 的值，那么线程 B 在使用 V 的值时，能立即读到 V 的最新值。
 * 
 * 可见性问题的解决方案
 * 我们如何保证多线程下共享变量的可见性呢？也就是当一个线程修改了某个值后，对其他线程是可见的。
 *
 * 这里有两种方案：加锁 和 使用 volatile 关键字。
 * 
 * @author zqh
 * @date 2022-04-28 16:23
 */
public class VolatileExample {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        
        myThread.start();//开启线程

        // 主线程执行
        for (; ; ) {
            if (myThread.isFlag()) {
                //如果变量不用volatile关键字，永远不会输出下面这一行
                System.out.println("主线程访问到 flag 变量");
            }
        }
    }
}

class MyThread extends Thread{
    private volatile boolean flag = false;
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);//睡眠1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        flag=true;

        System.out.println("flag = " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
