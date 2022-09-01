<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.ArrayList, question.TaehunBean" %>
 
 <%
//  	값을 받아올 bean.java 메소드 호출
// 		첫 번째 값을 저장할 bean 생성
 	TaehunBean bean = new TaehunBean();
 	bean.setNumber(1);
 	bean.setSubject("제목1");
 	bean.setUserid("아이디1");
 	bean.setEmail("이메일1");
 	bean.setDate("2022-08-12");
 	bean.setCount(0);
 	bean.setLike(0);
 
//		두 번째 값을 저장할 bean 생성
 	TaehunBean bean2 = new TaehunBean();
 	bean2.setNumber(2);
 	bean2.setSubject("제목2");
 	bean2.setUserid("아이디2");
 	bean2.setEmail("이메일2");
 	bean2.setDate("2022-08-12");
 	bean2.setCount(1);
 	bean2.setLike(1);
 	
//	세 번째 값을 저장할 bean 생성
 	TaehunBean bean3 = new TaehunBean();
 	bean3.setNumber(1);
 	bean3.setSubject("제목3");
 	bean3.setUserid("아이디3");
 	bean3.setEmail("이메일3");
 	bean3.setDate("2022-08-12");
 	bean3.setCount(3);
 	bean3.setLike(3);

 
 %>
 
 
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="width:100% ">
		<tr>
			<th>number</th>
			<th>제목</th>
			<th>작성자</th>
			<th>이메일</th>
			<th>작성일</th>
			<th>조회</th>
			<th>좋아요</th>
		</tr>
		
<!-- number 제목 작성자	이메일 작성일	조회	좋아요 -->
		<tr>
			<td><%=bean.getNumber() %></td>
			<td><%=bean.getSubject()%></td>
			<td><%=bean.getUserid()%></td>
			<td><%=bean.getEmail() %></td>
			<td><%=bean.getDate() %></td>
			<td><%=bean.getCount() %></td>
			<td><%=bean.getLike() %></td>
		</tr>
		
		<tr>
			<td><%=bean2.getNumber() %></td>
			<td><%=bean2.getSubject()%></td>
			<td><%=bean2.getUserid()%></td>
			<td><%=bean2.getEmail() %></td>
			<td><%=bean2.getDate() %></td>
			<td><%=bean2.getCount() %></td>
			<td><%=bean2.getLike() %></td>
		</tr>
		
			<tr>
			<td><%=bean3.getNumber() %></td>
			<td><%=bean3.getSubject()%></td>
			<td><%=bean3.getUserid()%></td>
			<td><%=bean3.getEmail() %></td>
			<td><%=bean3.getDate() %></td>
			<td><%=bean3.getCount() %></td>
			<td><%=bean3.getLike() %></td>
		</tr>
	
	</table>				





</body>
</html>