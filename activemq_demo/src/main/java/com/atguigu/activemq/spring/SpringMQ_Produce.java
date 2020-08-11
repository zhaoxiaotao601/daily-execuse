package com.atguigu.activemq.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @Classname SpringMQ_producer
 * @Description TODO
 * @Date 2020/6/4 20:28
 * @Created by Administrator
 */
@Service
public class SpringMQ_Produce {

    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringMQ_Produce produce = (SpringMQ_Produce) ctx.getBean("springMQ_Produce");

        produce.jmsTemplate.send((session) -> {
            TextMessage textMessage = session.createTextMessage("*****spring和activemq整合case111......");
            return textMessage;
        });
        System.out.println("**********send task over");

    }
}
