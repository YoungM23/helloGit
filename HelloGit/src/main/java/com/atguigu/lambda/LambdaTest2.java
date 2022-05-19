package com.atguigu.lambda;/**
 * Created by
 *
 * @author Qinghui
 * @date 8:29 上午  2022/5/18
 * @description
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author: zqh
 * @date: 2022年05月18日8:29 上午
 */
public class LambdaTest2 {
    
    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
    
    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("买了瓶水，价格：" + aDouble);
            }
        });

        System.out.println("==============");
        
        happyTime(100,aDouble -> System.out.println("lambda写法，价格：" + aDouble));
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre){

        ArrayList<String> filterList = new ArrayList<>();
        
        for(String s : list){
            if (pre.test(s)){
                filterList.add(s);
            }
        }
        
        return filterList;
        
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京", "南京", "成都", "厦门");

        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(filterStrs);

        System.out.println("==============");
        
        List<String> filterStrs1 = filterString(list,s -> s.contains("京"));
        System.out.println(filterStrs1);

    }
}
