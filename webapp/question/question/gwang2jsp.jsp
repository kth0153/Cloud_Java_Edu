
<%@page import="java.util.ArrayList, j20220811.Gwang2JspBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%! 
// 	전역 선언
// 	ArrayList array = new ArrayList();
	ArrayList array = null;
	
	public ArrayList getArrayList(){
		if(array == null){
			array = new ArrayList();
		}
		return array;
	}

%>


<%
// 지역 선언
	request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지
	String userid = null;
	String subject = null;
	String date = null;
	Integer like = null;
	Integer count = null;
	
	if(request.getParameter("userid") != null){
		userid = request.getParameter("userid");
	}
	
	if(request.getParameter("subject") != null){
		subject = request.getParameter("subject");
	}
	
	if(request.getParameter("date") != null){
		date = request.getParameter("date");
	}
	
	if(request.getParameter("like") != null){
		like = Integer.parseInt(request.getParameter("like")) ;
	}
	
	if(request.getParameter("count") != null){
		count = Integer.parseInt(request.getParameter("count")) ;
	}
	
	if((userid != null) && (subject != null)&& (subject != null)&& (subject != null)&& (subject != null)){
		
// 		ArrayList list = new ArrayList();
// 		list.add(userid);
// 		list.add(subject);
// 		list.add(date);
// 		list.add(like);
// 		list.add(count);

		Gwang2JspBean gwang = new Gwang2JspBean(userid,subject,date,like,count);
		getArrayList().add(gwang);
		
		 for(int i = 0; i<getArrayList().size();i++){
				Gwang2JspBean outputResult = (Gwang2JspBean)getArrayList().get(i);
				out.println("id : " + outputResult.getUserid());
				out.println("subject : " + outputResult.getSubject());
				out.println("date : " + outputResult.getDate());
				out.println("like : " + outputResult.getLike());
				out.println("count : " + outputResult.getCount());

			}
		
	}

%>


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
		frm.action = "gwang2jsp.jsp";
		frm.method = "post";
		frm.submit();
		
		
	}

</script>

</head>
<body>

string userid, String subject,date, int like,count ArrayList 출력

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
			<td>subject</td>
			<td><input type="text" name="subject" id=""> </td>
			
		</tr>
		
		<tr>
			<td>date</td>
			<td><input type="text" name="date" id=""> </td>
			
		</tr>
		
		<tr>
			<td>like</td>
			<td><input type="text" name="like" id=""> </td>
			
		</tr>
		
		<tr>
			<td>count</td>
			<td><input type="text" name="count" id=""> </td>
			
		</tr>
		
		<tr>
			<td colspan="2"><input type="button" value="로그인"  onclick="Login()"> </td>
			
		</tr>
	
	</table>				
	<br>
<%-- 	<%=userid %> : out.println(userid) --%>
		<hr/>
		userid :<%=userid %><br>
		subject :<%=subject %><br>
		date :<%=date %><br>
		like :<%=like %><br>
		count :<%=count %>
		<hr/>			
		<br/>
		
	</form>
<%-- 	<% --%>
		<!--
		 for(int i = 0; i<array.size();i++){
			ArrayList outputResult = (ArrayList)array.get(i);
			String useridResult = (String)outputResult.get(0);
			String subjectResult = (String)outputResult.get(1);
			String dateResult = (String)outputResult.get(2);
			int likeResult = (int)outputResult.get(3);
			int countResult = (int)outputResult.get(4);
					
		} java 연결 없이 출력
		-->
	
<!-- 	%> -->

</body>
</html>