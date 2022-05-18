package com.atguigu.lambda;/**
 * Created by
 *
 * @author Qinghui
 * @date 7:42 上午  2022/5/18
 * @description
 */

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.SplittableRandom;
import java.util.function.Consumer;

/**
 * @author: zqh
 * @date: 2022年05月18日7:42 上午
 */
public class LambdaTest1 {
    //语法格式一：无参，无返回值
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("无参数，无返回值类型");
            }
        };
        
        r1.run();

        System.out.println("==========");
        
        Runnable r2 = () -> {
            System.out.println("lambda写法，无参数，无返回值类型");
        };
        
        r1.run();
    }
    //语法格式二：Lambda 需要一个参数，但是没有返回值。
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么");

        System.out.println("==========");

        System.out.println("lambda写法");
        Consumer<String> con1 = (String s) ->{
            System.out.println(s);
        };
        
        con1.accept("一个是听得人当真了，一个是说的人当真了");
    }

    //语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void test3(){

        System.out.println("lambda写法");
        Consumer<String> con1 = (String s) ->{
            System.out.println(s);
        };

        con1.accept("一个是听得人当真了，一个是说的人当真了");

        System.out.println("============");
        
        Consumer<String> con2 = (s) -> {
            System.out.println("省略类型写法");
            System.out.println(s);
        };
        
        con2.accept("hhhhhhhhhhh");
        
    }

    //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test5(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        } ;
        
        con.accept("hello world!");

        System.out.println("==========");
        
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        System.out.println("lambda写法，省略参数小括号");
        
        con.accept("hello China");
    }

    //语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test6(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                
                return o1.compareTo(o2);
            }
        };

        System.out.println(com1.compare(11,12));
        System.out.println("=================");
        
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };

        int compare = com2.compare(22, 33);
        System.out.println(compare);
    }

    //语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test7(){
        Comparator<Integer> com1 = (o1,o2) ->{
            return o1.compareTo(o2);
        };

        System.out.println(com1.compare(11,22));

        System.out.println("========" +
                "");
        
        Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);

        System.out.println(com2.compare(33,22)); 
    }
    
    @Test
    public void test8(){
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("Good morning qh");

        System.out.println("==========" +
                "");
        
        
        Consumer<String> con2 = s -> System.out.println(s);
        
        con2.accept("Morning!!!");
    }
    
    
}


















