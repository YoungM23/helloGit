package com.atguigu;

import org.junit.jupiter.api.Test;

/**
 * @author zqh
 * @date 2022-05-13 15:54
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println(test(1));
    }

    /**
     * 如果匹配的case  逻辑中 没有break的话，会依次执行后面的case中的语句
     * @param i
     * @return
     */
    public static int test(int i){
        
        int result = 0;
        
        switch(i){
            case 0:
                result =result +1;
            case 1:
                result =result + i*2;
            case 2:
                result =result + 2;
            case 3:
                result= result +3;
            case 4:
                result = result +4;
        }
        return result;
    }
}
