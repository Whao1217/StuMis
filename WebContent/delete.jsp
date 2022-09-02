<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>删除学生信息</title>
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
	<form action="deleteServlet" method="post">
	<div align="center">
	    <h1 style="color: black;">&nbsp&nbsp&nbsp欢迎进行学生信息删除！</h1>
	    <a href="menu.jsp"><div style="color: black;">返回主页</div></a>
	       <br>
		<table border="6">
			<tr>
            	<td><h4><div style="color: black;">姓名：</div></h4></td>
            	<td><input type="text" name="name" required maxlength="4" placeholder="请输入姓名"/></td>
			</tr>
			<tr>
				<td></td>
				<td>
				<button type="submit">提&nbsp&nbsp&nbsp交</button>
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<button type="reset">清&nbsp&nbsp&nbsp空</button>
				</td>
			</tr>
		</table>
    </div>
    </form>
</body>
</html>