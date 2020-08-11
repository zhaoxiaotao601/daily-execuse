package com.zxt.service.impl;

import com.zxt.mapper.UsersMapper;
import com.zxt.pojo.Users;
import com.zxt.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public int insRegister(Users users) {
        return usersMapper.insUsers(users);
    }
}
