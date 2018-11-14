<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage = "example3.jsp" %>
<%
	String param = request.getParameter("id");
	if(param.equals("test"))
		param = " 파라미터가 입력되었습니다. (예외 상황이 발생하지 않았습니다.)";
%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<body>
	<h4>
	<%=param %>
	</h4>
</body>
</html>