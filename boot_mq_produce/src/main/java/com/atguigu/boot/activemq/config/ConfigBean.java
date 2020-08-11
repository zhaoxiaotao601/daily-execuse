package com.atguigu.boot.activemq.config;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


/**
 * @Classname ConfigBean
 * @Description TODO
 * @Date 2020/6/9 18:32
 * @Created by Administrator
 */
@Component
@EnableJms
public class ConfigBean {
    @Value("${myQueueName}")
    private String myQueue;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(myQueue);
    }

}
