<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body {
	font-family: Arial, sans-serif;
	background-color: DarkCyan;
}

nav {
	background-color: LightGreen;
	padding: 10px;
}

nav a {
	text-decoration: none;
	padding: 10px 20px;
	margin-right: 10px;
}

nav a:hover {
	background-color: #2980b9;
	border-radius: 2px;
	color: white;
}

.container {
	width: 50%;
	margin: 0 auto;
	margin-top: 2%;
	margin-left: 5px;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	background-color: LightGreen;
	padding: 20px;
	position:relative; 
}

.container h2 {
	text-align: center;
}

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	margin-bottom: 5px;
}

.form-group input {
	width: 100%;
	border: 1px solid #ccc;
	border-radius: 5px;
	padding-top: 5px;
	padding-bottom: 10px;
	font-size: 2em;
	padding-bottom: 10px;
}

.form-group input.submit:hover {
	background-color: #2980b9;
	cursor: pointer;
}

.total {
	left: 60%; font-family : Arial, sans-serif;
	background-color: Linen;
	float: right;
	margin-top: 2%;
	margin-left: 2%;
	border: 1px solid #ccc;
	border-radius: 5px;
	padding: 10px 50px;
	font-family: Arial, sans-serif;
	position: absolute;
}

.total a {
	text-decoration: none;
	font-size: 2em;
}

.total a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<nav>
		<a href="index.jsp">Home</a> <a href="#">Temple</a>
	</nav>

	<div class="total">
		<h2>Total Saved temples</h2>
		<h1>${total}</h1>
		<br>
		<h1>View temples</h1>
		<a href="view">Here</a>
	</div>

	<div class="container">
		<h2>Temple Details &#128276</h2>

		<form action="save" method="post">
			<div class="form-group">
				<label>Name:</label> <input type="text" id="name" name="name"
					required="required">
			</div>
			<div class="form-group">
				<label>Place:</label> <input type="text" id="place" name="place"
					required="required">
			</div>
			<div class="form-group">
				<label>GodName:</label> <input type="text" id="godName" name="god"
					required="required">
			</div>
			<div class="form-group">
				<label>ContructedYear:</label> <input type="text" id="constructedIn"
					name="constructedIn" required="required">
			</div>
			<div class="form-group">
				<input class="submit" type="submit" value="Submit">
			</div>
		</form>
	</div>
</body>
</html>