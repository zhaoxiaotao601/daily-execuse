package com.zxt.dao.impl;

import com.zxt.po.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserDao {
    //查询所有信息
    public ArrayList<User> selectAll() throws SQLException, ClassNotFoundException;

    //根据用户id查询信息
    public User selectAsUid(int uid) throws ClassNotFoundException, SQLException;

    //添加用户
    public int insertInfo(int uid, String uname, int upassword, int umoney) throws ClassNotFoundException, SQLException;

    //根据id删除用户
    public int deleteInfo(int uid) throws ClassNotFoundException, SQLException;

    //根据id修改用户存款
    public int modifyInfo(int uid, int umoney) throws ClassNotFoundException, SQLException;
}
