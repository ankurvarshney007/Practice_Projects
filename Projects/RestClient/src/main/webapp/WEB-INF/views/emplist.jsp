<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>

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

<title>EmployeeDetails</title>
</head>
<body>

	<div class="row container m-3 text-center "
		style="background-color: #8a579c4a">
		<div class="col-md-7">
			<h1 class="p-5" style="font-size: 35px;">${Header }</h1>
		</div>
		<div class="col-md-4 ">
			<h1 class="p-5" style="font-size: 30px;">
				Welcome
				<%=session.getAttribute("uname")%></h1>
		</div>
		<div class="col-md-1 pt-5">
			<form action="logout">
				<input type="submit"  value = "logout" class = "btn-sm mb-2" >
			</form>
		</div>

	</div>


	<div class="row container pb-2">
		<div class="col-md-7"></div>
		<div class="col-md-3">
			<form action="upload" method="post">
				<input type="submit" value="Upload Employee Details">
			</form>
		</div>
		<div class="col-md-2">
			<form action="employees" method="post">
				<input type="submit" value="Download Employee Details">
			</form>
		</div>
	</div>
	<div class="container">
		<table class="table table-bordered">
			<tr>
				<th>Employee Code</th>
				<th>Employee Name</th>
				<th>Location</th>
				<th>Email</th>
				<th>Date Of Birth</th>
				<th>Action</th>
			</tr>
			
			<c:forEach var="item" items="${emplList }">
				<tr>
					<td>${item.employeeCode }</td>
					<td>${item.employeeName }</td>
					<td>${item.employeeLocation }</td>
					<td>${item.employeeEmail }</td>
					<td>${item.employeeDOB }</td>
					<td><a href="edit?emp_code=${item.employeeCode }">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete?emp_code=${item.employeeCode }">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>

	<div
		style="position: fixed; left: 0; bottom: 5px; width: 98%; text-align: center; background-color: #64579c4a">
		<footer class="  text-right pl-5" style="margin-top: -1">
			${Footer }</footer>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>


</body>
</html>s