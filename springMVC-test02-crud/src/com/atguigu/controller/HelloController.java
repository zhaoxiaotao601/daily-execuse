package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020/3/30 8:25
 * @Created by Administrator
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {

        return "success";
    }
}
