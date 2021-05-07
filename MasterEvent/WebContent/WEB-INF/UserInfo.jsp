<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>MasterEvent | Login </title>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body >


<ul>
<c:forEach var="utilisateur" items="${utilisateurs}">
<li><c:out value="${utilisateur.nom}" />
<c:out value="${utilisateur.prenom}" /></li> 

</c:forEach>
</ul>



</body>
</html>