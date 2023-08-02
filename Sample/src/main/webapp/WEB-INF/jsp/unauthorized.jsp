<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

.navbar {
  width: 100%;
  background-color: red;
  overflow: auto;
}


.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

#user{
padding-left: 900px;
pointer-events:none;
}

#unauthorized{
color:red;
}



.navbar a:hover {
  background-color: #000;
}

.active {
  background-color: #04AA6D;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<body>

<div class="navbar">
  <a href="/milestones"><i class="fa fa-fw fa-dashboard"></i>Dashboard</a>
  <a id ="details" href="/details"><i class="fa fa-fw fa-user"></i>users</a>
  <a id="user"><i class="fa fa-fw fa-user"></i>${username}</a>
  <a href="/logout">logout</a>
</div>
<center><h1 id="unauthorized">unauthorized to access this page!!!!!!</h1></center>

</body>
</html>