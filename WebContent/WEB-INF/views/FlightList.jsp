<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body>

<c:choose>
	<c:when test="${flightList.size() > 0}">
		<table class="table">
			<thead class="thead-dark">

				<tr>
					<th scope="col">Flight No</th>
					<th scope="col">Arrival Location</th>
					<th scope="col">Departure Location</th>
					<th scope="col">Time</th>
					<th scope="col">Duration</th>
				</tr>
			</thead>
			<c:forEach var="flight" items="${flightList}">
				<tbody>

					<tr>
						<td><c:out value="${flight.flightNo}" /></td>
						<td><c:out value="${flight.arrLoc}" /></td>
						<td><c:out value="${flight.depLoc}" /></td>
						<td><c:out value="${flight.flightTime}" /></td>
						<td><c:out value="${flight.flightDuration}" /></td>
					</tr>

				</tbody>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
 THERE IS NON FLIGHT AVAILABLE
  </c:otherwise>
</c:choose>
</body>
</html>