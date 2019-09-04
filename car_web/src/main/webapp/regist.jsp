<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<head>
    <title>注册页面</title>

    <script type="text/javascript">
        function checks() {
            var username=$("#username").val();
            if(username.trim()==""){
                return;
            }

            $.ajax({
                url:"/user/findByUsername",
                data:"username="+username,
                success:function (data) {
                    if(data=="true"){
                        $("#check").html("该用户名已经存在").css("color","red");
                    }else {
                        $("#check").html("该用户名可用").css("color","green");
                    }
                },
                type:"POST",
                dataType:"text"
            });
        }
    </script>
</head>

<body>
<form action="${pageContext.request.contextPath}/user/save" method="post">
   用户名：<input type="text" name="username" placeholder="请输入用户名" id="username" onblur="checks()">

    <span id="check"></span>
    <br>
    密码：<input type="text" name="password" placeholder="请输入密码">
    <br>
   手机号：<input type="text" name="phone" placeholder="请输入手机号">
    <br>
    邮箱：<input type="text" name="email" placeholder="请输入邮箱地址">
    <br>
    <input type="submit">

</form>
</body>
</html>
