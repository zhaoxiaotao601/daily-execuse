package com.zxt.controller;

import com.zxt.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("{page}")
    public String main(@PathVariable String page) {
        System.out.println("restful");
        return page;
    }
    @RequestMapping("login")

    public String login(Users users,HttpSession session){
        if (users.getUsername().equals("admin")&&users.getPassword().equals("123")){

        }

    }
}
