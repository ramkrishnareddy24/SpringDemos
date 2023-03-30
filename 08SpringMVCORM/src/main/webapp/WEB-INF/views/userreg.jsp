<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>User Registration</h2>
	
	<form action="registeruser" method="post">
		<pre>
		Name:		<input type="text" name="name">
		Email:		<input type="text" name="email">
		Password:	<input type="text" name="password">
				<input type="submit" name="SignUp" value="Signup">
		</pre>
	</form>
	<p>${message }</p>
	<ul>
		<c:forEach items="${users }" var="user">
		<li>${user.id }  |  ${user.name }  |  ${user.email }</li>
		</c:forEach>
	</ul>
	
</body>
</html>