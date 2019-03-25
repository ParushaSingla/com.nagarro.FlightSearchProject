<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
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
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			minDate : 0,
			changeMonth : true,
			changeYear : true,
			dateFormat : 'mm-dd-yy'
		});
	});
</script>
</head>
<body>
	<form action="input" method="post">
		<div class="form-group">
			<label for="formGroupExampleInput">Departure Location</label> <input
				type="text" class="form-control" id="formGroupExampleInput"
				pattern="[A-Z]{3}" title="Size should be three" name="input1"
				placeholder="Departure Location">

		</div>
		<div class="form-group">
			<label for="formGroupExampleInput2">Arrival Location</label> <input
				type="text" class="form-control" id="formGroupExampleInput2"
				pattern="[A-Z]{3}" title="Size should be three" name="input2"
				placeholder="Arrival Location">
		</div>
		<div class="form-group">
			<label for="inputState">Flight Class</label> <select id="inputState"
				name="input3" class="form-control">
				<option selected>E</option>
				<option>EB</option>
			</select>
		</div>

		<div class="form-group">
			<label for="inputState">Output Preference</label> <select
				id="inputState" class="form-control" name="input4">
				<option selected>Fare</option>
				<option>Fare And Flight Duration</option>
			</select>
		</div>
		<p>
			Date: <input type="text" id="datepicker" name="input5">
		</p>
		<input class="btn btn-primary" type="submit" value="Submit">
	</form>
</body>
</html>