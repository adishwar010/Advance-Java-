
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
<form action="calculate.jsp" method="get">
	<table>
	<tr>
		<td>
			MATHS:
		</td>
		<td>
			<input type="text" name="math">
		</td>
	</tr>
	<tr>
		<td>
			DAA:
		</td>
		<td>
			<input type="text" name="daa">
		</td>
	</tr>
	<tr>
		<td>
			English:
		</td>
		<td>
			<input type="text" name="eng">
		</td>
	</tr><tr>
		<td>
			<button type="submit">Submit</button>
		</td>
	</tr>
	
	</table>
	
	


<c:out value="${m}"></c:out>

</form>
</body>
</html>