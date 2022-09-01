package common;

public class Method_1 {

	// 클래스변수,멤버변수,멤버 필드,전역변수
	// 전역변수 변수선언
	// 문자열 null int 0

	public String name;
	public int age;
	public String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {

		Method_1 me = new Method_1();
		//set,get :set 설정,수정,삽입 
		//get:얻는다 
		me.setName("김현호");
		me.setAge(20);
		me.setAddress("부산");
		
		
		System.out.println(me.getName());
		System.out.println(me.getAge());
		System.out.println(me.getAddress());
		
		
	}
}
