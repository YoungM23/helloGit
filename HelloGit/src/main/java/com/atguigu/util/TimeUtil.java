package com.atguigu.util;

/**
 * @author zqh
 * @date 2022-09-01 15:49
 */
public class TimeUtil {

    /**
     * 毫秒时间转换为string  eg:1天23小时1分钟2秒
     * @param time 毫秒数
     * @return 
     */
    public static String timeToStr(Long time){
        Long day =time / (24 * 60 * 60 * 1000);
        Long hours = time / ((60 * 60 * 1000)) % 24;
        Long min =time / (60 * 1000) % 60;
//        Long second = time / (1000) % 60;
//        Long msec = dealTime % 1000;

        String timeStr =day + "天" + hours + "小时" + min + "分钟" ;
        return timeStr;
//        System.out.println(day + "天" + hours + "小时" + min + "分钟" + second + "秒" + msec + "毫秒");
    }  
}
