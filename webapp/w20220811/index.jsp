<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.Hashtable, java.util.ArrayList" %>
  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	html : 문서이다.  -->
<!--     jsp:servlet로 구성된 자바이다 -->
<!--     application:java -->
<!--     web:servlet.jsp -->
<!--     java(servlet) server page -->
    
<!--     jsp -> servlet HttpJspBase -> jsp -->
    
<!--     servlet : life cycle:servlet life cycle:init(한번만 실행:설정) -> doservice(생략가능 get,post) ->dopost(post),doget(get),dodestory(was kill) -->
    
<!--     request : 요청받는것 response : 응답한다. -->
<!--     html : 파라미터 값을 받을 수 없다. -->
<!--     html은 f5 누르면 새로고침이 안된다(컴파일x) -->
<!--     jsp는 f5 컴파일 된다. -->


<!-- 	main 페이지 입니다.() 전역변수 -->
	<%! 
		String name = "고태훈";
		int age = 20;
		String address = "부산 우동";
		
		
		
	%>
    
    
    
<!--     스크립틀릿 -->
    <%
    	out.println("출력입니다.");
    
    %>
    
    
    

	안녕하세요 jsp 입니다.
</body>
</html>