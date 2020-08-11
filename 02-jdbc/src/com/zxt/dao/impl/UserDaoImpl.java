package com.zxt.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zxt.po.User;

public class UserDaoImpl {
	
	ArrayList<User> list= new ArrayList<User>();
	User u=null;
//添加操作
	public int insertInfo(int uid,String uname,int upassword,int umoney) throws ClassNotFoundException, SQLException{

	Class.forName("com.mysql.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Duser?useSSL=false", "root", "123456");
	
	String sql = "insert into t_user values(?,?,?,?)";
	
//	Statement stmt = conn.createStatement();
//	String sql = "insert into t_user values('"+uid+"','"+uname+"','"+upassword+"','"+umoney+"')";
	
	PreparedStatement ps = conn.prepareStatement(sql);
	
	ps.setInt(1, uid);
	ps.setString(2, uname);
	ps.setInt(3, upassword);
	ps.setInt(4, umoney);
	int i = ps.executeUpdate(sql);

	ps.close();
	conn.close();
	return i;
	}
	
	
	//----------------------------------------------------------
	//查询操作
	
	 public ArrayList<User> QueryInfo() throws ClassNotFoundException, SQLException{

		 Class.forName("com.mysql.jdbc.Driver");

		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Duser?useSSL=false", "root", "123456");

		 Statement stmt = conn.createStatement();

		 String sql = "select * from t_user ";

		 ResultSet rs = stmt.executeQuery(sql);
		 
		 while(rs.next()){
			 u = new User();
			 u.setUid(rs.getInt("uid"));
			 u.setUname(rs.getString("uname"));
			 u.setUpassword(rs.getInt("upassword"));
			 u.setUmoney(rs.getInt("umoney"));
			 list.add(u);
		 }
//		 System.out.println(list.get(2));
		 return list;
	}
	 //------------------------------------
	 //删除操作
	 public int DeleteInfo(int uid) throws ClassNotFoundException, SQLException{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Duser?useSSL=false", "root", "123456");
		 Statement stmt = conn.createStatement();
		 String sql = "delete from t_user where uid='"+uid+"'";
		 int i=stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		 return i;
		 
	 }
	 //------------------------------------------------------------------------
	 //修改操作
	 public int ModifyInfo(int uid,String uname) throws ClassNotFoundException, SQLException{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Duser?useSSL=false", "root", "123456");
		 Statement stmt = conn.createStatement();
		 String sql="update t_user set uname='"+uname+"' where uid='"+uid+"'";
		 int i = stmt.executeUpdate(sql);
		 return i;
	 }
}
