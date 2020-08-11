package com.atguigu.boot.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Classname MainApp_Produce
 * @Description TODO
 * @Date 2020/6/9 18:33
 * @Created by Administrator
 */
@SpringBootApplication
@EnableScheduling
public class MainApp_Produce {
    public static void main(String[] args) {
        SpringApplication.run(MainApp_Produce.class, args);
    }
}
