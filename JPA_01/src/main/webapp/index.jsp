<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<style>
body {
	margin: 5%;
	background-color: lightblue;
}

h3{
color: red;
}
</style>
<title>This is Chocolate Page</title>
</head>
<body>

	<form action="send" method="post">
		<h2>Save Your Chocolate</h2>

		<div class="form-row">
			<div class="form-group">
				<input type="text" class="form-control" name="name"
					placeholder="name">
			</div>

			<div class="form-group">
				<input type="number" class="form-control" name="price"
					placeholder="price" required="required">
			</div>

			<div class="form-group">
				<input type="text" class="form-control" name="brand"
					placeholder="brand name">
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Save</button>

	</form>
	<h3>${save} ${exist}</h3> 

	<hr>
	<h2>Find Chocolate By Id</h2>
	<form action="find">
		<div class="form-row">
			<div class="form-group">
				<input type="number" class="form-control" name="id"
					placeholder="Find by Id" required="required" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Find</button>
	</form>
	<h3>${findMessage} </h3> 

	<hr>
	<h2>Read All</h2>
	
	<form action="sortId">
		<button class="btn btn-primary" type="submit">Sort By ID</button>
	</form>
	<br>
	<form action="sortPrice">
		<button class="btn btn-primary" type="submit">Sort By Price</button>
	</form>
	<h3>${readMessage}</h3> 
	

	<hr>
	<h2>Find By Name</h2>
	<form action="findByName">
		<div class="form-row">
			<div class="form-group">
				<input type="text" class="form-control" name="name"
					placeholder="Find by Name" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Search</button>
	</form>
	<h3>${foundMessage}</h3> <h3>${nameNotValid}</h3> <h3>${nameNotFound}</h3> 

	<hr>
	<h2>Update Price By Chocolate Name</h2>
	<form action="updateName" method="post">
		<div class="form-row">
			<div class="form-group">
				<input type="number" class="form-control" name="price"
					placeholder="New Price" required="required" />
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="name"
					placeholder="Chocolate Name" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Update</button>
	</form>
	<h3>${updateMessage} ${inputNotValid}</h3> 
	
	<hr>
	<h2>Delete Chocolate By Id</h2>
	<form action="deleteById" method="post">
		<div class="form-row">
			<div class="form-group">
				<input type="number" class="form-control" name="id"
					placeholder="Delete by Id" required="required" />
			</div>
		</div>
		<button class="btn btn-primary" type="submit">Delete</button>
	</form>
	<h3>${delete} ${idValid} </h3> 
	
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
</body>
</html>