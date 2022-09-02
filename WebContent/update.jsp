<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加学生信息</title>
</head>
	<%
		String id = request.getParameter("id");
	%>
	<%
         Object message = request.getAttribute("message");
         if(message!=null && !"".equals(message)){
     
    %>
         <script type="text/javascript">
              alert("<%=request.getAttribute("message")%>");
         </script>
    <%} %>
<body>
	<form action="updateServlet?id=<%=id%>" method="post">
	<div align="center">
	    <h1 style="color: black;">&nbsp&nbsp&nbsp欢迎进行学生信息修改！</h1>
	    <a href="menu.jsp"><div style="color: black;">返回主页</div></a>
	    <br>
		<table border="6">
			<tr>
            	<td><h4><div style="color: black;">姓名：</div></h4></td>
            	<td><input type="text" name="name" required maxlength="4" placeholder="请输入姓名"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">证件号：</div></h4></td>
            	<td><input type="text" name="idc" id="idc" required maxlength="18" onblur="checkIdc(this.value)" placeholder="请输入证件号"><span id="span1"></span></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">出生地：</div></h4></td>
            	<td><input type="text" name="born" required placeholder="请输入出生地"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">电话：</div></h4></td>
            	<td><input type="number" name="phone" id="phone" required  placeholder="请输入电话" onblur="checkPhone(this.value)" ><span id="span2"></span></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">出生日期：</div></h4></td>
            	<td><input type="number" name="birthday" id="birthday"required  placeholder="请输入出生日期" onblur="checkBirthday(this.value)" ><span id="span3"></span></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">专业：</div></h4></td>
            	<td><input type="text" name="major" required  placeholder="请输入专业"/></td>
			</tr>
			<tr>
            	<td><h4><div style="color: black;">备注：</div></h4></td>
            	<td><textarea cols="30" rows="5" name="beizhu">
					</textarea>
				</td>
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
<script type="text/javascript">
function checkIdc(str){
	var idc = document.getElementById("idc").value;
	var sp = document.getElementById("span1");
	var re = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	} 
function checkPhone(str){
	var phone = document.getElementById("phone").value;
	var sp = document.getElementById("span2");
	var re = /^([1]\d{10}|([\(（]?0[0-9]{2,3}[）\)]?[-]?)?([2-9][0-9]{6,7})+(\-[0-9]{1,4})?)$/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	}
function checkBirthday(str){
	var birthday = document.getElementById("birthday").value;
	var sp = document.getElementById("span3");
	var re = /^((19|20)[0-9]{2})((0[1-9])|(1[0-2]))((0[1-9])|((1|2)[0-9])|(3[0-1]))$/;
	if (re.test(str)) {
	    sp.innerHTML = "格式正确"
	} else {
	sp.innerHTML = "输入格式有误"
	}
	}

</script>
</html>