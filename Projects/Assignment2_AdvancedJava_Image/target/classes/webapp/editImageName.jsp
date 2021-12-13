<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Image</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"crossorigin="anonymous">
</head>

<body style="background-color: #1c53453b;">
<div style="padding:25px;">
<h3 align ="center">Edit Image Name</h3>
</div>
<div class="container" >
	<form action="editImage" action="ImageUtiltity" method="post">
		<%
			session.setAttribute("image_s.NO", request.getParameter("image_s.NO"));
		%>
		FileName: <input type="text" value="Name" name="fileName"> <br>
		<input type="submit" value="submit"  class="btn btn-secondary btn-sm active" role="button" aria-pressed="true"/>

	</form>
</div>
</body>
</html>