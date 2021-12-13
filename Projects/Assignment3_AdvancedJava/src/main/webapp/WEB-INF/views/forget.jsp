<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgetten Password</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>

<body style="background-color: #1c53453b;">
<div style="padding:25px;">
<h3 align ="center">Change Your password</h3>
</div>

<hr>
<div class ="container">
<form action= "forget" method = "post">
UserName:
<input type ="text" name="username"/>
<br> <br>  
Create Password:
<input type ="password" name ="password" />
<br><br>
Confirm Password:
<input type = "password" name ="confirmPassword"/>
<br><br>
<p align ="left">
<input type="submit" value ="submit" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true" />


</p>
</form>
</div>
</body>
</html>