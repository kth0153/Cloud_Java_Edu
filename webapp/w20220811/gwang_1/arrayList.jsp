<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.ArrayList" %>
    
    
   <%
//  	_jspservice 안에 있는것
 
 	String userid= null; // null 에러 방지
 	
 	if(request.getParameter("userid") != null){
 		userid = request.getParameter("userid");
 	}
 
 	String passwd = null;
 	
 	if(request.getParameter("passwd") !=null){
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
	<form name="gwangfrm">
	<table border="1" width="500" height="500">
		<tr>
			<td>userid</td>
			<td><input type="text" name="userid"  id=""> </td>
			
		</tr>
	
		<tr>
			<td>passwd</td>
			<td><input type="text" name="passwd" id=""> </td>
			
		</tr>
		
		<tr>
			<td colspan="2"><input type="button" value="로그인"  onclick="Login()"> </td>
			
		</tr>
	
	</table>				
	<br>
<%-- 	<%=userid %> : out.println(userid) --%>
		userid:<%=userid %><br>
		passwd:<%=passwd %>
					
	</form>
	

</body>
</html>