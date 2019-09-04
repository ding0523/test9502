<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>平价租车</title>
</head>
<body>
<table style="border: 1px solid black">
    <tr>
        <td><a href="">用户中心</a></td>
        <td>平价租车</td>
        <td><a href="">客服</a></td>
    </tr>
</table>
<table>
    <tr>
        <td>国内租</td>
        <td>分时共享</td>
        <td>试驾</td>
        <td>全球租</td>
        <td>长租</td>
    </tr>
</table>
<form action="${pageContext.request.contextPath}/page/car_select.jsp">
    <div style="border: 1px solid black">
        <input type="submit" value="立即选车">
    </div>
</form>


<table style="border: 1px solid black">
    <tr>
        <td>超值套餐</td>
        <td>顺风车</td>
        <td>
            <a href="${pageContext.request.contextPath}/gn_store/store_show">门店查询</a>

        </td>
        <td>导航</td>
    </tr>
</table>

<table>
    <tr>
        <td>车型推荐</td>
        <td><a href="">更多</a></td>
    </tr>
</table>
<table>
    <tr>
        <td>顺风车推荐</td>
        <td>更多</td>
    </tr>
</table>
</body>
</html>
