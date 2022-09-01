package ㅓ20220728;

import java.util.StringTokenizer;

public class Token_2 {

	public static void main(String[] args) {
			
		
		String searchname="무인도";
		
		
		String home="김현호/20/무인도";
		StringTokenizer token=new StringTokenizer(home, "/");
		while(token.hasMoreTokens()) {
				//System.out.println(token.nextElement());
			
//					이름 ,나이,주소 검색 
					String tokenvalue=token.nextToken();
					if(tokenvalue.equals(searchname)) {
							System.out.println(tokenvalue+" 검색되었습니다.");
					}
				
				
		}
		
		
	}
}
