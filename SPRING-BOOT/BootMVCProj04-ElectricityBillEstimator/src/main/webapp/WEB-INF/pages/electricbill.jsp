<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Electricity Bill</h1>

<c:if test="${bill != null}">
    <p>Customer Name: ${bill.customerName}</p>
    <p>Units Consumed: ${bill.unitsConsumed}</p>
    <p>Total Bill: ₹${bill.totalBill}</p>

    <!-- Slab Display -->
    <c:choose>

        <c:when test="${bill.unitsConsumed < 100}">
            <h3 style="color: green;">Rate Applied: ₹5 per unit</h3>
        </c:when>

        <c:otherwise>
            <h3 style="color: blue;">Rate Applied: ₹8 per unit</h3>
        </c:otherwise>

    </c:choose>

</c:if>


</body>
</html>