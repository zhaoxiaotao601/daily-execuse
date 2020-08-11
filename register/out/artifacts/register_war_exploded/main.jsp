<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $("a").click(function () {
                var $td = $(this).parent().prev();
                $td.html(parseInt($td.html()) + 1);
            });
        });
    </script>
</head>
<body>
<table border="1">
    <tr>
        <th>资料名称</th>
        <th>下载次数</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="file">
        <tr>
            <td>${file.name}</td>
            <td>${file.count}</td>
            <td><a href="download?id=${file.id}&name=${file.name}">下载</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
