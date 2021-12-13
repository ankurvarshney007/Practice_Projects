<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up page</title>
<%@include file="components/common_css_js.jsp"%>

</head>
<body style="padding-top: 40px; background-color: #f5f5f5;">

	<div class="row mt-5">
		<div class="col-md-4 offset-md-4">
			<div class="card">
				<div class="card-body">
					<form action="SignupServlet" method="POST">
						<h3 class="text-center my-3">
							<i class="fa fa-user-plus " style="font-size: 60px;"
								aria-hidden="true"></i>
						</h3>
						<h4 class="text-center ">SignUp!!</h4>
						<div class="form-group">
							<label for="uname" class="form-label">UserName</label> <input
								type="text" class="form-control" id="uname" name="name"
								placeholder="enter your name" required
								aria-describedby="emailHelp">
						</div>

						<div class="form-group mt-2">
							<label for="uemail" class="form-label">Email address</label> <input
								type="email" class="form-control" id="uemail" name="email"
								placeholder="enter your email" required
								aria-describedby="emailHelp">
						</div>

						<div class="form-group mt-2">
							<label for="uphone" class="form-label">Phone number</label> <input
								type="number" class="form-control" id="uphone" name="phone"
								placeholder="enter your phone number" required
								aria-describedby="emailHelp">
						</div>



						<div class="form-group mt-2">
							<label for="upwd" class="form-label">Password</label> <input
								type="password" class="form-control" id="upwd" name="password"
								required placeholder="enter your password"
								aria-describedby="emailHelp">
						</div>

						<div class="form-group mt-2">
							<label for="uaddr" class="form-label">Address</label>
							<textarea style="height: 50px" name='addr' id='uaddr'
								class='form-control'>Enter your address</textarea>
						</div>

						<div class="container mt-4 text-center">
							<p>By clicking Sign Up, you agree to our Terms Policy.</p>
							<button class="w-70 btn btn-lg btn-primary" type="submit">Sign
								in</button>
							<p class="mt-5 mb-3 text-muted">© 2020-2021</p>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>


	<!-- <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script> -->
	<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script> -->

</body>
</html>