package com.zxt.dao.impl;

import com.zxt.po.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    //没有参数，返回值为集合类型
    ArrayList<User> list = new ArrayList<>();
    User u = new User();
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/Duser?useSSL=false";
    String username = "root";
    String password = "123456";

    //--------------------------------------------------------------------------------
    //查询全部方法
    public ArrayList<User> selectAll() throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName(driver);
        //创建连接
        Connection conn = DriverManager.getConnection(url, username, password);
        //sql语句
        String sql = "select * from t_user";
        //sql语句对象
        PreparedStatement ps = conn.prepareStatement(sql);
        //执行
        ResultSet rs = ps.executeQuery();
        //遍历
        while (rs.next()) {
            u = new User();
            u.setUid(rs.getInt("uid"));
            u.setUname(rs.getString("uname"));
            u.setUpassword(rs.getInt("upassword"));
            u.setUmoney(rs.getInt("umoney"));
            list.add(u);
        }
        //关闭
        ps.close();
        conn.close();
        return list;
    }

    //------------------------------------------------------------------------------
    //按uid查询
    public User selectAsUid(int uid) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "select * from t_user where uid=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, uid);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            u = new User();
            u.setUid(rs.getInt("uid"));
            u.setUname(rs.getString("uname"));
            u.setUpassword(rs.getInt("upassword"));
            u.setUmoney(rs.getInt("umoney"));
        }
        return u;
    }

    //----------------------------------------------------------------------------------
    //增加方法
    public int insertInfo(int uid, String uname, int upassword, int umoney) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "insert into t_user values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, uid);
        ps.setString(2, uname);
        ps.setInt(3, upassword);
        ps.setInt(4, umoney);
        int i = ps.executeUpdate();
        ps.close();
        conn.close();
        return i;
    }

    //--------------------------------------------------------------------------------------------
    //根据id值删除方法
    public int deleteInfo(int uid) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "delete from t_user where uid=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, uid);
        int i = ps.executeUpdate();
        ps.close();
        conn.close();
        return i;
    }

    //-------------------------------------------------------------------------------
    //根据uid修改umoney的方法
    public int modifyInfo(int uid, int umoney) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "update t_user set umoney=? where uid=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, umoney);
        ps.setInt(2, uid);
        int i = ps.executeUpdate();
        ps.close();
        conn.close();
        return i;
    }
}
