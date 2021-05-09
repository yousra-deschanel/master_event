<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>MasterEvent | Sign Up </title>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body >     
             
              
               
<div class="container">
		<div class="img">
		
			<div > <%@include file="/WEB-INF/img/reg.svg"%></div>
		</div>
		<div class="login-content">
			<form method="post" action="PageServ">
				<h2>Sign Up</h2>
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
           		    	
           		    	<input type="tel" name="phone" class="input"  placeholder="Phone" required>
            	   </div>
            	</div>
            	 		<div class="input-div pass">
           		   <div class="i"> 
           		    	<i class="fas fa-lock"></i>
           		   </div>
           		   <div class="div">
           		   <select class="select-css" required>
						  <option disabled selected >Select Account Type:</option>
						  <option>Service Provider</option>
						  <option>Client</option>
						  </select>
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
            	
            	<input type="submit" class="btn" value="Register">
            	<a href="/MasterEvent//Login"><h3>already have an account ? login from here</h3></a>
            </form>
            
            </div>
            </div>


</body>
</html>