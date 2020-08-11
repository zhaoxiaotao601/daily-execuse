<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>$Title$</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            var pageSize = "${pageinfo.pageSize}";
            var pageNumber = "${pageinfo.pageNumber}";
            var tname = "${pageinfo.tname}";
            var sname = "${pageinfo.sname}";
            var total = "${pageinfo.total}";

            //i表示循环角标，n表示迭代变量，n是dom对象
            $.each($(":radio"), function (i, n) {
                if ($(n).val() == pageSize) {
                    $(n).attr("checked", "checked");
                }
            });
            //对输入框设置
            $(":text[name='sname']").val(sname);
            $(":text[name='tname']").val(tname);

            //查询按钮点击事件
            $("button").click(function () {
                location.href = "show?pageSize=" + pageSize + "&pageNumber=1&tname=" + $(":text[name='tname']").val() + "&sname=" + $(":text[name='sname']").val();
            });
            //单选按钮点击事件
            $(":radio").click(function () {
                pageSize = $(this).val();
                location.href = "show?pageSize=" + pageSize + "&pageNumber=1&tname=" + $(":text[name='tname']").val() + "&sname=" + $(":text[name='sname']").val();
            });
            //点击上一页
            $(".page_a:eq(0)").click(function () {
                pageNumber = parseInt(pageNumber) - 1;
                if (pageNumber >= 1) {
                    location.href = "show?pageSize=" + pageSize + "&pageNumber=" + pageNumber + "&tname=" + $(":text[name='tname']").val() + "&sname=" + $(":text[name='sname']").val();
                } else {
                    pageNumber = 1;
                }
                return false;
            });
            $(".page_a:eq(1)").click(function () {
                pageNumber = parseInt(pageNumber) + 1;
                if (pageNumber <= total) {
                    location.href = "show?pageSize=" + pageSize + "&pageNumber=" + pageNumber + "&tname=" + $(":text[name='tname']").val() + "&sname=" + $(":text[name='sname']").val();
                } else {
                    pageNumber = total;
                }
                return false;
            });
        });
    </script>
</head>
<body>
<input type="radio" value="2" name="pageSize">2
<input type="radio" value="3" name="pageSize">3
<input type="radio" value="4" name="pageSize">4<br/>
学生姓名：<input type="text" name="sname"/>老师姓名：<input type="text" name="tname"/>
<button>查询</button>
<br/>
<table border="1">
    <tr>
        <th>学生编号</th>
        <th>学生姓名</th>
        <th>年龄</th>
        <th>任课教师</th>
    </tr>
    <c:forEach items="${pageinfo.list}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
            <td>${stu.teacher.name}</td>
        </tr>
    </c:forEach>
</table>
<a href="" class="page_a">上一页</a> <a href="" class="page_a">下一页</a>
</body>
</html>
