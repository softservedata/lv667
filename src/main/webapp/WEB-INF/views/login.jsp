<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

	<h1>Login</h1>

	<h2>Welcome to the Application</h2>
	<br>
	<form action="/lv667w/login" method="post">
		<br><br>
		user_name: <input type="text" name="name" placeholder="username">
		<br><br>
		password: <input type="password" name="password">
		<br><br>
		<input type="submit" value="login">
		<br><br>

		<% String res = (String) request.getAttribute("result");
	   		if ((res != null) && (res.equals("Error"))) {
	      		 out.println("<font color='red'><b>Invalid</b> user or password</font>");
	  		 }
		%>
	</form>


</body>
</html>