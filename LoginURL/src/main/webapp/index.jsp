<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="login.jsp">
Enter username: <input type="text" name="usern" />
Enter password: <input type="password" name="userp" />
<button type="submit">Login</button>
</form>

<%

String msg= request.getParameter("status");

if(msg==null){
	msg="";
}else{
	out.println("<h1>Invalid Details</h1>");
}


%>

</body>
</html>