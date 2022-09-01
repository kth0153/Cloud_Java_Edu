package j20220727;

public class Method_1 {

	// 변수로 움직일수 없다
	// 변수로 입력 출력안된다
	// 메소드로 입력 출력한다

	String name;
	int age;
	String address;

	//method(함수):접근제한자 타입 메소드명(아귀먼트(인자)..)아귀먼트가 없는경우도 있다
	//get:java get 얻는다 
	//set,put,add 설정,삽입,수정
	//this: 일반적으로는 생략가능 
	//지역변수와 전역변수가 같으면 생략 할수 없다 
	
	public String  getName() {
		return name;
		
	}
	
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		Method_1 me = new Method_1();

		/*
		 * me.name = "김현호"; me.age = 20; me.address = "서울";
		 */
		System.out.println(me.name);
		System.out.println(me.age);
		System.out.println(me.address);

		
	System.out.println(me.getName());	
		
	me.setName("아무개");
	System.out.println(me.getName());	
	
	
	
	
	
	}
}
