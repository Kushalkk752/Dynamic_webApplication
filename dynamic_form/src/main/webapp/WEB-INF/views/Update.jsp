<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Update.css">
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<h1>Update</h1>
	<form action="updReg" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="Name" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="Email" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="update" /></td>
			</tr>
		</table>
	</form>
	<%
		if (request.getAttribute("msg") != null) {
			out.println(request.getAttribute("msg"));
		}
	%>
</body>
</html>