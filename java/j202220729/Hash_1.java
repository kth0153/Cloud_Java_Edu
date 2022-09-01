package j202220729;

import java.util.Hashtable;

public class Hash_1 {

	public static void main(String[] args) {
		
		//full index: 0~ max 
		//hash:key ,value ->1:1 속도가 가장빠르다 
		//key 을 찾으면 value를 찾는다 
		//<K, V> :key,value
		//key Object  3,4,5,6,7
		
		//Hashtable hash=new Hashtable<K, V>(); 
		
		Hashtable hash=new Hashtable();
		hash.put(0, 0);
		hash.put(1, 1);
		hash.put(2, 2);
		hash.put(3, 3);
		hash.put(4, 4);
		
		
		for (int i = 0; i < hash.size(); i++) {
			int intvalue=(int)hash.get(i);
			System.out.println(intvalue);
		}
		
		hash.clear();
		
		hash.put("김현호", "김현호v");
		hash.put("김현호2", "김현호2v");
		hash.put("김현호3", "김현호3v");
		
		String name=String.valueOf(hash.get("김현호"));
		System.out.println(name);
	
		String name2=String.valueOf(hash.get("김현호3"));
		
		System.out.println(name2);
	
	}
	
}
