<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String userid = request.getParameter("userid");
	    String age = request.getParameter("age");
	    String address = request.getParameter("address");
	    String email = request.getParameter("email");
	    
	    // 입력된 값이 null 인지 체크
	    if(request.getParameter("userid") !=null && request.getParameter("age") !=null 
	    	&& request.getParameter("address") != null && request.getParameter("email") !=null ){
	    	userid = request.getParameter("userid");
	    	age = request.getParameter("age");
	    	address = request.getParameter("address");
	    	email = request.getParameter("email");

	    }
    
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index5.jsp" method="post">
<table>
	<tr>
		<td>userid</td>
		<td><input type="text" name="userid" id="" /></td>
	</tr>
	<tr>
		<td>age</td>
		<td><input type="text" name="age" id="" /></td>
	</tr>
	<tr>
		<td>address</td>
		<td><input type="text" name="address" id="" /></td>
	</tr>
	<tr>
		<td>email</td>
		<td><input type="text" name="email" id="" /></td>
	</tr>
	<tr>
		<td>login</td>
		<td><input type="submit" /></td>
	</tr>
</table>
<br>
<!-- request 된 parameter 값을 출력하는 부분 -->
userid : <%=userid %><br>
age : <%=age %><br>
address : <%=address %><br>
email : <%=email %>


</form>

</body>
</html>