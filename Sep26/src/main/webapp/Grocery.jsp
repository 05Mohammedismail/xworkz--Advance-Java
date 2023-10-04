<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Grocery-JSP</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<style type="text/css">
body {
	background-color: rgb(204, 223, 194);
}

body h1 {
	font-size: 3em;
	text-align: center;
}

.navbar-brand {
	font-size: 2em;
}

.navbar {
	background: green;
	margin-bottom: 1px;
	font-weight: 600;
	color: white;
}

.nav-link:hover {
	text-decoration: underline;
}

.form-row {
	margin: -15px 30px 20px 30px;
	position: relative;
}

.send {
	position: absolute;
	right: 47%;
	border-radius: 40px;
	height: 3em;
	width: 8em;
	outline: none;
	border: none;
	font-weight: 500;
	cursor: pointer;
}

.send:hover {
	background: lime;
}

.form-group label {
	font-weight: 600;
}
</style>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light">

		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link text-white"
					href="index.jsp">HOME</a></li>
			</ul>

			<a class="navbar-brand">GROCERY</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
	</nav>

	<h1>Please fill Grocery details</h1>
	<pre> 
	   <h2>
	       Total Saved : ${total}  
	  	<a href="view">View</a>
	  </h2>
	</pre>

	<form action="grocery" method="post">
		<div class="form-row">

			<div class="form-group col-md-12">
				<label>Name</label> <input type="text" class="form-control"
					placeholder="Name" name="name" required="required">
			</div>

			<div class="form-group col-md-12">
				<label>Type</label> <input type="text" class="form-control"
					placeholder="type" name="type" required="required">
			</div>


			<div class="form-group col-md-12">
				<label>Price</label> <input type="text" class="form-control"
					placeholder="weight" name="price" required="required">
			</div>

			<div class="form-group col-md-12">
				<label>Quantity</label> <br> <select name="quantity"
					required="required">
					<option value="0" selected>--Select--</option>
					<option>0.5</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					<option>10</option>
				</select>
			</div>

		</div>

		<input class="send" type="submit" value="Send">
	</form>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>