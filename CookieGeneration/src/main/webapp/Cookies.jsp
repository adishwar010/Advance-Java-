<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%    
Cookie userName = new Cookie("UserName",request.getParameter("username"));

Cookie password = new Cookie("Password",request.getParameter("password"));

userName.setMaxAge(60*60*24);
password.setMaxAge(60*60*24);


response.addCookie(userName);
response.addCookie(password);


%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:Red">Cookies Added Successfullly</h1>
<form action="ReadCookie.jsp" method="get">
	<button type="submit">Read Cookies</button>
</form>

</body>
</html>