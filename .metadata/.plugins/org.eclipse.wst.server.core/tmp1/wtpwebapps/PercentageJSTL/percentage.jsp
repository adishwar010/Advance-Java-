<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Percentage calc</h1> 
<c:set var="temp" value="maths" scope="application" ></c:set>
<c:set var="math" value="${param.maths}" scope="application"></c:set>
<c:set var="phy" value="${param.physics }" scope="application"></c:set>
MAth:<c:out value="${math}"></c:out>
Physics:<c:out value="${phy}"></c:out>
<c:set var="tot" value="200" scope="application"></c:set>
<fmt:parseNumber var = "m" integerOnly="true"  value = "${math}" ></fmt:parseNumber>
<fmt:parseNumber var = "p" integerOnly="true"  value = "${phy}" ></fmt:parseNumber>
<fmt:parseNumber var="o" type="number" value="${m+p}"></fmt:parseNumber>
obtained:<c:out value="${o}"></c:out>



</body>
</html>