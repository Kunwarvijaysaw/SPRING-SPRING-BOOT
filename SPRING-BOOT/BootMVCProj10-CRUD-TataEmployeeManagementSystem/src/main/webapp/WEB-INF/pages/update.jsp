<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>

<h2>Edit Employee</h2>

<form action="update" method="post">

    <table>
    
        <!-- ID (readonly) -->
        <tr>
            <td>ID:</td>
            <td>
                <input type="number" name="id" value="${emp.id}" readonly />
            </td>
        </tr>

        <tr>
            <td>Name:</td>
            <td>
                <input type="text" name="name" value="${emp.name}" required />
            </td>
        </tr>

        <tr>
            <td>Department:</td>
            <td>
                <input type="text" name="department" value="${emp.department}" required />
            </td>
        </tr>

        <tr>
            <td>Salary:</td>
            <td>
                <input type="number" step="0.01" name="salary" value="${emp.salary}" required />
            </td>
        </tr>

        <tr>
            <td>Designation:</td>
            <td>
                <input type="text" name="designation" value="${emp.designation}" required />
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Update Employee"/>
            </td>
        </tr>

    </table>

</form>

</body>
</html>