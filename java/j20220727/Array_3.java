package j20220727;

public class Array_3 {

	
	
	public static void main(String[] args) {
		
		//배열 :0 부터시작 0부터 값을 저장한다 
		
		String strarray[]= {"김현호","아무개","홍길동"};
	
			 System.out.println(strarray.length);
			 
			//홍길동
			 
			 for (int i = 0; i < strarray.length; i++) {
				
				 System.out.println( strarray[i]);
				 
				 if (strarray[i]=="홍길동") {
					
					 System.out.println(strarray[i]+" 검색되었습니다.");
					 
				}
				
				 if (strarray[i].equals("아무개")) {
					 System.out.println(strarray[i]+" 검색되었습니다.");
				
				 }
				 
			}
			 
			
		
		
	}
}
