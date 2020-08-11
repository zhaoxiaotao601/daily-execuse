package com.zxt.service;

import com.zxt.dao.impl.UserDao;
import com.zxt.dao.impl.UserDaoImpl;
import com.zxt.po.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    UserDao ud = new UserDaoImpl();

    //查询业务操作
    public void selectAllInfo() throws SQLException, ClassNotFoundException {

        ArrayList<User> list = ud.selectAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("用户id"+"\t\t\t"+"用户名"+"\t\t\t"+"用户密码"+"\t\t\t"+"用户存款");
            System.out.println(list.get(i) + "\t");
        }
    }

    //-------------------------------------------------------------------------
    //按uid查询业务
    public void selectAsUid() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入查询的id：");
        int uid = input.nextInt();

        User u = ud.selectAsUid(uid);
        System.out.println(u);

    }

    //-----------------------------------------------------------------------------
    //插入操作
    public void insertInfo() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入添加的id：");
        int uid = input.nextInt();
        System.out.println("请输入添加的名字：");
        String uname = input.next();
        System.out.println("请输入添加的密码：");
        int upassword = input.nextInt();
        System.out.println("请输入添加的钱数：");
        int umoney = input.nextInt();
        int i = ud.insertInfo(uid, uname, upassword, umoney);
        if (i > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //-------------------------------------------------------------------------------------
    //根据id删除用户
    public void deleteInfo() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要删除用户的id：");
        int uid = input.nextInt();
        int i = ud.deleteInfo(uid);
        if (i > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    //---------------------------------------------------------------------
    //根据uid修改用户财产
    public void modifyInfo() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入修改的用户id：");
        int uid = input.nextInt();
        System.out.println("请输入修改的钱数：");
        int umoney = input.nextInt();
        int i = ud.modifyInfo(uid, umoney);
        if (i > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

}
