package com.atguigu.webservice;

import javax.xml.ws.Endpoint;

/**
 * @author zqh
 * @date 2022-10-26 14:33
 */
public class TestApi {
    public static void main(String[] args) {
        //发布接口地址
        String address="http://127.0.0.1:9999/AAA/test";
        //jdk方法实现
        Endpoint.publish(address, new WsImpl());
        System.out.println("Published successfully！");
    }
}
