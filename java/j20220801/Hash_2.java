package j20220801;

import java.util.Hashtable;
import common.CommonHome;

public class Hash_2 extends CommonHome {

	
public Hash_2(String name,int age,String address) {
				
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
}
	
	
public Hash_2() {
	// TODO Auto-generated constructor stub
}	

	
	public static void main(String[] args) {
		Hashtable hash=new Hashtable();
		for (int i = 0; i < 11; i++) {
			
				hash.put(i,i);
				int intvalue=(int)hash.get(i);
				System.out.println(intvalue);
				
		}
		
		hash.clear();
		
		
		
		Hash_2 hash2=new Hash_2();
		
		hash2.setName("김현호");
		hash2.setAge(20);
		hash2.setAddress("부산");
		System.out.println("====================");
		System.out.println(hash2.getName()); 
		System.out.println(hash2.getAge()); 
		System.out.println(hash2.getAddress()); 
			
		
		
		Hash_2 hash3=new Hash_2("한산-이순신", 20, "부산");		
		System.out.println("==================");
		System.out.println(hash3.getName()); 
		System.out.println(hash3.getAge()); 
		System.out.println(hash3.getAddress()); 
		
		
	}
}
