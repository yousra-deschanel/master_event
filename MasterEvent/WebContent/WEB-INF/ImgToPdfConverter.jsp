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
background-color:#0D7F72;
}</style>
<title>convert imagesToPdf tool</title>
</head>
<body>
<form class="login-form" action="<%=request.getContextPath()%>/ImgTopdfController" method="post">
  <h1>Image To pdf converting Tool</h1>
  <br>
  <div class="form-input-material">
  <label for="destination">Enter your destination folder name where save PDF </label>
    <input type="text" name="destination" id="destination" placeholder=" " autocomplete="off" class="form-control-material" required />
    
  </div>
  <br>
  <div class="form-input-material">
     <label for="name">Enter your PDF File Name</label>
    <input type="text" name="name" id="name" placeholder=" " autocomplete="off" class="form-control-material" required />
 
  </div>
 <br>
    <div class="form-input-material">
     <label for="sourcePath"> Enter your selected image files name with source folder</label>
    <input type="text" name="sourcePath" id="sourcePath" placeholder=" " autocomplete="off" class="form-control-material" required />
 
  </div>
    <br>  <br>
  <button type="submit" class="btn btn-primary btn-ghost">Submit</button>
</form>
</body>
</html>