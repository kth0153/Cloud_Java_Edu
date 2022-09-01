<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 이름 나이 주소 전역변수 만들어서 출력(브라우저) -->
<!-- 이름 나이 주소에 전역변수 지역변수 값을 바꾸어서 출력(브라우저) -->
	<%!
		String name = "고태훈";
		int age = 20;
		String address = "부산광역시";
	%>
	
	<%
		out.println("전역변수 출력<br>");
		out.println("이름 : "  + name);
		out.println("나이: " + age);
		out.println("주소" +address);
		
		out.println("<br>전역변수 지역 변수 값 변경 출력<br>");
		String name2 = "고태훈2";
		int age = 30;
		String address2 = "서울특별시";
	
		out.write(name=name2);
		out.write(age);
		out.write(address=address2);
		
		
	%>

</body>
</html>