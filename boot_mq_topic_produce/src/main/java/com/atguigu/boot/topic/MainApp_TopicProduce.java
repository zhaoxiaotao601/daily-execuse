package com.atguigu.boot.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Classname MainApp_TopicProduce
 * @Description TODO
 * @Date 2020/6/10 18:30
 * @Created by Administrator
 */
@SpringBootApplication
@EnableScheduling
public class MainApp_TopicProduce {
    public static void main(String[] args) {
        SpringApplication.run(MainApp_TopicProduce.class, args);
    }
}
