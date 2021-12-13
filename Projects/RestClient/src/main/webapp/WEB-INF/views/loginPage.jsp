<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<title>Login Page</title>
</head>
<body>
	<div class="container m-5 "
		style="font-size: 30px; background-color: #8a579c4a">
		<header>${LHeader }</header>
	</div>
	<div class="container mt-3 p-5"
		style="border: solid; border-color: darkgrey; max-width: 650px">
		<h1 class="pl-5" style="font-size: 25px;">Login</h1>

		<form class="pl-5" action="login" method="post">

			<div class="form-group pt-3 ">
				<label for="exampleInputEmail1">Username:</label> <input
					type="username" name="username" style="width: 50%"
					class="form-control" aria-describedby="emailHelp"> <small
					class="form-text text-muted">Your Safety is our priority!</small>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password:</label> <input
					type="password" name="password" style="width: 50%"
					class="form-control" id="exampleInputPassword1">
			</div>

			<button type="submit" class="btn btn-info btn-lg active"
				role="button" aria-pressed="true">Submit</button>
			<a href="forget">Forgotten Your Password?</a>
		</form>
	<c:if test ="${result==false}">
		<h3><i>Sorry! Invalid Credentials</i></h3>
		</c:if>

	</div>
	<div class="container " style="background-color: #8a579c4a">
		<footer class="m-3  text-right "> ${Footer }</footer>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>


</body>
</html>