<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="j20220811.HomeBean, java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- //mvc1 : jsp(view) -> bean(home:userid.age.address.email) -->
	<%!
	ArrayList list;
		
	public ArrayList getNew(){
		if(list==null){
			list = new ArrayList();
		}
		return list;
	}
		
	
	
	%>

	<%
		
		
		HomeBean home = new HomeBean("고태훈",20,"부산","email");
		
// 		out.println(home.getName());
// 		out.println(home.getAge());
// 		out.println(home.getAddress());
// 		out.println(home.getEmail());
	
		getNew().add(home.getName());
		getNew().add(home.getAge());
		getNew().add(home.getAddress());
		getNew().add(home.getEmail());
		
	%>
	
	<form action="" name="gwang1frm">
	<table border="1" width="500" height="500">
		<tr>
			<td>userid</td>
			<td><input type="text" name="userid" id=""> </td>
			
		</tr>
	
		<tr>
			<td>passwd</td>
			<td><input type="password" name="passwd" id=""> </td>
			
		</tr>
		
		<tr>
			<td colspan="2"><input type="button" value="로그인"  onclick="Login()"> </td>
		</tr>
	
	</table>								
</form>
	
</body>
</html>