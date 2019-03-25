<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
#top {
	height: 200px;
}

#main {
	width: 400px;
}

#login {
	text-align: left;
	color: darkblue;
}

#submit-buton {
	text-align: right;
}

#form {
	top: 20px;
	width: 300px;
	left: 25px;
	background-color: cyan;
	border: 3px solid black;
	left: 25px;
}
</style>
</head>
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid row">
		<div class="col-4"></div>
		<div class="col-6">
			<div class="row" id="top"></div>
			<div class="row" id="main">
				<div class="card text-center" style="width: 700px">
					<div class="card-header" id="login">
						<b>Login</b>
					</div>
					<div class="card-body">
						<!-- form -->
						<form  action="add" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">User Name</label> <input
									type="text" name="uname" class="form-control"
									id="exampleInputEmail1" placeholder="User Name">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" name="pass" class="form-control"
									id="exampleInputPassword1" placeholder="Password">
							</div>
							
							<div class="card-footer text-muted" id="submit-buton">
								<!-- button -->
								<button type="submit" class="btn btn-primary">Login >></button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-2"></div>
		</div>
	</div>
</body>

</html>