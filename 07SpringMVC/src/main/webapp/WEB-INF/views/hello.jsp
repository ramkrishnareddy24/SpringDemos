<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h1>Hello!! Welcome Spring MVC</h1>
	
	<%
	out.println("Id :"+request.getAttribute("id")+"<br/>");
	out.println("Name :"+request.getAttribute("name")+"<br/>");
	out.println("Salary :"+request.getAttribute("salary")+"<br/>");

	%>
	
	<p>Id:<b>${id }</b></p>
	<p>Name:<b>${name }</b></p>
	<p>Salary:<b>${salary }</b></p>
	
	<p>${employee}</p>
</body>
</html>