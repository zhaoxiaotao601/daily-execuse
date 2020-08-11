package com.atguigu.boot.topic.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.UUID;

/**
 * @Classname Topic_Produce
 * @Description TODO
 * @Date 2020/6/10 18:31
 * @Created by Administrator
 */
@Component
public class Topic_Produce {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Scheduled(fixedDelay = 3000)
    public void produceTopic() {
        jmsMessagingTemplate.convertAndSend(topic, "主题消息：" + UUID.randomUUID().toString().substring(0, 6));
    }

}
