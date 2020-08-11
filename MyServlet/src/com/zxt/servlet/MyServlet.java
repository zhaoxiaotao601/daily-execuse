package com.zxt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取request请求
		//处理request请求
		//创建cookie对象
//		Cookie c = new Cookie("uname", "uname");
//		Cookie c = new Cookie("pwde", "pwd");
//		 c = new Cookie("currentName", "Lu");
//		resp.addCookie(c);
		
//		c.setPath("myServlet2/my2");
//		resp.getWriter().write("请求成功了");
//		req.setAttribute("uname", "赵小涛");//这个只能在一次请求中有效，我的这次属于第二次请求
		//响应处理结果
		//请求转发
//		req.getRequestDispatcher("my2").forward(req, resp);
		
		String uname = "";
		String pwd = "";
		Cookie[] cks=req.getCookies();
		if(cks!=null){
			for(Cookie c:cks){
				if(c.getName().equals(uname)){
				uname=c.getName();
				} 
				if(c.getName().equals(pwd)){
				pwd=c.getValue();
				}
			}
			resp.sendRedirect("http://www.baidu.com");
		}
		
		
		resp.getWriter().write("<html>");
		resp.getWriter().write("<head>");
		resp.getWriter().write("</head>");
		resp.getWriter().write("<body>");
		resp.getWriter().write("<form action='my2'  method='post'>");
		resp.getWriter().write("姓名：<input type='text' name='uname' value=''/><br/>");
		resp.getWriter().write("密码：<input type='password' name='pwd' value=''/><br/>");
		resp.getWriter().write("<input type='submit' value='查看信息'/><br/>");
		resp.getWriter().write("</form>");
		resp.getWriter().write("</body>");
		resp.getWriter().write("</html>");
		
		
		resp.getWriter().write("this is my first servlet");
		System.out.println("this is my first servlet!");
	}

}
