<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Registration.css">
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<h1>Registration Page</h1>
	<form action="logoutReg" method="post">
		<table>
			<tr>
				<td><input type="submit" value="logout" /></td>
			</tr>
		</table>
	</form>
	<div class="container">
		<form action="addReg" method="post">
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
					<td>Mobile</td>
					<td><input type="text" name="Mobile" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="register" /></td>
				</tr>
			</table>
		</form>
	</div>
	<%
		if (request.getAttribute("msg") != null) {
			out.println(request.getAttribute("msg"));
		}
	%>
</body>
</html>