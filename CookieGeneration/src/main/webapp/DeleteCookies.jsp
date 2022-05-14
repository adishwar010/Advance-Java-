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
Cookie ck =null;
Cookie [] cookie =null;

cookie = request.getCookies();

if(cookie!=null){
	for(int i=0;i<cookie.length;i++){
		ck = cookie[i];
		if(ck.getName().compareTo("UserName")==0){
			ck.setMaxAge(0);
			response.addCookie(ck);
		}
		if(ck.getName().compareTo("Password")==0){
			ck.setMaxAge(0);
			response.addCookie(ck);
		}
	}
	
}else{
	out.println("Cookies Not Found");
}





%>
<h1 style="color:Red">Cookies Deleted Successfullly</h1>
<form action="ReadCookie.jsp" method="get">
	<button type="submit">Read Cookies</button>
</form>
</body>
</html>