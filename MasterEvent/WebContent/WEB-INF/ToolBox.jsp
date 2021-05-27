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
      <style>
.login-form{
background-color:#0F7AA4;
}</style>
	<title>MasterEvent | Services </title>
	
</head>

<body>


    
<form class="login-form" action="javascript:void(0);">
  <h1>Tool Box</h1>
  <br>
  <h3>Choose an available Parser:</h3>
  <br>
<table >
   
  <tr>
  
    <th>Parser Name                                                            </th>
 	<br>
    <th> actions </th>
  </tr>
<tr>
  
    <td>____________________________________________________________________</th>
 	
    <td>__________</th>
  </tr>
<tr>
	<td>convert image into pdf</td>
	
	<td><a href="/MasterEvent/ImgTopdfTool">Test</a></td>
</tr>

<tr>
	<td>convert databae to CSV file </td>
	<td><a href="/MasterEvent/BDToCSV">Test</a></td>
</tr>

<tr>
	<td>convert json to xml</td>
	
	<td><a href="/MasterEvent/JsonToXml">Test</a></td>
</tr>
</table>

 
</form>

  </body>
</html>