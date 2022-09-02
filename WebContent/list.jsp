<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息列表</title>
</head>
<body>
    <div align="center">
        <h1 style="color: black;">信息列表</h1>
        <a href="menu.jsp"><div style="color: black;">返回主页</div></a>
        <br>
        <table border="6">
            <tr>
                <td>id</td>
                <td>姓名</td>
                <td>证件号</td>
                <td>出生地</td>
                <td>电话</td>
                <td>出生日期</td>
                <td>专业</td>
                <td>备注</td>
                <td></td>
            </tr>
            <c:forEach items="${students}" var="item" varStatus="status">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.idc}</td>
                    <td>${item.born}</td>
                    <td>${item.phone}</td>
                    <td>${item.birthday}</td>
                    <td>${item.major}</td>
                    <td>${item.beizhu}</td>
                    <td><a href="update.jsp?id=${item.id}"><div style ="color:black;">修改</div></a>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>