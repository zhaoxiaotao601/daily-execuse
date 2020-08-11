package com.zxt.service.impl;

import com.zxt.mapper.UsersMapper;
import com.zxt.pojo.Users;
import com.zxt.service.UsersService;

public class UsersServiceImpl implements UsersService {
    private UsersMapper usersMapper;

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public Users login(Users users) {

        return usersMapper.selByUsersPwd(users);
    }
}
