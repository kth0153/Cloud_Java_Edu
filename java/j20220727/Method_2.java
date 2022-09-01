package j20220727;

public class Method_2 {

	String name;
	int age;
	String address;

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

		//new:메모리에 올라간다 
		
		Method_2 me = new Method_2();
		
		me.setName("김현호");
		me.setAge(20);
		me.setAddress("부산");

		System.out.println(me.getName());
		System.out.println(me.getAge());
		System.out.println(me.getAddress());
		
		System.out.println("==================");
		Method_2 me2=new Method_2();
		me2.setName("홍길동");
		me2.setAge(15);
		me2.setAddress("조선");
		
		System.out.println(me2.getName());
		System.out.println(me2.getAge());
		System.out.println(me2.getAddress());
		
		
	}
}
