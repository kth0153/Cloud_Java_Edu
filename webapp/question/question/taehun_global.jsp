<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    
    <%!
    ArrayList list = new ArrayList();
    int sum = 0;
    
    %>
    
    <%
    for(int i = 1; i<11;i++){
    	list.add(i);
    }
    
    for(int i = 1; i<list.size();i++){
    	int intvalue = (int)list.get(i);
    	sum += intvalue;
    }
    out.println("전역변수 arraylist : " + sum);
    
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