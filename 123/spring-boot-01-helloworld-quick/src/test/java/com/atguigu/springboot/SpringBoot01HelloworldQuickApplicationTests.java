package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 *
 */

@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {
    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
