<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Movies</title>
</head>
<body>
	<h1>Top Movies</h1>
	<ol>
		<c:forEach items="${mov}" var="m">
				<li>${m}</li>
		</c:forEach>
	</ol>
</body>
</html>