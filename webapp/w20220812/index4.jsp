<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    	
    	String userid = request.getParameter("userid");
    
    	if(request.getParameter("userid") == null){
    		userid = request.getParameter("userid");
    		
    	}
    
        String passwd = request.getParameter("passwd");
        
        if(request.getParameter("passwd") == null){
        	passwd = request.getParameter("passwd");
    		
    	}
        
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index4.jsp" method="post">
<table>
	<tr>

<!-- 			   web                      java -->
<!-- 			parameter             agument -->
			
			
		<td><input type="text" name="userid" id="" /></td>
	</tr>
	<tr>
		<td><input type="text" name="passwd" id="" /></td>
	</tr>
	<tr>
		<td><input type="submit" /></td>
	</tr>
</table>
<br>

	userid:<%=userid %>
    passwd:<%=passwd %>


</form>
</body>
</html>