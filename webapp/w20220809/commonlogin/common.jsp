<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
    String r1 = request.getParameter("r1");
 	String r2 =request.getParameter("r2");
 	String r3 =request.getParameter("r3");
 	String r4 =request.getParameter("r4");
	

	String c1 = request.getParameter("c1");
  	String c2 =request.getParameter("c2");
  	String c3 =request.getParameter("c3");
  	String c4 =request.getParameter("c4");
  	
 	out.println(r1);
 	out.println(r2);
 	out.println(r3);
 	out.println(r4);
 	
 	out.println("<hr>"); // 평행선 출력
  	out.println(c1);
  	out.println(c2);
  	out.println(c3);
  	out.println(c4);
 	
    String selectname = request.getParameter("selectname");
  	
 	out.println(selectname);
 	
 %>
    
    
    
    
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	

</body>
</html>