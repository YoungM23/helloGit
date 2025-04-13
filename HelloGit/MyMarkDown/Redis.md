# Redis

## 简介

git更改
> 非关系型数据库，读写速度快，因为数据是储存在内存中的，常常是用来做缓存的。Redis也支持数据的持久化
>
> 是高性能的key-value数据库，可以简单的看做map。
>
>  Redis 通常被称为数据结构服务器，因为值（value）可以是字符串(String)、哈希(Hash)、列表(list)、集合(sets)和有序集合(sorted sets)等类型。 

## 安装

### Windows

 **下载地址：**https://github.com/tporadowski/redis/releases。 下载zip包

启动：

 打开一个 **cmd** 窗口 使用 cd 命令切换到Redis目录

```
redis-server.exe redis.windows.conf
```

Redis就启动起来了

### Linux

见菜鸟教程：https://www.runoob.com/redis/redis-install.html

## 命令行操作方法及常用命令

登陆：

切换到Redis目录

```
redis-cli.exe -h 127.0.0.1 -p 6379
```



设置键值对：

```
set mykey abc
```

取出键值对

```
get mykey
```



## Java开发使用

#### jedis使用

- 添加Jedis依赖

  ```xml
          <!--        jedis-->
          <dependency>
              <groupId>redis.clients</groupId>
              <artifactId>jedis</artifactId>
              <version>3.6.0-RC1</version>
          </dependency>
  ```

  

- 连接到Redis

```java
        //连接Redis
//        Jedis jedis = new Jedis();
        Jedis jedis = new Jedis("134.175.79.173");
        // 如果 Redis 服务设置了密码，需要下面这行，没有就不需要
         jedis.auth("1111"); 
        System.out.println("服务正在运行: "+jedis.ping());
```

- 对字符串string的操作

```java 
		//存储数据，String类型
        jedis.set("James", "23");
        jedis.set("Kobe", "24");

        //获取数据
        System.out.println("James的球衣号码： " + jedis.get("James"));
        System.out.println("Kobe的球衣号码： " + jedis.get("Kobe"));
```



- 对List的操作

```java
        //存储数据，list类型
        jedis.lpush("list","T-mac");
        jedis.lpush("list","LBJ");
        jedis.lpush("list","KB");
        //遍历list
        List<String> starList = jedis.lrange("list", 0, 2);
        for (String star : starList) {
            System.out.println("全明星球员：" + star);
        }

```



- 对keys的操作

```java
        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
```

#### springboot中使用

##### 使用StringRedisTemplate对redis数据库进行操作

添加依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>

```

opsForValue操作字符串

```java
      /**
       * 新增一个字符串类型的值,key是键，value是值。
       *
       * set(K key, V value)
       */
      public void set() {
          // 存入永久数据
          stringRedisTemplate.opsForValue().set("test2", "1");
          // 也可以向redis里存入数据和设置缓存时间
          stringRedisTemplate.opsForValue().set("test1", "hello redis", 1000, TimeUnit.SECONDS);
      }
  
      /**
       * 批量插入，key值存在会覆盖原值
       *
       * multiSet(Map<? extends K,? extends V> map)
       */
      public void multiSet() {
          Map<String,String> map = new HashMap<>(16);
          map.put("testMultiSet1", "value0");
          map.put("testMultiSet2", "value2");
          stringRedisTemplate.opsForValue().multiSet(map);
      }
  
      /**
       *  批量插入，如果里面的所有key都不存在，则全部插入，返回true，如果其中一个在redis中已存在，全不插入，返回false
       *
       *  multiSetIfAbsent(Map<? extends K,? extends V> map)
       */
      public void multiSetIfAbsent() {
          Map<String,String> map = new HashMap<>(16);
          map.put("testMultiSet4", "value1");
          map.put("testMultiSet3", "value3");
          Boolean absent = stringRedisTemplate.opsForValue().multiSetIfAbsent(map);
          System.out.println(absent);
      }
    /**
     * 获取值,key不存在返回null
     *
     * get(Object key)
     */
    public void get() {
        System.out.println(stringRedisTemplate.opsForValue().get("testMultiSet1"));
    }

    /**
     * 批量获取，key不存在返回null
     *
     * multiGet(Collection<K> keys)
     */
    public void multiGet() {
        List<String> list = stringRedisTemplate.opsForValue().multiGet(Arrays.asList("test", "test2"));
        assert list != null;
        System.out.println(list.toString());
    }

    /**
     * 获取指定字符串的长度。
     *
     * size(K key)
     */
    public void getLength() {
        Long size = stringRedisTemplate.opsForValue().size("test");
        System.out.println(size);
    }

    /**
     * 在原有的值基础上新增字符串到末尾。
     *
     * append(K key, String value)
     */
    public void append() {
        Integer append = stringRedisTemplate.opsForValue().append("test3", "database");
        System.out.println(append);
    }
```

  
