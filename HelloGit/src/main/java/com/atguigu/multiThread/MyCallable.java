package com.atguigu.multiThread;

import java.util.concurrent.Callable;

/**
 * @author: zqh
 * @date: 2025年02月19日19:19
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
