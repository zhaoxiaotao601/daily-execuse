<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>$Title$</title>
</head>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script>
    $(function () {
        $("a").click(function () {
            //浏览器有缓存功能，不会多次请求相同数据
            $("img").attr("src", "validcode?date=" + new Date());
            return false;
        })
    })
</script>
<body>
${error}
<form action="login" method="post">
    用户名:<input type="text" name="username"/><br/>
    密码:<input type="password" name="password"/><br/>
    验证码:<input type="text" size="1" name="code"/> <img src="validcode" width="80" height="40"/><a href="">看不清</a><br/>
    <input type="submit" value="登陆"/><input type="reset" value="重置"/>
</form>


</body>
</html>
