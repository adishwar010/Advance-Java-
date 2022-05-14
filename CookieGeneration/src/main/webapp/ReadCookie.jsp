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

Cookie ck =null;//object of coolie
Cookie [] cookie=null;//array to store cookie

cookie=request.getCookies();

if(cookie!=null){
	for(int i=0;i<cookie.length;i++){
		ck = cookie[i];
		out.println("<h3>Key is "+ck.getName());
		out.println("Value is "+ck.getValue());
		out.println("<br>");
	}
	
}else{
	out.println("Cookies Not Found");
}




%>

<form action="DeleteCookies.jsp" method="get">
	<button type="submit">Delete Cookies</button>
</form>

</body>
</html>