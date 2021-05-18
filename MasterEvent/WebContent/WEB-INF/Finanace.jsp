<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Services</title>
<style><%@include file="/WEB-INF/css/client.css"%></style>
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

<div class="main">

</div>

<div>

<table >
  <tr> <th><h3>Choose an available service:</h3> </th></tr>
  <tr>
  
    <th>Service Name</th>
    <th>Main company</th>
    <th>More infos</th>
     <th>available</th>
    <th> actions </th>
  </tr>

<tr>

<td>cloud</td>
<td>usdb</td>
<td>providing afordable meals and menus all over the world flavors ...</td>
<td>Yes</td>
<td> <input type="submit" value="Select"></td>
  </tr>
</div>
<!--<c:forEach var="evenement" items="${evenements}">
<tr>

<td><c:out value="${evenement.event_title}" /></td>
<td> <c:out value="${evenement.event_type}" /></td>
<td> <c:out value="${evenement.description }" /></td>
<td> <c:out value="${evenement.start_date}" /></td>
<td> <c:out value="${evenement.end_date}" /></td>
<td> <c:out value="${evenement.country}" /></td>
<td> <input type="submit" value="Select">
  </tr>
</c:forEach>
  -->


</table>
</body>
</html>