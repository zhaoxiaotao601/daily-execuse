package com.atguigu.boot.activemq.topic.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.JmsException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Classname Topic_Consumer
 * @Description TODO
 * @Date 2020/6/10 18:57
 * @Created by Administrator
 */
@Component
public class Topic_Consumer {

    @JmsListener(destination = "${myTopic}")
    public void receive(TextMessage test) throws JMSException {

        try {
            System.out.println("消费者收到订阅的主题：" + test.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
