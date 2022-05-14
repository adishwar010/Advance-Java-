<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="m" value="${param.math}" scope="application"></c:set>
<c:set var="d" value="${param.daa}" scope="application"></c:set>
<c:set var="e" value="${param.eng}" scope="application"></c:set>
<c:out value="${(((m+d+e)/300)*100)}"></c:out>
</body>
</html>