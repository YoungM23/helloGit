package com.atguigu;

/**
 * @author zqh
 * @date 2022-05-13 16:43
 */
public class FinallyTest {
    public static void main(String[] args) {
        System.out.println(test());//最后打印结果为3
    }
    
    public static int test(){
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            //事实证明：如果try{}中有return语句，finally语句中也有return的话，最后返回的是finally中的值
            return 3;
        }
    }
}
