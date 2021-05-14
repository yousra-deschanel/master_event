<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login INFO</title>
</head>
<body>
<h3>Your LOGIN infos are:</h3>



<c:forEach var="utilisateur" items="${utilisateurs}">

<c:out value="${utilisateur.email}" />
<c:out value="${utilisateur.phone}" />
<c:out value="${utilisateur.type}" />
<c:out value="${utilisateur.password}" />

</c:forEach>

</body>
</html>