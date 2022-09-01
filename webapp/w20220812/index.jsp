<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.ArrayList, j20220812.BoardBean" %>
    
    
    
    
    <%

    BoardBean bean = new BoardBean();
    	
    bean.setNumber(1);
    bean.setSubject("제목");
    bean.setUserid("kim1234");
    bean.setCurrentdate("2022-08-12");
    bean.setCount(0);
    bean.setLike(0);
    
    BoardBean bean2 = new BoardBean();
    bean2.setNumber(2);
    bean2.setSubject("제목2");
    bean2.setUserid("kim12342");
    bean2.setCurrentdate("2022-08-12");
    bean2.setCount(0);
    bean2.setLike(0);
    
    
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
			<th>작성일</th>
			<th>조회</th>
			<th>좋아요</th>
		</tr>
		
<!-- number 제목 작성자	작성일	조회	좋아요 -->
		<tr>
			<td><%=bean.getNumber() %></td>
			<td><%=bean.getSubject() %></td>
			<td><%=bean.getUserid()%></td>
			<td><%=bean.getCurrentdate() %></td>
			<td><%=bean.getCount() %></td>
			<td><%=bean.getLike() %></td>
			<td></td>
		</tr>
		
		<tr>
			<td><%=bean2.getNumber() %></td>
			<td><%=bean2.getSubject() %></td>
			<td><%=bean2.getUserid()%></td>
			<td><%=bean2.getCurrentdate() %></td>
			<td><%=bean2.getCount() %></td>
			<td><%=bean2.getLike() %></td>
			<td></td>
		</tr>
	
	</table>				
	
	
	
	
	
	
	
	

</body>
</html>