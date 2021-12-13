<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action= "LoginServlet" method = "post">
UserID:<br>
<input type ="text" name="userID"/>
<br>   
Password:<br>
<input type ="password" name ="password"/>
<br><br>
<input type="submit" />
</form>
</body>
</html>