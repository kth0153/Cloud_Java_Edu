<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("utf-8");
    String userid =request.getParameter("userid");
    String email =request.getParameter("email");
    String passwd =request.getParameter("passwd");
    
    if(request.getParameter("userid")!=null && request.getParameter("email")!=null &&request.getParameter("passwd")!=null){
    	 userid =request.getParameter("userid");
    	 email =request.getParameter("email");
    	 passwd =request.getParameter("passwd");
    }
    
   
    
    %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="request2" method="post" action="request2.jsp">

<input type="text" name="userid" id="" />
<input type="text" name="email" id="" />
<input type="text" name="passwd" id="" />

<input type="submit" />

<br>

<%=userid %>
<%=email %>
<%=passwd %>
</form>



</body>
</html>