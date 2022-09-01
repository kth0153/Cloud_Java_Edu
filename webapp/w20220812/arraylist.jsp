<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	ArrayList array = new ArrayList();

	for(int i=0;i<10;i++){
		array.add(i+1);
	
	}
	
	for(int i=0;i<array.size();i++){
		
		int intvalue = (int)array.get(i);
	
		out.println(intvalue);
	}
	


%>








</body>
</html>