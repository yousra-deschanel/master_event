<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style><%@include file="/WEB-INF/css/formcss.css"%></style>
  <style><%@include file="/WEB-INF/css/style2.css"%></style>
    
	<title>MasterEvent | Services </title>
	
</head>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
			  ></script>
		
	
	<script>
	$(document).ready(function() {
    var max_fields      = 10; //maximum input boxes allowed
    var wrapper         = $(".input_fields_wrap"); //Fields wrapper
    var add_button      = $(".add_field_button"); //Add button ID
   
    var x = 1; //initlal text box count
	
	
   $(add_button).click(function(e){ //on add input button click
        e.preventDefault();
        if(x < max_fields){ //max input box allowed
	
		     //text box increment
            $(wrapper).append('<div><input type="text" name="mytext[]"/><a href="#" class="remove_field">Remove</a></div>'); //add input box
            x++; 
	  }
    });
   
    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
       
		e.preventDefault(); 
		$(this).parent('div').remove(); 
		x--;
    })
});
	
	</script>
<body>


    
<form class="login-form" action="javascript:void(0);" action="<%=request.getContextPath()%>/ServiceForm" method="post" >
  <h1>Service Form</h1>
  <br>
  <div class="form-input-material">
  <label for="username">Service Name</label>
    <input type="text" name="username" id="username" placeholder=" " autocomplete="off" class="form-control-material" required />
    
  </div>
  <br>
  <div class="form-input-material">
     <label for="password">Main Company</label>
    <input type="text" name="password" id="password" placeholder=" " autocomplete="off" class="form-control-material" required />
 
  </div>
  <br>
  <div class="form-input-material">
          <label>Domain</label>
          <select  class="form-control-material" required>
          <option value="" disabled selected ></option>
            <option >Registration</option>
            <option >Finance</option>
	     	<option>Food</option>
	     	<option>Location</option>
            <option >Tech</option>
            <option >Marketing</option>
	     	<option>Sponsor</option>
          </select>
        </div>
        <br> 
    <div class="form-input-material">
    <label for="password">More infos</label>
    <textarea name="description" class="form-control-material" required></textarea>
    
  </div>
  <br> 
    <div class="form-input-material">
     <label for="password">number of inputs</label>
    <input type="number" name="password" id="password" placeholder=" " autocomplete="off" class="form-control-material" required />
   
  </div>
  <br>
       <div class="input_fields_wrap">
    <button class="add_field_button">Add input</button>
    <div><input type="text" name="mytext[]"></div>
	
     </div>
     <br> 
    <div class="form-input-material">
       <label for="password">number of outputs</label>
    <input type="number" name="password" id="password" placeholder=" " autocomplete="off" class="form-control-material" required />
 
  </div>
  <br> 
       <div class="input_fields_wrap">
    <button class="add_field_button">Add output</button>
    <div><input type="text" name="mytext[]"></div>
	
     </div>
     <br>
  <button type="submit" class="btn btn-primary btn-ghost">Submit</button>
</form>


    
       
<div class="sidenav">
        <div class="sidebar__title">
          <div class="sidebar__img">
 		
          <img src="/WEB-INF/img/logo.png" alt="logo" />
            <h1>MasterEvent</h1>
          </div>
          <i
            onclick="closeSidebar()"
            class="fa fa-times"
            id="sidebarIcon"
            aria-hidden="true"
          ></i>
        </div>

        <div class="sidebar__menu">
          <div class="sidebar__link">
            <i class="fa fa-home"></i>
            <a href="#">Home</a>
          </div>
          <h2>Operations</h2>
             <div class="sidebar__link active_menu_link">
            <i class="fa fa-files-o"></i>
            <a >ADD Service</a>
          </div>
          <div class="sidebar__link">
            <i class="fa fa-building-o"></i>
            <a   href=" ">Service >infos </a>
          </div>

          <div class="sidebar__logout">
            <i class="fa fa-power-off"></i>
            <a href="#">Log out</a>
          </div>
        </div>
      </div>
    </div>




</div>
  </body>
</html>