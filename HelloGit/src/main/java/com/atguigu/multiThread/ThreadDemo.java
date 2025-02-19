package com.atguigu.multiThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: zqh
 * @date: 2025年02月19日19:04
 */
public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        /*
         *实现多线程的3种方式
         */
//        useMultiThread();

        /*
         * 多线程的常见成员方法
         */ 

//        normalMethod();


    }

    private static void useMultiThread() {
        //1.继承Thread类
        TestThread testThread = new TestThread();
        testThread.start();

        //2.实现Runnable接口
        //        MyRunnable r = new MyRunnable();
        //        Thread t = new Thread(r);
        //        t.start();

        //3.实现Callable接口，并使用FutureTask类来执行线程
        //        testCallable();
    }

    private static void normalMethod() {
        //        testMethod();

        //设置线程优先级
        Thread t0 = new Thread(new MyRunnable());
        Thread t1 = new Thread(new MyRunnable());
//        t0.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t0.start();
//        t1.start();

        /*
         * 多线程的特殊线程
         */
        //守护线程:主线程结束，守护线程也结束
//        t1.setDaemon(true);
//        t0.start();
//        t1.start();
        //礼让线程 Thread.yield()

        //插入线程  
    }

    private static void testMethod() throws InterruptedException {
        //当前线程
        Thread t = Thread.currentThread();

        //获取线程名
        String tName = t.getName();
        System.out.println("线程名：" + tName);
        //设置线程名
        t.setName("自定义的线程名");
        System.out.println(t.getName());
        //线程休眠
        //哪条线程执行到这里，哪条线程就开始休眠
        Thread.sleep(3000);

        System.out.println(t.getName() + "休眠结束");
    }

    private static void testCallable() {
        MyCallable c = new MyCallable();
        FutureTask<Integer> task = new FutureTask<Integer>(c);
        Thread t = new Thread(task);
        t.start();
        try {
            Integer i = task.get();
            System.out.println("task result: " + i);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
