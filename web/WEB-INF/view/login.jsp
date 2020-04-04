<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 20/4/1
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h2 align="center">用户登录</h2>
<h5 align="center" style="color:red;">
    ${error}
</h5>
<hr>
<form action="${pageContext.request.contextPath}/login/login.action" method="post">
    <table width="50%" align="center" cellpadding="10" border="1">
        <tr>
            <td align="right">登录名称：</td>
            <td>
                <input type="text" name="usercode">
            </td>
        </tr>
        <tr>
            <td align="right">登录密码：</td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td colspan="2"align="center">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
