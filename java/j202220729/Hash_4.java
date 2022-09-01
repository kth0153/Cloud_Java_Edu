package j202220729;

import java.util.Hashtable;

public class Hash_4 {

	
	public static void main(String[] args) {
		
		//hash,map:key,value
		//key를 찾으면 value 값이 나온다 
		//key :Object,value:Object
		
		//set,put,add
		Hashtable table=new Hashtable(); 
			table.put(1, 1);
			int intvalue=(int)table.get(1);
			System.out.println(intvalue);
		
			table.put(1, "김현호");
			String strvalue=(String)table.get(1);
			System.out.println(strvalue);
			
			
			table.clear();
			table.put("김현호",1);
			int intvalue2=(int)table.get("김현호");
			System.out.println(intvalue2);
	
			
			table.clear();
			
			//key:1이름(문자열),key:2 age(int),key:3 주소(String)
			 //생성자 (이름,나이,주소);
			
		
	}
	
}
