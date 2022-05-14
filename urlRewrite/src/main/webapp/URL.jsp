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

String name = request.getParameter("username");



if(name.equals("adishwar")){
	session.setAttribute("name", name);
	String UpdatedURL = response.encodeUrl("page2.jsp?username="+name);
	
%>

<a href='<%=UpdatedURL%>'>click </a>
<%
}
else{
	response.sendRedirect("index.jsp?status=usernamenotvalid");
}
%>

</body>
</html>