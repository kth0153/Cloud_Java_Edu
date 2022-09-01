<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.util.ArrayList,j20220812.NewsBean" %>
 	
 	
 	<%
 		NewsBean news = new NewsBean(1,"홈1데이타","사회1","정치","경제1","국제1","문화1","it1","연재1","포토1","팩트체크");
 		
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- number 홈 사회 정치 경제 국제 문화 IT 연재 포토 팩트체크 -->

<table style="width: 100%">
	<tr>
		<td>number</td>
		<td>홈</td>
		<td>사회</td>
		<td>정치</td>
		<td>경제</td>
		<td>국제</td>
		<td>문화</td>
		<td>it</td>
		<td>연재</td>
		<td>포토</td>
		<td>팩트체크</td>
	</tr>
	
	<tr>
		<td><%= news.getNewnumber() %></td>
		<td><%= news.getNewhome() %></td>
		<td><%=news.getNewsociety() %></td>
		<td><%=news.getNewpolitics() %></td>
		<td><%=news.getNeweconomy() %></td>
		<td><%=news.getNewinternational() %></td>
		<td><%=news.getNewculture() %></td>
		<td><%=news.getNewit() %></td>
		<td><%=news.getNewpublish() %></td>
		<td><%=news.getNewphoto()%></td>
		<td><%=news.getNewfactcheck() %></td>
		
	</tr>




</table>






</body>
</html>