<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/28
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>订单信息</title>
</head>
<body>
<div style="border: 1px solid black">
    <h>车辆信息</h>
    <br>
    <br>
    <span>
        ${car2.gn_picture}
    </span>
    <br>
    <br>
    <span>
        ${car2.gn_carName}
    </span>
    <br>
    <br>
    <span>
        ${car2.gn_carConfifg}
    </span>
</div>
<table style="border: 1px solid black">
    <tr>
        <td>取车时间</td>
        <td>还车时间</td>
    </tr>
</table>

<table style="border: 1px solid black">
    <tr>
        <td>

                <a href="${pageContext.request.contextPath}/gn_car/findById2?id=${car2.id}">取车门店</a>
                <br>
                <br>
                <span style="margin-top: 50px">
                    ${car2.gn_store.storeName}
                </span>
                <br>
                <span>
                    ${car2.gn_store.storeAddress}
                </span>
        </td>
        <td style="text-align: right">
            <a>还车门店</a>
        </td>
    </tr>
</table>
<div style="border: 1px solid black">
    <p>填写驾驶员信息</p>
    <form action="">
        姓名：<input type="text" name="username" placeholder="浪里小白龙">
        <br>
        身份证号：<input type="text" name="idcard" placeholder="411282****1312">
        <br>
        电话：<input type="text" name="phoneNumber" placeholder="17825***451">
        <br>
        <input type="submit" value="提交订单">
    </form>
</div>
</body>
</html>
