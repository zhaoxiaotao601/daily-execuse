package com.zhaoxiaotao_03_aop.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zhaoxiaotao_03_aop.jdk.UserDao;

// 测试类
public class ProxyFactoryBeanTest {
    public static void main(String args[]) {
        String xmlPath = "com/zhaoxiaotao_03_aop/factorybean/applicationContext.xml";
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(xmlPath);
        // 从Spring容器获得内容
        UserDao userDao =
                (UserDao) applicationContext.getBean("userDaoProxy");
        // 执行方法
        userDao.addUser();
        userDao.deleteUser();
    }
}
