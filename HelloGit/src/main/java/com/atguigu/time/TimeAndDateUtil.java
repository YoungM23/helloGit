package com.atguigu.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zqh
 * @date 2022-12-12 16:42
 */
public class TimeAndDateUtil {

    /**
     * 获取当前日期时间，格式： 2022-12-12 16:41:23
     *
     * @return
     */
    public static String getCurrentTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//2022-12-12 16:41:23
        String date = df.format(new Date());//
        System.out.println("时间：" + date.toString());
        return date;
    }

    /**
     * 获取当前日期时间，格式： 20230109004448
     *
     * @return
     */
    public static String getTimeString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//
        String date = df.format(new Date());//
        System.out.println("时间：" + date.toString());
        return date;
    }
}
