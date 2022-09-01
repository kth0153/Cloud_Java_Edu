package common.util;

import javax.servlet.http.HttpServletRequest;

public class CommonUtil {

	
	
	// Null 체크(null 이있을 경우 오류 발생)
	// HttpServletRequest request - hidden._jspService(HttpServletRequest, HttpServletResponse)
	// 
	
	public static Object IsNull(HttpServletRequest request, int inputchoice, String inputname	){
		Object inputvalue = null;
		
		switch(inputchoice) {
		case 1:
			if(request.getParameter(inputname) != null){
				inputvalue = request.getParameter(inputname);
			
		}break;
		
		case 2:
			if(request.getParameter(inputname) != null){
				inputvalue = Integer.parseInt(request.getParameter(inputname));

		}break;
		
	}
	return inputvalue;
}
	

}
