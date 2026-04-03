<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Feedback Form</h1>

<c:if test="${object != null}">
    <p>Name: ${object.name}</p>
    <p>Email id: ${object.email}</p>
    <p>Rating: ${object.rating}</p>
    <p>Comments: ${object.comments}</p>

    <!-- JSTL Condition -->
    <%-- <c:choose>

    <c:when test="${object.rating >= 4}">
        <h3 style="color: green;">Thank you for great feedback!</h3>
    </c:when>

    <c:otherwise>
        <h3 style="color: red;">We will improve!</h3>
    </c:otherwise>

</c:choose> --%>
 <!-- JSTL Condition -->
    <c:if test="${object.rating >= 4}">
        <h3 style="color: green;">Thank you for great feedback!</h3>
    </c:if>

    <c:if test="${object.rating < 4}">
        <h3 style="color: red;">We will improve!</h3>
    </c:if>



</c:if>
	
	
</body>
</html>