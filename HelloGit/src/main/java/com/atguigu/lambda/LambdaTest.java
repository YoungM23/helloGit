package com.atguigu.lambda;


import org.junit.jupiter.api.Test;

import java.util.Comparator;

/**
 * @author: zqh
 * @date: 2022年05月18日7:01 上午
 */
public class LambdaTest{
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("接口实现类，重写run方法");
            }
        };
        
        r1.run();


        System.out.println("======================");
        
        Runnable r2 = () -> System.out.println("这是lambda表达式结果");
        
        r2.run();
    }
    
    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare1 = com1.compare(12, 21);
        System.out.println("普通写法的比较器：");
        System.out.println(compare1);

        System.out.println("====================");

        System.out.println("lambda表达式写法的比较器：");
        
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);

        int compare2 = com2.compare(32, 21);
        System.out.println(compare2);

        System.out.println("==============");
        //方法引用
        Comparator<Integer> com3 = Integer ::compare;

        int compare3 = com3.compare(32, 21);

        System.out.println(compare3);
        
        

    }
}
