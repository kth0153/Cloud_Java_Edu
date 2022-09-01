package j20220727;

public class Array_1 {
	
	
	
	

	public static void main(String[] args) {
		
		
		//java 에서의 배열:index 0부터 시작 
		//                  //0,1,2,3,4
		//[] 1차원배열 정수형 
		int array[]= {1,2,3,4,5};
		
		for(int i=0;i<5;i++) {
				System.out.println(array[i]);
			
		}
		
		System.out.println("=========================");
		//1 ~ 10 합을 구하시오 
		//40분까지 
		//element:요소 ->element
		int array2[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(array2.length);
		
		int sum=0;
		
		for (int i = 0; i < array2.length; i++) {
			
				
//			System.out.println(array2[i]);
				sum=sum+array2[i];
		
		
		}	
		
		
			System.out.println();
		
		
	}
}
