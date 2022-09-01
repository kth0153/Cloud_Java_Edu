
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("userid");
    	out.println(id);
    	String passwd = request.getParameter("passwd"	);
    	out.println(passwd);
    	
    	String ckid = "kim1234";
    	String chpasswd = "1234";
    	
    	  if (id.equals(ckid) && passwd.equals(chpasswd)){
//     		out.println("로그인 완료");
    		response.sendRedirect("testmain.html");
    	} else{
//     		out.println("로그인 실패");
     		response.sendRedirect("testlogin.html");
    		
    	}
    
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>


</body>
</html>