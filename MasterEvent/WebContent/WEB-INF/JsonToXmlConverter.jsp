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
background-color:black;
}</style>
<title>convert JSON files to XML files</title>
</head>
<body>
<form class="login-form" action="<%=request.getContextPath()%>/JsonToXmlController" method="post">
  <h1>JSON to XML converting Tool</h1>
  <br>
  <div class="form-input-material">
  <label for="destination">Enter your input path for json file</label>
    <input type="text" name="input" id="destination" placeholder=" " autocomplete="off" class="form-control-material" required />
    
  </div>
  <br>
  <div class="form-input-material">
     <label for="name">Enter your output path for xml file</label>
    <input type="text" name="output" id="name" placeholder=" " autocomplete="off" class="form-control-material" required />
 
  </div>
   <br>  <br>
  <button type="submit" class="btn btn-primary btn-ghost">Submit</button>
</form>
</body>
</html>