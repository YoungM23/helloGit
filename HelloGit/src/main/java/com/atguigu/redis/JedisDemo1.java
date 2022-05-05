package com.atguigu.redis;/**
 * Created by
 *
 * @author Qinghui
 * @date 5:31 下午  2022/5/3
 * @description
 */

import redis.clients.jedis.Jedis;

/**
 * @author: zqh
 * @date: 2022年05月03日5:31 下午
 */
public class JedisDemo1 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");  
        String pong = jedis.ping();
        System.out.println(pong);
        
        jedis.close();
    }
}
