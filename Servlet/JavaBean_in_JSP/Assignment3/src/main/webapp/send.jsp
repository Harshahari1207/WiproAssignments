<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.RequestDispatcher"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send</title>
</head>
<body>
	<%
		RequestDispatcher rd = request.getRequestDispatcher("/dataServlet");
		rd.forward(request, response);
	%>
</body>
</html>