<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="URL.jsp"  method:"get">
	Enter Username : <input type="text" name="username" />
	<button type="submit">Submit</button>
</form>

<%
String msg = request.getParameter("status");

if(msg==null){
	msg="";
}else{
	out.println(msg);
}
%>

</body>
</html>