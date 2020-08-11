package com.atguigu.gmail.controller;

import com.atguigu.gmail.bean.UserAddress;
import com.atguigu.gmail.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname OrderController
 * @Description TODO
 * @Date 2020/6/14 15:23
 * @Created by Administrator
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);

    }
}
