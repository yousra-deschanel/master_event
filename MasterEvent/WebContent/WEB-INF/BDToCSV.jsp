<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@include file="/WEB-INF/css/formcss.css"%></style>
  <style><%@include file="/WEB-INF/css/style2.css"%></style>
  <style>
.login-form{
background-color:#7F2345;
}</style>
<title>convert BD to CSV files</title>
</head>
<body>
<form class="login-form" action="<%=request.getContextPath()%>/BDToCSVController" method="post">
  <h1>database to csv converting Tool</h1>
  <br>
  <div class="form-input-material">
  <label for="destination">Enter the name of your csv file</label>
    <input type="text" name="csv" id="destination" placeholder=" " autocomplete="off" class="form-control-material" />
    
  </div>

 <br> <br>
  <button type="submit" class="btn btn-primary btn-ghost">Submit</button>
</form>
</body>
</html>