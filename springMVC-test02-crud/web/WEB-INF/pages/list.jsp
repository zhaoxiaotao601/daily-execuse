<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/30
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表页面</title>
    <script type="text/javascript" src="${ctp }/scripts/jquery-1.9.1.min.js"></script>
</head>
<body>
<h1>员工列表</h1>
<table border="1" cellpadding="5px" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>lastName</th>
        <th>email</th>
        <th>gender</th>
        <th>departmentName</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
    <c:forEach items="${emps }" var="emp">
        <tr>
            <td>${emp.id }</td>
            <td>${emp.lastName }</td>
            <td>${emp.email }</td>
            <td>${emp.gender==0?"女":"男" }</td>
            <td>${emp.department.departmentName }</td>
            <td>
                <a href="${ctp }/emp/${emp.id }">EDIT</a>
            </td>
            <td>
                <a href="${ctp }/emp/${emp.id}" class="delBtn">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${ctp }/toaddpage">添加员工</a>
<form id="deleteForm" action="${ctp }/emp/${emp.id}" method="post">
    <input type="hidden" name="_method" value="DELETE">
</form>
<script type="text/javascript">
    $(function () {
        $(".delBtn").click(function () {
            $("#deleteForm").attr("action", this.href);
            $("#deleteForm").submit();
            return false;
        });
    });
</script>
</body>
</html>