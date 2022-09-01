package j202220729;

import java.util.ArrayList;
import java.util.Hashtable;

import common.CommonHome;

public class Hash_List_1 extends CommonHome {

	
	
	public Hash_List_1(String name,int age,String address) {
		
		
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	public static void main(String[] args) {
		// Hash_List_1 ->hash->list

//		Hash_List_1 hash = new Hash_List_1();
//
//		hash.setName("김현호");
//		hash.setAddress("부산");
//		hash.setAge(20);
//
//		System.out.println(hash.getName());
//		System.out.println(hash.getAge());
//		System.out.println(hash.getAddress());
		
		Hash_List_1 hash=new Hash_List_1("김현호", 30, "부산");
			ArrayList arraylist=new ArrayList();
			arraylist.add(hash);
			Hashtable table=new Hashtable();
			table.put(1, arraylist);
			
//			입력 :Hash_List_1->ArrayList ->Hashtable
//			출력:Hashtable ->ArrayList->Hash_List_1
			
			ArrayList listvalue=(ArrayList)table.get(1);
			Hash_List_1 h_lvalue=(Hash_List_1)listvalue.get(0);
			
			System.out.println(h_lvalue.getName());
			System.out.println(h_lvalue.getAge());
			System.out.println(h_lvalue.getAddress());
	
	}
}
