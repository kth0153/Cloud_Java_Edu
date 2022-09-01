package j202220729;

import java.util.Hashtable;

public class Hash_3 {

	String address;
	String name;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
		public Hash_3(String name,String address) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.address=address;
		
		}
	
	
	public static void main(String[] args) {

		// key value
		// key object->모든타입이 올수 있다
		// class 부모 object ->모든타입을 object가 받을수있다
		// 최상위부모받을수 있다

		// key 모든 타입이 올수 있다

		Hashtable hash = new Hashtable();

		hash.put("김현호", "김현호v");
		hash.put(1, 1);

		String strvalue = String.valueOf(hash.get("김현호"));

		int value = (int) hash.get(1);

		System.out.println(strvalue);
		System.out.println(value);

		hash.clear();
		System.out.println("=================================");
		//무명 클래스 
		hash.put(1, new Hash_3("김현호","부산"));
		
		Hash_3 hashvalue=(Hash_3)hash.get(1);
			
		System.out.println(hashvalue.getName());
		System.out.println(hashvalue.getAddress());
		
		//생성자  이름,나이,주소 ,주민1,주민2  키 본인맘대로 3명 
		
		//출력하세요 
		//12:00까지 올려주세요 
		
	
		
		
		
		
	}
}
