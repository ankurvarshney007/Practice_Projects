<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
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

<title>Edit Employee Details</title>
</head>
<body>
<div class="container row m-4 "
		style="font-size: 30px; background-color:#8a579c4a">
		<div class="col-md-4">
		<header>${Header }</header>
		</div>
		<div class="col-md-3"></div>
		<div class="col-md-3 pt-2">
		<h1 style="font-size: 25px;">
		Welcome
		<%=session.getAttribute("uname")%></h1>
		
		</div>
		<div class="col-md-2 pt-2">
		<form action="logout">
	<input type="submit"  value = "logout" class = "btn-sm mb-2" ><!-- style="border-radius: 50%;height:45px" value="x" -->
	</form>
	
		</div>
	</div>
	
	<div class="container mt-3 p-5"
		style="border: solid; border-color: darkgrey; max-width: 650px">
		<h1 class="pl-1 pb-3" style="font-size: 25px;">Edit Employee Details</h1>
		<form action="updateemployee" method="post">
			<div class="form-group">

				Employee Code:&nbsp; <input type="text" name="employeeCode"
					value=<%=request.getAttribute("eid")%> placeholder="Enter Code"
					readonly="readonly">
			</div>
			<div class="form-group">
				Employee Name: <input type="text" name="employeeName"
					pattern=".{1, 100}" required title="Non blank, Max 100 Characters"
					placeholder="Enter Name">
			</div>
			<div class="form-group">
				Location:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="employeeLocation"
					pattern=".{0, 500}" title="Max 500 Characters"
					placeholder="Enter Location">
			</div>
			<div class="form-group">
				Email: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="email" name="employeeEmail" pattern=".{1, 100}"
					title="Email Validation, Max 100 Characters"
					placeholder="Enter Email">
			</div>
			<div class="form-group">
				Date Of Birth: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="date" name="employeeDOB" title="DD/MM/YYYY"
					placeholder="DOB">
			</div>




			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="reset" class="btn btn-primary">cancel</button>
		</form>
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