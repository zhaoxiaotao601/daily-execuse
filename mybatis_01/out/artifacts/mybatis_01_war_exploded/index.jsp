<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>宿舍成员信息</title>
  </head>
  <body>
  <table border="1px solid">
    <tr>
      <th>编号</th>
      <th>姓名</th>
      <th>年龄</th>

    </tr>
    <c:forEach items="${list}" var="peo">
    <tr>
      <td>${peo.id}</td>
      <td>${peo.name}</td>
      <td>${peo.age}</td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>
