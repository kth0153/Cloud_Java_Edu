package ㅓ20220728;



//Object:모든 클래스는 반드시 상속받는다
//클래스는 하나만 받을수 있다 
//Object는 생략이 가능하다 
//java는 Object 상속받지않으면 native 

public class Object_2 extends Object {

	public static void main(String[] args) {
			
		
		String name="김현호";
		
		System.out.println(name);
		
		Object name2="아무개";
		
		
		System.out.println(name2.getClass().getName());
		
		//wrapper class
		//반드시 객체나 static 을통해서만 변수가 메소드 호출이 가능하다 
		
		//static:클래스명.변수 클래스명.메소드명
		
		//String ->int 
		//강제casting
		
		
		int age=20;
		
		Integer age2=30;
		//number 
		Integer age3=age2.parseInt("30");
		
		System.out.println(age3.getClass().getName());
		
		
		age3 =age3+10;
		
		
		System.out.println(age3);
		
		//int ->String 
		
		String intvalue=String.valueOf(30);
		
		System.out.println(intvalue.getClass().getName());
		
		
	}
}
