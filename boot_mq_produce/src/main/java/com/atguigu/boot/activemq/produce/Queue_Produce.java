package com.atguigu.boot.activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

/**
 * @Classname Queue_Produce
 * @Description TODO
 * @Date 2020/6/9 18:32
 * @Created by Administrator
 */
@Component
public class Queue_Produce {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void produceMsg() {
        jmsMessagingTemplate.convertAndSend(queue, "*****:" + UUID.randomUUID().toString().substring(0, 6));
    }

    //间隔时间3秒定投
    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled() {
        jmsMessagingTemplate.convertAndSend(queue, "*****Schedulec:" + UUID.randomUUID().toString().substring(0, 6));
        System.out.println("*****produceMsgScheduled send ok");
    }
}
