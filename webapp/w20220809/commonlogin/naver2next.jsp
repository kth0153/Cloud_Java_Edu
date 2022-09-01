<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
	 String id = request.getParameter("id");
 	out.println(id);
 	
	 String passwd = request.getParameter("passwd");
	 out.println(passwd);
	 
	 String passwdre = request.getParameter("passwdre");
	 out.println(passwdre);
	 
	 String name = request.getParameter("name");
	 out.println(name);
	 
	 String year = request.getParameter("year");
	 
	 String month[] = request.getParameterValues("month");
		 for(int i = 0; i<month.length;i++){
			 out.println(month[i]);
		 }
		 
	 String day = request.getParameter("day");
	 String mw[] = request.getParameterValues("mw");
		 for(int i = 0; i<mw.length;i++){
			 out.println(mw[i]);
		 }
		 
	 String emailch = request.getParameter("emailch");
	 out.println(emailch);
	 
	 String phoneselect[] = request.getParameterValues("phoneselect");
		 for(int i = 0; i<phoneselect.length;i++){
			 out.println(phoneselect[i]);
		 }
		 
	 String phone = request.getParameter("phone");
	 out.println(phone);
	 
// 	 String numsend = request.getParameter("numsend");
// 	 out.println(numsend);
	 
	 String phonech = request.getParameter("phonech");
	 out.println(phonech);
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