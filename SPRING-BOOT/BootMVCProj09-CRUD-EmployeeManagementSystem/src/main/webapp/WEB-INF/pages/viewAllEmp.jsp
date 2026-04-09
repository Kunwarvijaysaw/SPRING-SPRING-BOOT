<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>

	<h2>Employee List</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>

		<c:forEach var="emp" items="${viewall}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.department}</td>
				<td>${emp.salary}</td>
				<td>${emp.designation}</td>
			</tr>
		</c:forEach>

	</table>

	<a href="add">Add New Employee</a>

</body>
</html>