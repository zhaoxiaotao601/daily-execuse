package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

/**
 * @Classname TestAPI
 * @Description TODO
 * @Date 2020/6/1 18:07
 * @Created by Administrator
 */
public class TestAPI {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.1.9",6379);

        //jedis.set("k2","赵小涛");

        System.out.println(jedis.keys("*"));

    }
}
