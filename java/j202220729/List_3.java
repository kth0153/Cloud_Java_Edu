package j202220729;

import java.util.ArrayList;

public class List_3 {

	String name;
	int age;
	String address;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	
	public List_3(String name,int age,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public static void main(String[] args) {

		ArrayList array = new ArrayList();
		List_3 list=new List_3("김현호", 20, "부산");
	
				array.add(list);
				
				List_3 listvalue=	(List_3)array.get(0);
				System.out.println(listvalue.getName());
				System.out.println(listvalue.getAge());
				System.out.println(listvalue.getAddress());
				
				
					
	}
}
