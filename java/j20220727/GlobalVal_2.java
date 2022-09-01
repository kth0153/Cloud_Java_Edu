package j20220727;

public class GlobalVal_2 {

	// 변수 선언
	String name;
	int age;
	String address;
	
	
	

	public static void main(String[] args) {
		// null:값인데 아무것도 없다 라고할땐 null
		String name = null;
		int age = 0; // 초기값:0
		String address = null;
		// System.out.println(name);

		System.out.println(name);
		System.out.println(age);
		System.out.println(address);

		System.out.println("==========");

		GlobalVal_2 gl = new GlobalVal_2();
		System.out.println(gl.name);
		System.out.println(gl.age);
		System.out.println(gl.address);

		// gwang1
		// ctrl+shift+f 자동정렬
		Gwang_1 gw = new Gwang_1();
		System.out.println(gw.name);
		System.out.println(gw.age);
		System.out.println(gw.address);

		
		//package:questionpool
		//class :Gwang_2 
		//이름,나이,주소 입력하고 출력하시오 
		//3:50
		//쉬는시간 지나고 풀이 
		
		
		
		
		
	}
}
