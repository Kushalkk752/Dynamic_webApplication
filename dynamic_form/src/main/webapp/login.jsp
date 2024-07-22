<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/index.css">
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Login Page</h1>
	<div class="container">
		<form action="loginServlet" method="post">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="UserName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="Password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="login" /></td>
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