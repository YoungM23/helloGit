package com.yongm.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

/**
 * @author zqh
 * @date 2022-05-05 16:29
 */
@RestController
@RequestMapping(value = "/redisTest")
public class RedisTestController {
    @Autowired
    private RedisTemplate redisTemplate;
    
    @GetMapping(value = "getName")
    public String testRedis(){
        //在redis中设置值
        redisTemplate.opsForValue().set("firstName","Jordan");

        //获取值
        String name = (String) redisTemplate.opsForValue().get("firstName");
        return name;
    }
}
