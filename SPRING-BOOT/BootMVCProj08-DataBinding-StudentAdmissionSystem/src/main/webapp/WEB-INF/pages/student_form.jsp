<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>

<h2 align="center">Student Registration Form</h2>

<form action="student_formdata" method="post">

<table border="1" bgcolor="cyan" align="center" cellpadding="10">

<tr>
<td>Student Name:</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Student Roll No:</td>
<td><input type="number" name="rollNo"></td>
</tr>

<tr>
<td>Marks 1:</td>
<td><input type="number" name="marks1"></td>
</tr>

<tr>
<td>Marks 2:</td>
<td><input type="number" name="marks2"></td>
</tr>

<tr>
<td>Marks 3:</td>
<td><input type="number" name="marks3"></td>
</tr>

<tr>
<td><input type="submit" value="Register"/></td>
<td><input type="reset" value="Cancel"/></td>
</tr>

</table>

</form>

</body>
</html>