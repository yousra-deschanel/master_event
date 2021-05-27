
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>MasterEvent | Login </title>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
	   <style><%@include file="/WEB-INF/css/styleHOME.css"%></style>
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body >     
                 	<nav class="nav main-nav">
            <ul>
                <li><a href="/MasterEvent//Home">Home</a> </li>
                <li> <a href="">About</a> </li>
                <li><a href="">Event</a> </li>
             
            </ul>
        </nav>
              
               
<div class="container">
	<div class="img">
		
			<div > <%@include file="/WEB-INF/img/admin.svg"%></div>
		</div>
		<div class="login-content">
				<div class="col-md-6 col-md-offset-3">
             
		
			<form action="<%=request.getContextPath()%>/AdminPanel" method="post">
				<h3 >Admin LogIn </h3>
				<br ><br ><br >
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fas fa-user"></i>
           		   </div>
           		   <div class="div">
           		   		
           		   		<input type="email" name="email" class="input" placeholder="Email" required>
           		   </div>
           		</div>
           		<div class="input-div pass">
           		   <div class="i"> 
           		    	<i class="fas fa-lock"></i>
           		   </div>
           		   <div class="div">
           		    	
           		    	<input type="password" name="password" class="input"  placeholder="Password" required>
            	   </div>
            	</div>
            	
            	<input type="submit" class="btn" value="Login">
    
            </form>
            </div>
            </div>
		  </div>	
</body>
</html>