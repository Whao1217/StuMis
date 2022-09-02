<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>功能菜单</title>
</head>
	<%
         Object message = request.getAttribute("message");
         if(message!=null && !"".equals(message)){
     
    %>
         <script type="text/javascript">
              alert("<%=request.getAttribute("message")%>");
         </script>
    <%} %>
<body>
	<div align="center">
	    <h1 style="color: black;">&nbsp&nbsp&nbsp欢迎使用学生管理系统！</h1>
		<table border="6">
			<tr>
            	<td><h4><a href="add.jsp"><div style="color: black;">添加学生信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="delete.jsp"><div style="color: black;">删除学生信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="search.jsp"><div style="color: black;">查询学生信息</div></a></h4></td>
			</tr>
			<tr>
            	<td><h4><a href="listServlet"><div style="color: black;">修改学生信息</div></a></h4></td>
			</tr>
		</table>
    </div>
</body>
</html>