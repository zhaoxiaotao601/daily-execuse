package com.atguigu.gmail.service.impl;


import com.atguigu.gmail.bean.UserAddress;
import com.atguigu.gmail.service.OrderService;
import com.atguigu.gmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OrderServiceImpl
 * @Description TODO
 * @Date 2020/6/13 18:18
 * @Created by Administrator
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("用户id：" + userId);
        //1、查询用户收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList
        ) {
            System.out.println(userAddress.getUserAddress());

        }

    }
}
