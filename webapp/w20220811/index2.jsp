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
		String address = "부산광역시";
		
	%>
    
    
    
<!--     스크립틀릿 -->
    <%
    	out.println("전역변수 이름 : " + name);
   		out.println("전역변수 나이 : " + age);
   		out.println("전역변수 주소 : " + address);
   		out.println("<br>");
   		
   		String name2 = "고태훈2";
   		int age2 = 22;
   		String address2 = "서울특별시";
   		
   		out.println("지역변수 이름 : " + name2);
   		out.println("지역변수 나이 : " + age2);
   		out.println("지역변수 주소 : " + address2);
   		out.println("<br>");

		String local_tem = name2;
		String name = local_tem;
		
		int local_age = age2;
		int age = local_age;
		
		String address_tem = address2;
		String address = address2;
   		
		out.println("전역변수 값 지역변수로 변경 " + "이름: " + name + "나이" + age + "주소" + address+"<br>");
		

		name2 = "고태훈";
		age2 = 20;
		address2 = "부산광역시";
			
		out.println("지역변수 값 전역변수로 변경 " + "이름: " + name2 + "나이" + age2 + "주소" + address2+"<br>");
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
    %>

</body>
</html>