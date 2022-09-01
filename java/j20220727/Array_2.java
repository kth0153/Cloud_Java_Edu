package j20220727;

public class Array_2 {

	public static void main(String[] args) {
		
		//java 반드시 초기방을 만들어주어야한다 
		int array[]=new int[10];
		
		int i=0;
		int sum=0;
		do {
		array[i]=i+1;
		sum=sum+array[i];
		
		} while (++i<array.length);
			System.out.println(sum);
		
	}
	
	
}
