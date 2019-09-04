<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>车型展示页面</title>
</head>
<body>
<table>
    <c:forEach items="${carTypeList}" var="gn_cartype" varStatus="i">
        <tr>
            <td>图片：${gn_cartype.gn_picture}</td>
            <td>车名：${gn_cartype.gn_carName}</td>
            <td>配置：${gn_cartype.gn_carConfifg}</td>
            <td>价格：${gn_cartype.gn_carDaliyPrice}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
