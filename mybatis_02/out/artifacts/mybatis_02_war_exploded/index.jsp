<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>$Title$</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${PageInfo.list }" var="pi">
        <tr>
            <td>${pi.id}</td>
            <td>${pi.name}</td>
            <td>${pi.age}</td>
        </tr>
    </c:forEach>
</table>
<a href="page?pageNumber=${PageInfo.pageNumber-1}&pageSize=${PageInfo.pageSize}" <c:if test="${PageInfo.pageNumber<=1 }"> onclick="javascript:return false;"</c:if>>上一页</a>
<a href="page?pageNumber=${PageInfo.pageNumber+1}&pageSize=${PageInfo.pageSize}">下一页</a>
</body>
</html>
