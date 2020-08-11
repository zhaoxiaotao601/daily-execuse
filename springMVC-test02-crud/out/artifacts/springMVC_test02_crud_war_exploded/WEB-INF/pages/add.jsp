<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/30
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工添加页面</title>
</head>
<body>
<h1>员工添加</h1>
<% pageContext.setAttribute("ctp", request.getContextPath());%>
<form:form action="${ctp }/emp" modelAttribute="employee" method="post">
    <%-- path就是原来html-input的name项，需要写
       path:当作原生的name项--%>
    lastName:<form:input path="lastName"/><br>
    email:<form:input path="email"/><br>
    gender:<br>
    男:<form:radiobutton path="gender" value="1"/><br>
    女:<form:radiobutton path="gender" value="0"/><br>
    dept:
    <form:select path="department.id"
                 items="${depts }"
                 itemLabel="departmentName"
                 itemValue="id"></form:select><br>
    <input type="submit" value="保存">

</form:form>


<%--<form action="">--%>
<%--    lastName:<input type="text" name="lastName"/><br/>--%>
<%--    email:<input type="text" name="email"/><br/>--%>
<%--    gender:<br/>--%>
<%--    男:<input type="radio" name="gender" value="1"/><br/>--%>
<%--    女:<input type="radio" name="gender" value="0"/><br/>--%>
<%--    dept:<select name="department.id">--%>
<%--    <c:forEach items="${depts }" var="deptItem">--%>
<%--        &lt;%&ndash;    标签体中的是在页面的提示选项信息，value才是真正提交的值    &ndash;%&gt;--%>
<%--        <option value="${deptItem.id }">${deptItem.departmentName }</option>--%>
<%--    </c:forEach>--%>
<%--</select>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>
</body>
</html>