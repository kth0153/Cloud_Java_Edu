package j20220727;

public class Contr_1 {

	String name;
	int age;
	String address;
	String email;

	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contr_1() {

		System.out.println("기본생성자");
	}

	
	public Contr_1(String name,int age,String email,String address) {
			this.name=name;
			this.age=age;
			this.address=address;
			this.email=email;
					
	}
	
	public static void main(String[] args) {
			//기본생성자는 생략이 가능하다 
		//아귀먼트가 있는생성자가 오면 생략할수없다 
		
		Contr_1 con = new Contr_1();

		con.setName("김현호");
		con.setAge(20);
		con.setAddress("부산");
		con.setEmail("kim1234@naver.com");
		
		System.out.println(con.getName());
		System.out.println(con.getAge());
		System.out.println(con.getEmail());
		System.out.println(con.getAddress());
	
		System.out.println("============================================");
		Contr_1 con2=new Contr_1("이름",10,"kim1234@naver.com","주소");

		System.out.println(con2.getName());
		System.out.println(con2.getAge());
		System.out.println(con2.getEmail());
		System.out.println(con2.getAddress());
		
		//등가교환의법칙 
		//이만큼주면 이만큼 받는다 
		//고생많이하면 보상을 받을수 있다 
		//
	
	
	}
}
