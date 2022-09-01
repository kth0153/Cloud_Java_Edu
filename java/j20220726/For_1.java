package j20220726;

public class For_1 {
	
	public static void main(String[] args) {
		
		      //초기식;조건식;증감식 
		//조건식이 맞으면 괄호실행
		
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
		//2 ~ 11합을구하시오 
		sum=0;
		for (int i = 2; i <=11; i++) {
			sum=sum+i;
		}
		System.out.println("===");
		System.out.println("합은:"+sum);
		
	}
	

	
	
	
}
