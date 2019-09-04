<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.js"></script>
</head>

<script>
    //推荐
    function recomand() {
        var gn_sort=$("#recomand").html();
        location.href="${pageContext.request.contextPath}/gn_car/show?gn_sort="+gn_sort;
    }
    //经济型
    function economy() {
        var gn_sort=$("#economy").html();
        location.href="${pageContext.request.contextPath}/gn_car/show?gn_sort="+gn_sort;
    }
    //SUV
    function suv() {
        var gn_sort=$("#suv").html();
        location.href="${pageContext.request.contextPath}/gn_car/show?gn_sort="+gn_sort;
    }
    //豪华型
    function luxry() {
        var gn_sort=$("#luxry").html();
        location.href="${pageContext.request.contextPath}/gn_car/show?gn_sort="+gn_sort;
    }
    //商务型
    function business() {
        var gn_sort=$("#business").html();
        location.href="${pageContext.request.contextPath}/gn_car/show?gn_sort="+gn_sort;
    }

</script>
<body>
<div style="border: 1px solid black; width: 200px">
    <a  id="recomand" onclick="recomand()">推荐</a>

    <br>
    <a  id="economy" onclick="economy()">经济型</a>
    <br>
    <a id="suv" onclick="suv()">SUV</a>
    <br>
    <a id="luxry" onclick="luxry()">豪华型</a>
    <br>
    <a id="business" onclick="business()">商务型</a>
</div>

<br>
<br>
<br>
<table style="border: 1px solid black">
    <c:forEach items="${carTypeList}" var="gn_cartype" varStatus="i">
        <tr>
            <td>

                <a href="${pageContext.request.contextPath}/gn_car/findById?id=${gn_cartype.id}"> 图片：${gn_cartype.gn_picture}</a>
            </td>
            <td>星级 ：${gn_cartype.star}星</td>
            <td>车名：${gn_cartype.gn_carName}</td>
            <td>配置：${gn_cartype.gn_carConfifg}</td>
            <td>价格：${gn_cartype.gn_carDaliyPrice}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
