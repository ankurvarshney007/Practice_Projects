<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="func"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.ArrayList"%>
<%@page import="org.nagarro.dto.Images"%>
<%@page import="org.nagarro.service.ImageService"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>ImageUtility Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>

<body style="background-color: #1c53453b;">
	<div style="padding: 25px;">
		<h3 align="center">Image Management Utility</h3>
		<hr>
	</div>

	<div class="container">
		Hello
		<%=(String) session.getAttribute("userID")%>


		<p>Please select an image file to upload(Max size 1MB)</p>

		<form action="ImageUtiltity" method="post" name="form">
			<input type="file" name="image" multiple> <input type="reset"
				name="cancel" value="cancel"> <input type="submit"
				name="submit" value="submit">
		</form>
		<br>
		<table class="table table-bordered">
			<tr>
				<th>ImageID</th>
				<th>ImageName</th>
				<th>Size(Kb)</th>
				<th>Preview</th>
				<th>Action</th>

			</tr>
			<%
				double size = 0.0;
				int i = 1;
			%>

			<%
				ImageService imageService = new ImageService();
				ArrayList<Images> image = imageService.getImages((String) session.getAttribute("userID"),
						(String) session.getAttribute("password"));

				for (Images img : image) {
			%>
			<tr>

				<td><%=i%></td>
				<td><%=img.getImageName()%></td>
				<td><%=img.getSize()%></td>
				<td><img src="data:image/jpg;base64,<%=img.getBase64Image()%>"
					width="50" height="50"></td>

				<td><a
					href="editImageName.jsp?image_s.NO=<%=img.getImageID()%>">Edit</a>&nbsp;&nbsp;
					<a
					href="/Assignment2_AdvancedJava_Image/deleteImage?image_s.NO=<%=img.getImageID()%>">Delete</a></td>
			</tr>
			<%
				size = size + img.getSize();
					i++;
				}
			%>


		</table>
		<br> <b>Total size:</b>
		<%=size / 1024%>MB

	</div>
</body>
</html>