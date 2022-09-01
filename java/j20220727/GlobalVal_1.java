package j20220727;

public class GlobalVal_1 {

	//전역변수,클래스 변수,필드 변수 (api)
	//접근제한자  타입 변수명 
	//접근 제한자 :public->누구나 접근할수있다 ,protected->해당하는 패키지만 ,private 현재 클래스 
	//전역변수는 변수 선언만해도 된다
	
	public String name="김현호";
	
	
	
	
	
	//main:사람의입->jvm call  
	//입->출력 할수 있다 System.out.println
	
	public static void main(String[] args) {
		
		//지역변수 :괄호가 닫히면 소멸한다 
		String name="김현호";
		System.out.println(name);
		
		//객체지향:큰데에서 작은데로간다 
		//자바에서 큰데엣서 작은데가는것은 .으로 간다 
		//대한민국.부산시.해운대구.우동.센텀타운.5.광화대교1.김현호
		//new:메모리에 올린다 GlobalVal_1
		
		
		GlobalVal_1 gl=new GlobalVal_1(); 
		System.out.println(gl.name); 

		//지역변수 출력
//		나이(int) ,주소(String ) 
		
		//전역변수 출력
//		나이(int) ,주소(String ) 
				
		
		
	}
	
	
}
