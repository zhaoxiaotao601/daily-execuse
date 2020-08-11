package com.zxt.test;

import com.zxt.service.UserService;
import com.zxt.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        do {
            UserService us = new UserServiceImpl();
            System.out.println("********************************************************");
            System.out.println("********************欢迎使用本系统***********************");
            System.out.println("********************************************************");
            System.out.println("请根据提示选择本次业务");
            System.out.println("1--->查询所有用户信息");
            System.out.println("2--->根据用户id查询用户信息");
            System.out.println("3--->添加用户");
            System.out.println("4--->删除用户");
            System.out.println("5--->修改用户信息");
            System.out.println("6--->退出系统");
            System.out.println("********************************************************");
            Scanner input = new Scanner(System.in);
            int ch = input.nextInt();
            switch (ch) {
                case 1:
                    try {
                        us.selectAllInfo();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        us.selectAsUid();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        us.insertInfo();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        us.deleteInfo();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        us.modifyInfo();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("谢谢使用");
                    return;
                default:
                    System.out.println("对不起，您输入的信息有误,请重新选择");
                    break;
            }
        } while (true);
    }
}
