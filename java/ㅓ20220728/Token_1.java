package ㅓ20220728;

import java.util.StringTokenizer;

public class Token_1 {

	public static void main(String[] args) {
		
		//ctrl+shift+o:자동 import 
		//token(식별자):구분할수있는기호 
		
		String home="김현호 30 서울";
		//문자열 배열에 담고 출력
		
		
		StringTokenizer token=new StringTokenizer(home);
		
						String strvalue[]=new String[token.countTokens()];
						
						
						for(int i=0;token.hasMoreElements();i++) {
							
							strvalue[i]=token.nextToken();
							System.out.println(strvalue[i]);	
							
							
						}
		
	}

}
