<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Events List</title>
<style><%@include file="/WEB-INF/css/client.css"%></style>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>

<div class="sidenav">

    <a href="<%=request.getContextPath()%>/new">Event >creation </a>
    <a   href="<%=request.getContextPath()%>/list">Event >informations </a>
      <br><br>
  <a href="/MasterEvent//Serv">Registration</a>
  <a href="#clients">Finance</a>
  <a href="#contact">Food</a>
  <a href="#contact">Location</a>
  <a href="#contact">Tech</a>
  <a href="#contact">Marketing</a>
  <a href="#contact">Sponsor</a>
  <a href="/MasterEvent/Ov">OverView</a>
</div>



<div class="rightside">



	<header>
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

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Events</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new"
					class="btn btn-success">Add Event</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Title</th>
						<th>Type</th>
						<th> description</th>
						<th>start_date</th>
						<th> end_date</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="todo" items="${listTodo}">

						<tr>
							<td><c:out value="${todo.event_title}" /></td>
							<td><c:out value="${todo.event_type}" /></td>
							<td><c:out value="${todo.description}" /></td>
							<td><c:out value="${todo.start_date}" /></td>
							<td><c:out value="${todo.end_date}" /></td>

							<td><a href="edit?id=<c:out value='${todo.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${todo.id}' />">Delete</a></td>

							<!--  <td><button (click)="updateTodo(todo.id)" class="btn btn-success">Update</button>
          							<button (click)="deleteTodo(todo.id)" class="btn btn-warning">Delete</button></td> -->
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
	
	
</div>	

</body>
</html>
