<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="common.util.CommonUtil, java.util.ArrayList" %>
    
    <%!
    
//     String guserid;
//     String gsubject;
//     String currentdate;
    
//     int number;
//     int count;
//     int like;
    
//     public void setType(Object type){
//     	String typevalue = type.getClass().getName();
//     	String str = new String();
//     	String strvalue = null;
//     	Integer intvalue =null;
    	
//     	if(str.equals("java.lang.String")){
//     		String guserid = (String)type;
    		
//     	}
    	
//     	if(str.equals("java.lang.Integer")){
//     		intvalue = (Integer)type;
    		
//     	}
    	
    	
//     }
    
    
    ArrayList list = new ArrayList();
    
    %>
    
    
    <%
    Object number = CommonUtil.IsNull(request, 2, "number");
    Object userid = CommonUtil.IsNull(request, 1, "userid");
    Object subject = CommonUtil.IsNull(request, 1, "subject");
    Object currentdate = CommonUtil.IsNull(request, 1, "currentdate");
    Object count = CommonUtil.IsNull(request, 2, "count");
    Object like = CommonUtil.IsNull(request, 2, "like");
    
    
    
    
    
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function Login() {
		
		var frm = document.gwang2frm;
		frm.action = "gwang2.jsp";
		
		
		if(frm.number.value == ""){
			alert('number 입력');
			return;
		}
		if(frm.subject.value == ""){
			alert('subject 입력');
			return;
		}
		if(frm.userid.value == ""){
			alert('userid 입력');
			return;
		}
		if(frm.currentdate.value == ""){
			alert('currentdate 입력');
			return;
		}
		if(frm.count.value == ""){
			alert('count 입력');
			return;
		}
		if(frm.like.value == ""){
			alert('like 입력');
			return;
		}
		
		frm.method="get";
		frm.submit();
		
	}

</script>

</head>
<body>
<!-- number(int) 제목 작성자 작성일 조회(int) 좋아요(int) -->

<form name="gwang2frm">
<table style="width: 100%">
	<tr>
		<th>number</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회</th>
		<th>좋아요</th>
	</tr>
	
	<tr>
		<td><input type="text" name="number" /></td>
		<td><input type="text" name="userid" /></td>
		<td><input type="text" name="subject" /></td>
		<td><input type="text" name="currentdate" /></td>
		<td><input type="text" name="count" /></td>
		<td><input type="text" name="like" /></td>
		<td><input type="button" onclick="Login()" value="login"/></td>
	</tr>
	
	
	
</table>
<br>
number:<%=number %><br>
userid:<%=userid %><br>
subject:<%=subject %><br>
currentdate:<%=currentdate %><br>
count:<%=count %><br>
like:<%=like %><br>


</form>



</body>
</html>