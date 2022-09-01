package j202220729;

import java.util.ArrayList;

public class List_2 {

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

			List_2 list=new List_2();
			list.setName("김현호");
			list.setAge(30);
			list.setAddress("부산 우동");
		
			System.out.println(list.getName());
			System.out.println(list.getAge());
			System.out.println(list.getAddress());
			
			ArrayList array=new ArrayList();
			array.add("문자열1");
		
			
			String strvalue=	String.valueOf(array.get(0));
			
			System.out.println(strvalue);
			
			array.clear();
			array.add(list);
			
			System.out.println("====================");
			List_2 listvalue=(List_2)array.get(0);
			
			System.out.println(listvalue.getName());
			System.out.println(listvalue.getAge());
			System.out.println(listvalue.getAddress());
			
			
			
	}
	
}
