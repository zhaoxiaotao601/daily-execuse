package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

/**
 * @Classname TestPing
 * @Description TODO
 * @Date 2020/6/1 18:00
 * @Created by Administrator
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.1.9",6379);
        System.out.println(jedis.ping());
    }
}
