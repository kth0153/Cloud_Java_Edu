<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.ArrayList" %>
 
 <%!
 	ArrayList array = new ArrayList();
 %>
 
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
 	
 	if((userid !=null) && (passwd != null)){
 		ArrayList list = new ArrayList();
 		list.add(userid);
 		list.add(passwd);
 		array.add(list);
 	}
 
 
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function Login() {
		var frm = document.gwangfrm;
		if(frm.userid.value ==""){
			alert("id 입력");
			return;
		}
		
		if(frm.passwd.value==""){
			alert("passwd 입력");
			return;
		}
		frm.action = "gwang_1.jsp";
		frm.method = "post";
		frm.submit();
		
		
	}

</script>

</head>
<body>

<!-- 	table[border = 1 width=500 height=500]>tr*3>td2>input:t(t) -->
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
		<hr/>
		userid:<%=userid %><br>
		passwd:<%=passwd %>
		<hr/>			
		<br/>
		
	</form>
		<%
			for(int i =0; i < array.size(); i++){
				ArrayList array1 = (ArrayList) array.get(i);
				
				String id = (String) array1.get(0);
				String pass = (String) array1.get(1);
				
				out.println("userid" + id +"<br>");
				out.println("passwd" + pass);
				
			}
		%>
	
		



</body>
</html>