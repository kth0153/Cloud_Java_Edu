<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
    
    <%
    	ArrayList list = new ArrayList();
    	
    	for(int i = 1 ; i < 11; i++){
    		list.add(i);
    	}
    	int sum = 0;
    	for(int i = 0;i<list.size();i++){
    		int intvalue =(int)list.get(i);
    		sum += intvalue;
    	}
    	out.println("지역변수 arraylist : " + sum);
    
    
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