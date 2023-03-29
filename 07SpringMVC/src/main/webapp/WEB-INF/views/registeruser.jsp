<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<h1> Registration Page </h1>
	<form action = "signupuser" method="post">
		<pre>
			Id:    <input type = "text" name="id"/>
			Name:  <input type = "text" name="name"/>
			Email: <input type = "text" name="email"/>
			       <input type = "submit" name="SignUp"/>
		</pre>
	</form>
</body>
</html>