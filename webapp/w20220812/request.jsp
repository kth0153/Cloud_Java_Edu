<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String name="고태훈";
	int age = 10;
	String address = "부산";
	
// 	출력 방법 1
	out.println(name);
	out.println(age);
	out.println(address);
	
	%>
	
<!-- 	web에서 name:parametername -->
<!-- 	           value:parametervalue -
				   request:

->
	           
<!-- 	 form 안에서 동작 -->

<form name = "requestfrm" action="request_next.jsp" method="post">

<h1>userid</h1>
<input type="text" name="userid"/><br>
<h1>email</h1>
<input type="text" name="email"/><br>
<h1>passwd</h1>
<input type="text" name="passwd"/>
<input type="submit"/>


</form>





</body>
</html>