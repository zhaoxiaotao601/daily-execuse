package com.zxt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.zxt.dao.impl.UserDaoImpl;
import com.zxt.po.User;

public class TestMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException   {
		//插入
		UserDaoImpl ud= new UserDaoImpl();
//		User u=new User();
//		int i =ud.insertInfo(21, "zxttt", 78999, 9999);
////		int i=0;	
////			for(int j =1;j<=20;j++){
////			  i=ud.insertInfo(j,"ttt"+j,666,1230);
////			}
//			if(i>0){
//				System.out.println("插入成功");
//			}else{
//				System.out.println("插入失败");
//			}
//		
		
		
	//------------------------------------------------
//查询
		User u=new User();
		try {
			ArrayList<User> list = ud.QueryInfo();
			for(int i=0;i<=list.size()-1;i++){
				System.out.println(list.get(i)+"\t");
			}
			//System.out.println(list.get(1));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//---------------------------------------------
		//删除
//		try {
			
//			int i = ud.DeleteInfo(9);
//			
//			if(i>0){
//				System.out.println("删除成功");
//			}else{
//				System.out.println("删除失败");
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		//-----------------------------------------------------
		//修改
//		try {
//			int i = ud.ModifyInfo(13, "qizoxutao");
//			if(i>0){
//				System.out.println("修改成功");
//			}else{
//				System.out.println("修改失败");
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
	
	

	}
