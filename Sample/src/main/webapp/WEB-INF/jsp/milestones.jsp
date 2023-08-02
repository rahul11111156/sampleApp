<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

th{
background-color: red;
color:white;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

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
padding-left: 800px;
pointer-events:none;
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
<a href="/homepage">Home</a>
  <a href="/milestones"><i class="fa fa-fw fa-dashboard"></i>Dashboard</a> 
 <a id ="details" href="/details"><i class="fa fa-fw fa-user"></i>users</a>
  <a id="user"><i class="fa fa-fw fa-user"></i>${username}</a>
  <a href="/logout">logout</a>
</div>
<h3>Milestones(This month)</h3>
<table>
  <tr>
    <th>Application</th>
    <th>Sub-Application</th>
      <th>Release-Name</th>
      <th>Release-Date</th>
      <th>Release-Description</th>
      <th>createby</th>
      <th>createDate</th>
  </tr>
  <c:forEach items="${milestones}" var="mile">
  <tr>
    <td><c:out value="${mile.application}"/></td>
    <td><c:out value="${mile.subapplication}"/></td>
    <td><c:out value="${mile.releasename}"/></td>
    <td><c:out value="${mile.releasedate}"/></td>
    <td><c:out value="${mile.releasedesc}"/></td>
    <td><c:out value="${mile.createby}"/></td>
    <td><c:out value="${mile.createdate}"/></td>
  </tr>
  </c:forEach>
</table>

</body>
</html>