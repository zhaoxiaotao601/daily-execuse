package com.zhaoxiaotao_03_aop.aspectj.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zhaoxiaotao_03_aop.jdk.UserDao;

// 测试类
public class TestAnnotationAspectj {
    public static void main(String args[]) {
        String xmlPath =
                "com/zhaoxiaotao_03_aop/aspectj/annotation/applicationContext.xml";
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(xmlPath);
        // 1 从spring容器获得内容
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        // 2 执行方法
        userDao.addUser();
    }
}
