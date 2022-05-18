package com.atguigu.lambda;/**
 * Created by
 *
 * @author Qinghui
 * @date 8:29 上午  2022/5/18
 * @description
 */

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

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
//        happyTime(500,);
    }
}
