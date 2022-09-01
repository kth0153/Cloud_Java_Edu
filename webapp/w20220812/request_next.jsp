<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String userid = request.getParameter("userid");
   	 	String email = request.getParameter("email");
    	String passwd = request.getParameter("passwd");
    %>
    
    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
다음페이지
userid : <%= userid %>
email : <%= email %>
passwd : <%= passwd %>

</body>
</html>