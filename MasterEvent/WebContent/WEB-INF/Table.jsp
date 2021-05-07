<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Table</title>
<style>
table {
  width: 100%;
}
table, th, td {
  border: 1px solid black;
}</style>
</head>
<body>
<h3>Your event infos are:</h3>
<table >
  <tr>
  
    <th>event title</th>
    <th>event type</th>
    <th>description</th>
     <th>start date </th>
    <th>end date</th>
    <th>country</th>
    <th> actions </th>
  </tr>


<c:forEach var="evenement" items="${evenements}">
<tr>

<td><c:out value="${evenement.event_title}" /></td>
<td> <c:out value="${evenement.event_type}" /></td>
<td> <c:out value="${evenement.description }" /></td>
<td> <c:out value="${evenement.start_date}" /></td>
<td> <c:out value="${evenement.end_date}" /></td>
<td> <c:out value="${evenement.country}" /></td>
<td> <input type="submit" value="Edit">
<input type="submit" value="Delete"> </td>
  </tr>
</c:forEach>


</table>
</body>
</html>