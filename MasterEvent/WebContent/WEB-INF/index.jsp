<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/WEB-INF/css/styleHOME.css"%></style>
	<title>MasterEvent | Home]</title>
</head>
<body>
    <header class="main-header">
    	<nav class="nav main-nav">
            <ul>
                <li><a href="/MasterEvent//Home">Home</a> </li>
                <li> <a href="">About</a> </li>
                <li><a href="">Event</a> </li>
                <li><a href="/MasterEvent/Register">SignUp</a> </li>
                <li><a href="/MasterEvent//Login">SignIn as client </a></li>
  				<li><a href="/MasterEvent//ProviderLogin">SignIn as provider</a></li>
  				<li><a href="/MasterEvent//Administrator">Admin Panel</a></li>
            </ul>
        </nav>

        <h1 class="name-large">MasterEvent </h1>
        <h2 class="bio"> ALL IN ONE PLACE, manage your event ,control everything from a single dashboard, offer your service
        and collab with other services, easy contact for both providers and end users. </h2>
    </header>
    
            <section class="content-section ">

 		 <br>
        <br>
        <br>
       
		

        <div class="project-setup">
        
        <ul> <div class="service-image"> <%@include file="/WEB-INF/img/list.svg"%></div>
        <h4 >Registration Service</h4> </ul>
        
        <ul >
         <div class="service-image"> <%@include file="/WEB-INF/img/card.svg"%></div>
        <h4 >Finance Service  </h4></ul>
        
        <ul >
         <div class="service-image"> <%@include file="/WEB-INF/img/food.svg"%></div>
         <h4 >Restauration Services  </h4></ul>
         <ul >
          <div class="service-image"> <%@include file="/WEB-INF/img/map.svg"%></div>
          <h4 >Location Service </h4></ul>
          <ul >
         </div>
         
         <div class="project-setup">
         
           <ul ><div class="service-image"> <%@include file="/WEB-INF/img/vid.svg"%></div>
           <h4 >Technology Service </h4></ul>
           <ul >
            <div class="service-image"> <%@include file="/WEB-INF/img/marketing.svg"%></div>
            <h4 >Marketing Service </h4></ul>
             <ul >
            <div class="service-image"> <%@include file="/WEB-INF/img/sponsor.svg"%></div>
            <h4 >Sponsoring Service </h4></ul>
        </div>
        <br>
        <br>
        <br>


    </section>

    <footer class="main-footer">
        <h3  class="footer-title"> </h3>
        <ul >
            
        </ul>
    </footer>


</body>
</html>