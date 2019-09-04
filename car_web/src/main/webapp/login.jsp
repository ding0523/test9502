<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/logins" method="post">
    用户名：<input type="text" name="username" placeholder="请输入用户名">
    <br>
    密码：<input type="text" name="password" placeholder="请输入密码">
    <br>
    <input type="submit">
    <br>
    ${msn}
</form>

</body>
</html>
