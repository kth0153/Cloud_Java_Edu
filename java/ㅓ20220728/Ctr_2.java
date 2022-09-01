package ㅓ20220728;

public class Ctr_2 {

	String name;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Ctr_2(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {

		
		Ctr_2 ctrl=new Ctr_2("김현호", "서울");
		System.out.println(ctrl.getName());
		System.out.println(ctrl.getAddress());
		
		System.out.println("==============================");
		for (int i = 1; i <= 5; i++) {
				
			Ctr_2 ctrl2=new Ctr_2("김현호"+i,"서울"+i);
			System.out.println(ctrl2.getName());
			System.out.println(ctrl2.getAddress());
		System.out.println("================================");
		}
		
		
		
		
	}
}
