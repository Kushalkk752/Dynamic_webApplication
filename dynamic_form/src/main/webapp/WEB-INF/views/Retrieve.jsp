<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Retrieve.css">
<meta charset="UTF-8">
<title>Retrieve</title>
</head>
<body>
	<h1>Retrieve Registration Details</h1>
	<form action="retReg" method="post">
		<table id="customers">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile</th>
			</tr>
			<%
				ResultSet result = (ResultSet)request.getAttribute("res");
				while (result.next()) {
			%>
			<tr>
				<td><%=result.getString(1)%></td>
				<td><%=result.getString(2)%></td>
				<td><%=result.getString(3)%></td>
			</tr>
			<%}%>
		</table>
	</form>
</body>
</html>