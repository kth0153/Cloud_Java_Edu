<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
   
 <%
 	String array[] = request.getParameterValues("rcommon"); // 배열형으로 값받아오는 것.
 	for(int i = 0; i<array.length;i++){
 		out.println(array[i]);
 	}
 	
 	out.println("<hr>");
 	
 	String array2[] = request.getParameterValues("ccommon"); // 배열형으로 값받아오는 것.
 	for(int i = 0; i<array2.length;i++){
 		out.println(array2[i]);
 	}
 	
 	
 
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