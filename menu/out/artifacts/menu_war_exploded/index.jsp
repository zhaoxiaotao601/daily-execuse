<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>能力提升</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.7.2.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $.post("show", function (data) {
                var result = "";
                for (var i = 0; i < data.length; i++) {
                    result += "<dl>";
                    result += "<dt style='cursor: pointer'>" + data[i].name + "</dt>";
                    for (var j = 0; j < data[i].children.length; j++) {
                        result += "<dd>" + data[i].children[j].name + "</dd>";
                    }
                    result += "</dl>";
                }
                $("body").html(result);
            });
            //对所有父菜单添加点击事件
            //live("事件名，多个时间使用空格分隔")
            $("dt").live("click",function(){
                $(this).siblings().slideToggle(1000);
            })
        })
    </script>
</head>
<body>

</body>
</html>
