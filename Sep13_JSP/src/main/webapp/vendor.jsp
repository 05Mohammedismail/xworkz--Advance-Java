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

.form-row{
margin: 20px;
position: relative;
}

.send{
position: absolute;
right: 45%;
border-radius: 40px;
height: 3em;
width: 8em; 
outline: none;
border: none;
font-weight: 500;
cursor: pointer;
}

.send:hover{
background: lime;
}

.form-control{
text-align: center;
}

.form-group label{
font-weight: 600;
}
</style>
</head>
  
  <body>
   <nav class="navbar navbar-expand-lg navbar-light">
  
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link text-white" href="index.jsp">HOME</a>
      </li>
      </ul>
      
       <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link text-white" href="product.jsp">PRODUCT</a>
      </li>
    </ul>
    
      <a class="navbar-brand">VENDOR</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
     
  </div>
</nav>

<h1>Vendor Details</h1>
<form action="vendor" method="post">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label class="label">Name</label>
      <input type="text" class="form-control" placeholder="Name" name="name">
    </div>
    
    <div class="form-group col-md-6">
      <label>GST-Number</label>
      <input type="number" class="form-control" placeholder="GST-number" name="gst">
    </div>
    
    <div class="form-group col-md-6">
      <label >Owner</label>
      <input type="text" class="form-control" placeholder="Owner" name="owner">
    </div>
    
    <div class="form-group col-md-6">
      <label>Location</label>
      <input type="text" class="form-control" placeholder="Location" name="location">
    </div>
 </div>
 <input class="send" type="submit" value="Send">
</form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>