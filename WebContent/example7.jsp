<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Goo Goo Dan</title>
</head>
<body>

<h3>스크립트릿으로 구구단을 출력해 보자~</h3>
<%
	for(int i = 2; i < 10; i ++)
	{
		for(int j = 1; j < 10; j++)
		{
			out.print(i + "*" + j + "=" + (i * j)); %> <br />
	<%
		}
	%>
		<br />
<%
	}
%> <br />

</body>
</html>