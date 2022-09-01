<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String userid = "";
    	String passwd = "";
    	
    	String currentuserid = "kim1234";
    	String currentpasswd = "1234";
    	String printout = "";
    	
    	if(request.getParameter("userid") != null && request.getParameter("passwd") !=null ){
    		userid=request.getParameter("userid");
    		passwd=request.getParameter("passwd");
    		
    		if(userid.equals(currentuserid) && passwd.equals(currentpasswd)){
    			printout = userid + "로그인 되었습니다.";

    		}else{
    			printout = userid + "아이디나 패스워드가 틀렸습니다.";
    		}
    		
    	}
    
    
    %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=printout %>

</body>
</html>