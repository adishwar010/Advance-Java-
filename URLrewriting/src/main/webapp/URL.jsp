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
	session.setAttribute("username", name);
	String UpdatedURL = response.encodeUrl("page2.jsp?username="+name);
	
	out.println(UpdatedURL);
	
	%>

<a href="<%=UpdatedURL%>">Click to open</a>
<% 
}
%>
</body>
</html>