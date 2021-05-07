<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


  

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style><%@include file="/WEB-INF/css/style2.css"%></style>
	<title>MasterEvent | Event Creation </title>
	
</head>
<body>

<div class="wrapper">
    <div class="title">
      Create an event :
    </div>
    
    <form method="post" action="PageEv">
    
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
            <option >Meetings & Conferences</option>
            <option >Incentive & Retreat Events</option>
		<option>Conventions</option>
            <option >Exhibitions</option>
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
          <label>Country</label>
          <input type="text" name="country" class="input" required>
          
       </div>  
      <div class="inputfield">
        <input type="submit" value="Submit" class="btn">
      </div>

    </div>
    </form>
</div>	
	
</body>
</html>