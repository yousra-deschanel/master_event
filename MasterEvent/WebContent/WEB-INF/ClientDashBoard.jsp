<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style><%@include file="/WEB-INF/css/client.css"%></style>
   <style><%@include file="/WEB-INF/css/styleHOME.css"%></style>
<title>MasterEvent | Client Panel </title>
</head>
<body>
    	<nav class="nav main-nav">
            <ul>
                <li><a href="/MasterEvent//Home">Home</a> </li>
                <li> <a href="">About</a> </li>
                <li><a href="">Event</a> </li>
                <li><a href="/MasterEvent//Register">SignUp</a> </li>
                <li><a href="/MasterEvent//Login">SignIn as client </a></li>
  				<li><a href="/MasterEvent//Login">SignIn as provider</a></li>
            </ul>
        </nav>



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
   

</body>
</html>