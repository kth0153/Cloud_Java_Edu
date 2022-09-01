<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    
    
    <%!
    
    ArrayList list = new ArrayList();
    
    %>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
	for(int i =0;i<10;i++){
		list.add(i+1);
		
	}

	for(int i =0;i<list.size();i++){
		int intvalue = (int)list.get(i);
		out.println(intvalue);
	}



%>






</body>
</html>