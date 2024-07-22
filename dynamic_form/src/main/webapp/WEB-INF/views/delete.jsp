<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Delete.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Delete</h1>
	<form action="delReg" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="Name" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="delete" /></td>
			</tr>
		</table>
	</form>
	<%
		if(request.getAttribute("msg") != null) {
			out.println(request.getAttribute("msg"));
		}
	%>
</body>
</html>