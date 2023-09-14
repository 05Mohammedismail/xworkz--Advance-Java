<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>MY-JSP</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  

<style type="text/css">

body{
background-color: rgb(204, 223, 194);
}

body h1{
text-align: center;
font-size: 4em;
}
.navbar-brand{
font-size: 2em;
}
.navbar{
background: green;
margin-bottom: 1px;
font-weight:600;
color: white;
}

.nav-link:hover{
text-decoration: underline;
}

</style>
</head>
  
  <body>
   <nav class="navbar navbar-expand-lg navbar-light">
  <a class="navbar-brand">HOME</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link text-white" href="product.jsp">PRODUCT</a>
      </li>
      <li class="nav-item">
        <a class="nav-link text-white" href="player.jsp">PLAYER</a>
      </li>
      <li class="nav-item">
        <a class="nav-link text-white" href="airport.jsp">AIRPORT</a>
      </li>
    </ul>
  </div>
</nav>

<h1>Please select your area</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>