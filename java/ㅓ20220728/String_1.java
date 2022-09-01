package ㅓ20220728;

public class String_1 {

	public static void main(String[] args) {
		
				//문자열 -> 문자 + 문자 ->문자열 
			//문자 ->char
		
		Character charvalue='김';
		
				if(charvalue.equals('김')){
					System.out.println(charvalue+ " 맞습니다");
					
				}
		
		
		
		//이름 가운데 검색 
				
		String str=new String("김현호");
			System.out.println(str);
			System.out.println(str.charAt(0)); 
			System.out.println(str.charAt(1)); 
			System.out.println(str.charAt(2)); 
			
			System.out.println("==============");
			for (int i = 0; i < str.length(); i++) {
				
					System.out.println(str.charAt(i));
					
			}
			
			
		
	}
}
