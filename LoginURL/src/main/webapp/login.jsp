<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String username = request.getParameter("usern");
String password = request.getParameter("userp");


if(username.equals("adishwar") && password.equals("hello")){
	
	session.setAttribute("username", username);
	session.setAttribute("userPass", password);
	
	String UpdateURl = response.encodeUrl("welcome.jsp?username="+username+"&password="+password);
	
	
	
%>
<a href="<%=UpdateURl%>">WELCOME PAGE</a>
<% 	
}else{
	response.sendRedirect("index.jsp?status=Invalid-Details");
}

%>

</body>
</html>