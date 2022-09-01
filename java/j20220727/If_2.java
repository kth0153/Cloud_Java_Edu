package j20220727;

public class If_2 {

	public static void main(String[] args) {
		
		int  one=60; int two=20;
		
		//변수  선언 
//	트랜잭션: if 중에 하나라도 true 해당하는 트랜잭션은 종료 
		
		if (one<=20) {
			System.out.println("50보다 작다 ");
		}else if (one<=30) {
			System.out.println("30보다 작다");
		}else if (one<=40) {
			System.out.println("40보다 작다 ");
		}else {
			System.out.println("그밖의 값");
		}
	
	}
}
