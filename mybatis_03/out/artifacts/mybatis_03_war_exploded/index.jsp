<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>$Title$</title>
  </head>
  <body>
  <form action="transfer" method="post">
    转账账户：<input type="text" name="accOutNo"><br>
    密码：<input type="password" name="accOutPassword"><br>
    金额：<input type="text" name="accOutBalance"><br>
    收款账号：<input type="text" name="accInAccNo"><br>
    收款人姓名：<input type="text" name="accInName"><br>
    <input type="submit" value="转账"><br>
  </form>
  </body>
</html>
