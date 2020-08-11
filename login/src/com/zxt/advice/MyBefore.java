package com.zxt.advice;

import com.zxt.pojo.Users;
import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Date;

public class MyBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
        Users users = (Users) arg1[0];
        Logger logger = Logger.getLogger(MyBefore.class);
        logger.info(users.getUsername() + "在" + new Date().toLocaleString() + "进行登陆");

    }
}
