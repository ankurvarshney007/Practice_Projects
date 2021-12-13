<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@include file = "components/common_css_js.jsp" %>
</head>
<body>
	
		<div class="row">
			<div class=" align-items-center col-md-4 offset-4" style = "background-color: violet">
			<div class="card  mt-5">
			<div class = "card-body">
				<form action = "LoginServlet" method = "post">

					<h3 class = "m-3 ">Login!!</h3>
					<div class=" m-3 form-group ">
						<label for="exampleInputEmail1" class="form-label">Email
							address</label> <input type="email" class="form-control"
							id="inputsm" aria-describedby="emailHelp" name = "username">
						<div id="emailHelp" class="form-text">We'll never share your
							email with anyone else.</div>
					</div>
					<div class="m-3 form-group">
						<label for="exampleInputPassword1" class="form-label">Password</label>
						<input type="password" class="form-control"
							id="exampleInputPassword1" name= "password">
					</div>
					
					<button type="submit" class="btn btn-success m-3">Submit</button>
					<button type="reset" class="btn btn-warning m-3">Reset</button>
				</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>