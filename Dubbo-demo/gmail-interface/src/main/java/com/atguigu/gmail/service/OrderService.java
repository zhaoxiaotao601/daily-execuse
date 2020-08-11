package com.atguigu.gmail.service;

import com.atguigu.gmail.bean.UserAddress;

import java.util.List;

/**
 * @Classname OrderService
 * @Description TODO
 * @Date 2020/6/13 18:16
 * @Created by Administrator
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */

    public List<UserAddress> initOrder(String userId);
}
