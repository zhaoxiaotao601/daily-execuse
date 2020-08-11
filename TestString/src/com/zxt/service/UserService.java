package com.zxt.service;

import com.zxt.dao.impl.UserDaoImpl;

import java.sql.SQLException;

public interface UserService {
    //查询业务操作
    public void selectAllInfo() throws SQLException, ClassNotFoundException;

    //按uid查询业务
    public void selectAsUid() throws SQLException, ClassNotFoundException;

    //插入操作
    public void insertInfo() throws SQLException, ClassNotFoundException;

    //根据id删除用户
    public void deleteInfo() throws SQLException, ClassNotFoundException;

    //根据uid修改用户财产
    public void modifyInfo() throws SQLException, ClassNotFoundException;
}
