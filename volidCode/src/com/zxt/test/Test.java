package com.zxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        Demo demo = new Demo();
//        demo.demo1();
//        demo.demo2();
//        demo.demo3();
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = ac.getBean("demo", Demo.class);
        demo.demo1();
        demo.demo2();
        demo.demo3();

    }
}
