<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>My-JSP</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  
  <style>
/* Internal CSS for styling the navigation bar */
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
	color: white;
	border-radius: 2px;
}

h1 {
	color: white;
}
</style>
</head>
<body>
	<nav>
		<a href="index.jsp">Home</a> <a href="total">Temple</a>
	</nav>

	<div>
		<table class="table table-bordered">
			<tr>
				<th>Name</th>
				<th>Place</th>
				<th>God Name</th>
				<th>Const Year</th>
			</tr>
			<jstl:forEach items="${view}" var="dto">
				<tr>
					<td>${dto.name}</td>
					<td>${dto.place}</td>
					<td>${dto.godName}</td>
					<td>${dto.constructedIn}</td>
				</tr>

			</jstl:forEach>
		</table>
	</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>	
</body>
</html>
