<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import=" common.util.CommonUtil"%>
    
    
    
    <%
//     	_jspService() 안에 포함
    	
		// request : name, session, cookie; 전부 가짐
    	String userid = CommonUtil.IsNull(request, "userid");
	    String passwd =CommonUtil.IsNull(request,"passwd");
	    String hidden = CommonUtil.IsNull(request,"hidden");
	    
	    
    
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function Login() {
		var frm = document.gwang1frm;
		frm.action = "hidden.jsp";
		frm.submit();
	}



</script>




</head>
<body>
<form name="gwang1frm">
<table>
	<tr>
		<td>userid</td>
		<td><input type="text" name="userid" id =""></td>
	</tr>
	<tr>
		<td>passwd</td>
		<td><input type="text" name="passwd" id =""></td>
	</tr>
	<tr>
		<td>hidden</td>
		<td><input type="hidden" name="hidden" value ="gwang1"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="button" value="로그인" onclick="Login()"></td>
	</tr>
</table>
<br>
<table>
	<tr>
		<td>userid</td>
		<td><%=userid %></td>
	</tr>
	<tr>
		<td>passwd</td>
		<td><%=passwd %></td>
	</tr>
	<tr>
		<td>hidden</td>
		<td><%=hidden %></td>
	</tr>
</table>	



</form>


</body>
</html>