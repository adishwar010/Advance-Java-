<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL PRACTICE</title>
</head>
<body>
<h1>JSTL DEMO</h1>

<c:set var="age" value="19" scope="application"></c:set>
<c:out value="${age}"></c:out>
<!--  -->
<h1>Age AFter remove <c:out value="${age}"></c:out></h1>
<hr>
<c:if test="${age>18}">
	<h3>You are Eligible to Vote</h3>
</c:if>
<hr>
<c:forEach  var ="i" begin="1" end="5">

<h4>VAlue of i is <c:out value="${i}"></c:out></h4>

</c:forEach>

<c:set var="num" value="0" scope="application"></c:set>

<c:choose>
	<c:when test="${num>0}">
		<c:out value="${num }"></c:out> is positive
	</c:when>
	<c:when test="${num<0}">
		<c:out value="${num }"></c:out> is negative
	</c:when>
	<c:otherwise>
	is zero
	</c:otherwise>


</c:choose>

</body>
</html>