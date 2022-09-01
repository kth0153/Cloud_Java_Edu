package j20220727;


/*
 * 	작성자:김현호
 * 작성일:2022-0727
 * 기능:For 예시 1
 */
public class For_1 {

	public static void main(String[] args) {
		
		//초기식;조건식;증감식 
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	
		//무한루프 
//		for(;;) {
//			System.out.println("무한루프");
//		}
		
	
		int i = 1;
		int sum=0;
		for (; i <=10; i++) {
			sum=sum+i;
			
		}
		
		
		System.out.println(sum);
		
		
		
		
		
		
	}
}
