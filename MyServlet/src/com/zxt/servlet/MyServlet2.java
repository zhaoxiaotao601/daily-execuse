package com.zxt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	//设置请求编码格式
	req.setCharacterEncoding("utf-8");
	//设置响应编码格式
	resp.setContentType("text/html;charset=utf-8");
	//获取请求信息
	//处理请求信息
	//cookie 的获取
	
	String uname=req.getParameter("uname");
	String pwd=req.getParameter("pwd");
	
	if(uname!=null){
		Cookie c = new Cookie("uname",uname);
		c.setMaxAge(3600);
		resp.addCookie(c);
	}
	if(pwd!=null){
		Cookie c2 = new Cookie("pwd",pwd);
		c2.setMaxAge(3600);
		resp.addCookie(c2);
	}
	System.out.println(uname);
	System.out.println(pwd);
	
//	String name= "";
//	String value= "";
//	Cookie[] cks = req.getCookies();
//	if(cks!=null){
//	for(Cookie c:cks){
//		 name = c.getName();
//		 value = c.getValue();
//		System.out.println(name + " = "+ value);
//	}
//	}

	
//	String u=(String)req.getAttribute("uname");
	//响应处理结果
	resp.getWriter().write("<html>");
	resp.getWriter().write("<head>");
	resp.getWriter().write("</head>");
	resp.getWriter().write("<body>");
	resp.getWriter().write("<form action='my2'  method='get'>");
	resp.getWriter().write("<p>我的名字叫"+uname+pwd);
	resp.getWriter().write("</p>");
//	resp.getWriter().write("姓名：<input type='text' name='uname' value=''/><br/>");
//	resp.getWriter().write("：<input type='password' name='pwd' value=''/><br/>");
//	resp.getWriter().write("<input type='submit' value='登陆'/><br/>");
	resp.getWriter().write("</form>");
	resp.getWriter().write("</body>");
	resp.getWriter().write("</html>");
//	resp.getWriter().write("this is my second Servlet");
	System.out.println("我的名字叫"+pwd+uname);
}
}
