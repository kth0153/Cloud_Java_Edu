<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
//  	한글:2바이트 영어:1바이트
// 	requset:utf-8 
 	String name = request.getParameter("userid");
 	String passwd = request.getParameter("passwd");
 	
 %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/* out:html에 출력하는 객체
	request:파라미터 이름을받는 객체
	response:요청도니것을 응답하는 객체 - redirect 페이지 들리기 */
	
	out.println(name);
	out.println(passwd);

%>

</body>
</html>