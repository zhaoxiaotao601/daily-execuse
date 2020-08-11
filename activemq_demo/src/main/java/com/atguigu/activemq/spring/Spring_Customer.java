package com.atguigu.activemq.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @Classname Spring_Customer
 * @Description TODO
 * @Date 2020/6/4 20:29
 * @Created by Administrator
 */
@Service
public class Spring_Customer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Spring_Customer customer = (Spring_Customer) ctx.getBean("spring_Customer");

        String retValue = (String) customer.jmsTemplate.receiveAndConvert();

        System.out.println("*****消费者收到的消息："+retValue);

    }
}
