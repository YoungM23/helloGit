package com.atguigu.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedisStringJava {
    public static void main(String[] args) {
        RedisStringJava redisStringJava = new RedisStringJava();
        
        //jedisTest
//        redisStringJava.jedisTest();
        
        //stringRedisTemplate
        redisStringJava.stringRedisTemplateTest();
        
        
    }
    
    private void  stringRedisTemplateTest(){
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        String james = stringRedisTemplate.opsForValue().get("James");
        System.out.println(james);
    }
    
    private void jedisTest(){
        //连接Redis
        Jedis jedis = new Jedis();
//        Jedis jedis = new Jedis("134.175.79.173");
        // 如果 Redis 服务设置了密码，需要下面这行，没有就不需要
//        jedis.auth("exo720181021Lx");
        System.out.println("服务正在运行: "+jedis.ping());



        //存储数据，String类型
        jedis.set("James", "23");
        jedis.set("Kobe", "24");

        //获取数据
        System.out.println("James的球衣号码： " + jedis.get("James"));
        System.out.println("Kobe的球衣号码： " + jedis.get("Kobe"));
        System.out.println("*********************************");
        //存储数据，list类型
        jedis.lpush("list","T-mac");
        jedis.lpush("list","LBJ");
        jedis.lpush("list","KB");

        Long time = jedis.ttl("James");
        System.out.println("James有效期："+ time);

        //遍历list
        List<String> starList = jedis.lrange("list", 0, 2);
        for (String star : starList) {
            System.out.println("全明星球员：" + star);
        }
        System.out.println("*********************************");

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }
}
