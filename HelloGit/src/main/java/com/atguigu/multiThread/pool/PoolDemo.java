package com.atguigu.multiThread.pool;

import java.util.concurrent.*;

/**
 * @author: zqh
 * @date: 2025年03月20日16:44
 */
public class PoolDemo {
    public static void main(String[] args) {
        test1();
        /**
         * 线程池参数
         * 1.核心线程数：线程池中固定的线程，不会自动销毁
         * 2.最大线程数：等于核心线程数＋临时线程数
         * 3.线程存活时间：临时线程的空闲时间，超过这个时间，临时线程就会销毁
         * 4.线程存货时间单位
         * 5.线程队列
         * 6.拒绝策略
         * 7.线程工厂：创建线程的工厂类 
         * 
         * 线程使用策略
         * 1.当任务数小于核心线程数时候，线程池创建或者取用核心线程
         * 2.当任务数大于核心线程数，小于最大线程数时候，任务进入队列等待
         * 3.当任务数大于核心线程数+队列大小时候，线程池创建临时线程来执行任务
         * 4.当临时线程数达到最大线程数时候，线程池拒绝任务，使用拒绝策略来处理
         */
        
        /**
         * 线程池的作用：
         * 1.降低资源消耗：减少线程创建和销毁的开销，降低系统资源消耗
         * 2.提高响应速度：任务到达时，线程池中线程就已经准备就绪，立即执行，不用等待线程创建
         * 3.提高线程的可管理性：线程池可以方便的管理线程，包括创建线程、销毁线程、监控线程等
         */
        
        new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

    }

    private static void test1() {
        //1.创建线程池
        //没有上线的线程池
//        ExecutorService pool1= Executors.newCachedThreadPool();
//        //2.提交任务
//        pool1.submit(new MyRunnable()); 
//        //3.关闭线程池
//        pool1.shutdown();
        //创建固定大小的线程池
        ExecutorService pool2 = Executors.newFixedThreadPool(3);
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());

        pool2.shutdown();
    }
}
