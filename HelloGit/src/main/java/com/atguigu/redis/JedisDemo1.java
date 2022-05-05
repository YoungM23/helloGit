package com.atguigu.redis;/**
 * Created by
 *
 * @author Qinghui
 * @date 5:31 下午  2022/5/3
 * @description
 */

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    /**
     * 测试key
     */
    @Test
    public void demo1(){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");
        
        jedis.set("k1","v1");
        jedis.set("k2","v2");

        System.out.println("这是k1： " + jedis.get("k1"));
        System.out.println("k1是否存在：  "  + jedis.exists("k1"));
        System.out.println("k1的ttl ： " + jedis.ttl("k"));
        

        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }
    
    /**
     * 测试String
     */
    @Test
    public void demo2(){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");
        
        jedis.mset("str1","v1","str2","v2","str3","v3");
        System.out.println(jedis.mget("str1","str2","str3"));
    }    
    /**
     * 测试list
     */
    @Test
    public void demo3(){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");
        
        jedis.lpush("allStars","kobe","lbj","kyrie");
        List<String> allStars = jedis.lrange("allStars", 0, -1);

        System.out.println(allStars);
                
    }

    /**
     * 测试set
     */
    @Test
    public void demo4(){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");

        jedis.sadd("mySet","set1","set2","set3");
        Set<String> mySet = jedis.smembers("mySet");
        System.out.println(mySet);

    }
    
    /**
     * 测试hash
     */
    @Test
    public void demo5(){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");

//        jedis.hset("hash1","name","zhangsan");
//        jedis.hset("hash1","age","27");

        //获取hash对象所有map键值对
        Map<String, String> hash1 = jedis.hgetAll("hash1");
        System.out.println(hash1);
        
        //获取单个hash对象的属性值
        String name = jedis.hget("hash1", "name");
        String age = jedis.hget("hash1", "age");
        System.out.println("hash1 的name: " + name + ", age: "  + age);
        
        //获取hash对象的多个属性值
        List<String> results = jedis.hmget("hash1", "name", "age");
        System.out.println("hash对象的多个属性值： ");
        for (String result : results) {
            System.out.println(result);
        }

    }
    
     
    /**
     * 测试hash
     */
    @Test
    public void demo6(){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");

//        jedis.hset("hash1","name","zhangsan");
//        jedis.hset("hash1","age","27");

        Map<String, String> hash1 = jedis.hgetAll("hash1");
        System.out.println(hash1);
        String name = jedis.hget("hash1", "name");
        String age = jedis.hget("hash1", "age");
        System.out.println("hash1 的name: " + name + ", age: "  + age);

    }
    
      
    /**
     * 测试zset
     */
    @Test
    public void demo7(){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");

        jedis.zadd("zset1",100,"java");
        jedis.zadd("zset1",80,"php");
        jedis.zadd("zset1",90,"c++");

        Set<String> zset1 = jedis.zrange("zset1", 0, -1);

        for (String s : zset1) {
            System.out.println(s);

        }

    }
    
    
}
