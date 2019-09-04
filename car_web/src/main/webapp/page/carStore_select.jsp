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
    //附近门店
    function near() {
        var area=$("#near").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }
    //机场\火车站
    function station() {
        var area=$("#station").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }
    //金水区
    function js() {
        var area=$("#js").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }
    //二七区
    function erqi() {
        var area=$("#erqi").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }
    //管城区
    function gc() {
        var area=$("#gc").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }
    //中原区
    function zy() {
        var area=$("#zy").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }
    //惠济区
    function hj() {
        var area=$("#hj").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }
    //高新区
    function gx() {
        var area=$("#gx").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }

    //经开区
    function jk() {
        var area=$("#jk").html();
        location.href="${pageContext.request.contextPath}/gn_store/store_show?area="+area;
    }

</script>
<body>
<form action="">
    <input type="text" id="storeName" placeholder="输入地址查找周边门店" on="search()">
</form>
<div style="float: left; margin-top: 70px;border: 1px solid black; width: 200px">
    <a  id="near" onclick="near()">附近门店</a>

    <br>
    <a  id="station" onclick="station()">机场/火车站</a>
    <br>
    <a id="js" onclick="js()">金水区</a>
    <br>
    <a id="erqi" onclick="erqi()">二七区</a>
    <br>
    <a id="gc" onclick="gc()">管城区</a>
    <br>
    <a id="zy" onclick="zy()">中原区</a>
    <br>
    <a id="hj" onclick="hj()">惠济区</a>
    <br>
    <a id="gx" onclick="gx()">高新区</a>
    <br>
    <a id="jk" onclick="jk()">经开区</a>
</div>

<br>
<br>
<br>
<div style="float: right; margin-right: 1000px;border: 1px solid black; width: 350px">
    <c:forEach items="${storeList}" var="store" varStatus="i">
        <div>
            <p>门店名称：${store.storeName}</p>
            <p>${store.storeDistance}km</p>
            <p>${store.storeAddress}</p>
        </div>
    </c:forEach>
    <span id="list"></span>
</div>

<script>
    function search() {
        var storeName =$("#storeName").val();
    location.href= "${pageContext.request.contextPath}/gn_store/findByStoreName?storeName="+storeName;
        $("#list").html(${storeList})
    }
</script>

</body>
</html>
