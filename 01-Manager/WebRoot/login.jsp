<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>欢迎登陆后台管理信息系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
  <div>
  <form action="/mg/ps" method="post">
  <ul>
  <li><input name="uname" type="text" placeholder="用户名"/></li>
  <li><input name="pwd" type="password" placeholder="密码"/></li>
  <li><input name="" type="submit" class="loginbtn" value="登陆"></li>
  </ul>
  </form>
  </div>
  </body>
</html>
