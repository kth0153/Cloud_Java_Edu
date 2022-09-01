<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@page import="java.util.*" %>
     
     <%!
     
     Hashtable hash = new Hashtable();
     
    
     %>
     
     <%
     for(int i =1 ; i<11;i++){
    	 hash.put(i, i);
     }
     int sum = 0;
     for(int i =1; i<11; i++){
     	int intvalue = (int)hash.get(i);
     	sum += intvalue;
     }
     out.println("hashlist의 합" + sum);

    
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