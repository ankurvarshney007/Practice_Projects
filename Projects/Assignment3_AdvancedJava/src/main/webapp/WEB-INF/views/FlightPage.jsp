<%@page import="org.hibernate.query.criteria.internal.expression.function.LengthFunction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import = "org.nagarro.model.FlightDetails" %>
<%@page import = "org.nagarro.service.FlightDetailsService" %>
<%@page import = "java.util.*" %>

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

<title>Flight_Search!</title>
</head>
<body style="background-color: #281c5333;">
	<h1 class="text-center m-3" style="font-size: 30px;">Flight Search</h1>
	<hr>
	<div class="container mt-5">


		<form method="post" action="searchdetails" class="needs-validation"
			novalidate>
			<div class="form-row">
				<div class="col-md-3 mb-3"></div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom05">Departure Location</label> <input
						type="text" name="departurelocation" class="form-control"
						placeholder="DEL/MUB/BGR" required>
					<div class="invalid-feedback">Please provide Departure
						Location.</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom05">Arrival Location</label> <input
						type="text" name="arrivallocation" class="form-control"
						placeholder="DEL/MUB/BGR" s required>
					<div class="invalid-feedback">Please provide Arrival
						Location.</div>
				</div>
				<div class="col-md-3 mb-3"></div>
			</div>
			<div class="form-row">
				<div class="col-md-2 mb-3"></div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom03">Flight Date</label> <input
						type="text" name="flightdate" placeholder="dd-mm-yy"
						class="form-control" id="validationCustom03" required>
					<div class="invalid-feedback">Please provide a valid Date.</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom04">Flight Class</label> <select
						class="custom-select" name="flightclass" id="validationCustom04"
						required>
						<option selected disabled value="">E(Economic) or
							B(Business)</option>
						<option>E</option>
						<option>B</option>
					</select>
					<div class="invalid-feedback">Please select a valid Class.</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom04">Output Preference</label> <select
						class="custom-select" name="outputpreference"
						id="validationCustom04" required>
						<option selected disabled value="">fare or both</option>
						<option>sorted only by fare</option>
						<option>sorted by both fare and flight duration.</option>
					</select>
					<div class="invalid-feedback">Please select a valid
						Preference.</div>
				</div>
				<div class="col-md-1 mb-3"></div>
			</div>
			<div class="text-center">
				<button class="btn btn-primary " type="submit">Submit
					Details</button>
			</div>
		</form>
		
		<table class = "table table-bordered mt-3">
			<tr>
				<th>FlightNo</th>
				<th>Arrival Location</th>
				<th>Departure Location</th>
				<th>Flight Class</th>
				<th>Flight Time</th>
				<th>Flight Duration</th>
				<th>Flight Fare</th>
		</tr>
		 
		
		<c:if test ="${flightList.size()==0}">
		<h3><i>Sorry! No flights available</i></h3>
		</c:if>
		<c:forEach items="${flightList }" var="flight">
<tr>
    <td>${flight.getFlightNo()}</td>
    <td>${flight.getArrivalLocation()}</td>
    <td>${flight.getDepartureLocation()}</td>
    <td>${flight.getFlightClass()}</td>
   
    <td>${flight.getFlightTime()}</td>
    <td>${flight.getFlightDuration()}</td>
     <td>${flight.getFlightFare()}</td>
    </tr>
    

    

</c:forEach>
		
		
		
		
		</table>

	</div>

	<script>
// Example starter JavaScript for disabling form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>



	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>

</body>
</html>