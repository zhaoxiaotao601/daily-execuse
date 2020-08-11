package com.atguigu.gmail;

import com.atguigu.gmail.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Classname MainApplication
 * @Description TODO
 * @Date 2020/6/13 21:21
 * @Created by Administrator
 */
public class MainApplication {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("调用完成。。。");

        System.in.read();
    }
}
