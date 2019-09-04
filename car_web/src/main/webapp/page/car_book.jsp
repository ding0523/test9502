<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/28
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>车辆预定</title>
</head>
<body>
<%--/gn_car/order?id=${car.id}--%>
<form action="${pageContext.request.contextPath}/gn_car/order?id=${car.id}" method="post">
    <h>选择车型</h>
    <br>
    <br>
    <span>
        ${car.gn_picture}
    </span>
    <br>
    <br>
    <span>
        ${car.gn_carName}
    </span>
    <br>
    <br>
    <span>
        ${car.gn_carConfifg}
    </span>
    <br>
    <br>
    <span>
        ${car.gn_carDaliyPrice}
    </span>
    <br>
    <input type="submit" value="预定">
</form>

</body>
</html>
