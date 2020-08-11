package com.zxt.mapper;

import com.zxt.pojo.Users;
import org.apache.ibatis.annotations.Insert;

public interface UsersMapper {
    @Insert("insert into users values (default,#{username},#{password},#{photo})")
    int insUsers(Users users);
}
