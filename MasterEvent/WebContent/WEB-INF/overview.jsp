<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@include file="/WEB-INF/css/client.css"%></style>
   <style><%@include file="/WEB-INF/css/styleHOME.css"%></style>
   <style>
table {
  width: 75%;
  margin-left:100 px;
  position: right;
  float: right;
}
table, th, td {
  border: 1px solid black;
}</style>
<title>Event | OverView</title>
</head>
<body>
<div class="sidenav">

    <a href="<%=request.getContextPath()%>/new">Event >creation </a>
    <a   href="<%=request.getContextPath()%>/list">Event >informations </a>
      <br><br>
  <a href="/MasterEvent//Serv">Registration</a>
  <a href="/MasterEvent//fnc">Finance</a>
  <a href="#contact">Food</a>
  <a href="#contact">Location</a>
  <a href="#contact">Tech</a>
  <a href="#contact">Marketing</a>
  <a href="#contact">Sponsor</a>
  <a href="/MasterEvent/Ov">OverView</a>
</div>
<div class="rightside">
<table>
<thead>
		<tr>
			<th>Registration</th>
			<th>Finance</th>
			<th>Food</th>
			<th>Location</th>
			<th>Marketing</th>
			<th>Sponsor</th>
			<th>OverView</th>
		</tr>
</thead>
<tbody>



</tbody>
</table>					

</div>
</body>
</html>