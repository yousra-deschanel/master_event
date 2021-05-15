<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style><%@include file="/WEB-INF/css/style2.css"%></style>
   <style><%@include file="/WEB-INF/css/styleHOME.css"%></style>
	<title>MasterEvent | Event Creation </title>
	
</head>
<body>
    	<nav class="nav main-nav">
            <ul>
                <li><a href="/MasterEvent//Home">Home</a> </li>
                <li> <a href="">About</a> </li>
                <li><a href="">Event</a> </li>
                <li><a href="/MasterEvent//SignUp">SignUp</a> </li>
                <li><a href="/MasterEvent//Login">SignIn as client </a></li>
  				<li><a href="/MasterEvent//Login">SignIn as provider</a></li>
            </ul>
        </nav>
        
<div class="sidenav">
    <a href="/MasterEvent//PageEv">Event >creation </a>
    <a   href="<%=request.getContextPath()%>/list">Event >informations </a>
      <br><br>
  <a href="/MasterEvent//Serv">Registration</a>
  <a href="#clients">Finance</a>
  <a href="#contact">Food</a>
  <a href="#contact">Location</a>
  <a href="#contact">Tech</a>
  <a href="#contact">Marketing</a>
  <a href="#contact">Sponsor</a>
  <a href="#contact">OverView</a>
</div>

<div class="wrapper">

    
<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: grey">

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Events</a></li>
			</ul>

			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${todo != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${todo == null}">
					<form action="insert" method="post">
				</c:if>

				
					<h2>
						<c:if test="${todo != null}">
            			Edit Event
            		</c:if>
						<c:if test="${todo == null}">
            			Add New Event
            		</c:if>
					</h2>
				</caption>

				<c:if test="${todo != null}">
					<input type="hidden" name="id" value="<c:out value='${todo.id}' />" />
				</c:if>
    
    <div class="form">
       <div class="inputfield">
          <label>Event Title</label>
          <input type="text" name="event_title" class="input" required>
          
       </div>  
<div class="inputfield">
          <label>Event Type</label>
	 <div class="custom_select">
          <select name="event_type" required>
          <option value="" disabled selected ></option>

            <option >Speaker session</option>
            <option >Networking session </option>
	     	<option> Conference</option>
            <option > Seminar </option>
             <option >Workshop and classes</option>
            <option >Trade show and expos </option>
	     	<option> Competition and Awards  </option>
            <option > Festival and parties</option>
          </select>
        </div>
          
       </div>
        <div class="inputfield">
          <label>Description</label>
          <textarea name="description" class="textarea" required></textarea>
       </div>  
      
       <div class="inputfield">
        <label>Start Date</label>
        <input type="date" name="start_date" class="input" required>
     </div> 
      <div class="inputfield">
          <label>End Date</label>
        <input type="date" name="end_date" class="input" required>
       </div> 
               
      <div class="inputfield">
        <input type="submit" value="Submit" class="btn">
      </div>
    </div>
    </form>
</div>	
	
</body>
</html>