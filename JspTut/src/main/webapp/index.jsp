<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  
 <%@ page errorPage="error.jsp"  isErrorPage="false"%>
 

<%@ include file="Header.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>JSP TUTORIAL</h1>
<%!
	int a = 10;
	int b=0;
	
	public int dosum(){
		return a+b;
	}
	public int Divide(){
		return a/b;
	}
%>
<h1 style="color : Red">
<%
	int c = dosum();
	String s = "Division 0f "+a+" & "+b+" = "+c;
	out.println(s);
	
	
%>
</h1>


</body>
</html>
<%@ include file="Footer.jsp"    %>