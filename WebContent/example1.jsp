<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%
		String user = request.getParameter("name");
		if(user == null)
			user = "Guest";
	%>
	<h1>
	Hello
	<%= user %>
	</h1>
</body>
</html>