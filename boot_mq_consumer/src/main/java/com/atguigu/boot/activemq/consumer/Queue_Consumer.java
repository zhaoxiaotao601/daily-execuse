package com.atguigu.boot.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Classname Queue_Consumer
 * @Description TODO
 * @Date 2020/6/10 16:38
 * @Created by Administrator
 */
@Component
public class Queue_Consumer {
    @JmsListener(destination = "${myQueueName}")
    public void receive(TextMessage textMessage)throws JMSException {
        System.out.println("*****消费者收到消息："+textMessage.getText());
    }
}
