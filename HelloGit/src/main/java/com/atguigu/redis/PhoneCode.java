package com.atguigu.redis;

import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * @author zqh
 * @date 2022-05-05 13:49
 */
public class PhoneCode {
    /**
     * 8.1.完成一个手机验证码功能
     * 要求：
     * 1、输入手机号，点击发送后随机生成6位数字码，2分钟有效
     * 2、输入验证码，点击验证，返回成功或失败
     * 3、每个手机号每天只能输入3次
     */
    public static void main(String[] args) {

        //获取验证码
//        verifyCode("15800001113");
        
        //验证验证码
        getRedisCode("15800001113","886425");
    }

    //1 生成6位数字验证码
    public static String getCode(){
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            //返回0到9的随机数
            int nextInt = random.nextInt(10);
            code +=nextInt;
        }

        System.out.println("验证码： " +  code);
        return code;
    }
    
    //2 每个手机每天只能发送三次，验证码放到redis中，设置过期时间120
    //发送验证码，存redis
    public static void verifyCode(String phone){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");

        //拼接key
        //手机发送次数key
        String countKey = "VerifyCode" + phone + ":count";
        //手机验证码的key
        String codeKey = "VerifyCode" + phone + ":code";

        String count = jedis.get(countKey); 
        if (count == null){//24H内第一次发送
            //次数和验证码存redis
            jedis.setex(countKey,24*60*60,"1");
            
        }else if(Integer.parseInt(count)  <= 2){//24H内未超过3次发送
            //次数自增1
            jedis.incr(countKey);
        }else {//超过3次
            System.out.println("今天发送次数已经超过三次");
            jedis.close();
            return;
        }
        //发送验证码放到redis里面
        jedis.setex(codeKey,120,getCode());
        jedis.close();
        
    }
    //3 验证码校验
    public static void getRedisCode(String phone,String code){
        Jedis jedis = new Jedis("162.14.78.166",6379);
        jedis.auth("201311");

        String codeKey = "VerifyCode" + phone + ":code";
        String redisCode = jedis.get(codeKey);
        
        if (redisCode == null){
            System.out.println("没有该手机的验证码");
            jedis.close();
            return;
        }
        
        if(redisCode.equals(code)){
            System.out.println("验证成功");
        }else { 
            System.out.println("验证失败");
        }
        jedis.close();

    }
}
