package com.zxt.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.security.jgss.LoginConfigImpl;

import com.zxt.service.LoginService;
import com.zxt.service.impl.LoginServiceimpl;

public class PageServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		System.out.println(uname+":"+pwd);
		
		LoginService ls = new LoginServiceimpl();
		User u =ls.checkLoginService(uname, pwd);
		
		
	
}
}
