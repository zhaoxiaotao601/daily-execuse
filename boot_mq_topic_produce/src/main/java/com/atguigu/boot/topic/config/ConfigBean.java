package com.atguigu.boot.topic.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * @Classname ConfigBean
 * @Description TODO
 * @Date 2020/6/10 18:31
 * @Created by Administrator
 */
@Component
public class ConfigBean {

    @Value("${myTopic}")
    private String topicName;

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(topicName);
    }

}
