package j202220729;

import java.util.Hashtable;

public class Hash_6 {

			String name;
			String address;
			
			
			public String getName() {
				return name;
			}
			
			public String getAddress() {
				return address;
			}
			
			
			public Hash_6(String name,String address) {
				// TODO Auto-generated constructor stub
					this.name=name;
					this.address=address;
			}
			
	
	public static void main(String[] args) {
		
			Hash_6 hash=new Hash_6("김현호","부산");
			Hash_6 hash2=new Hash_6("김현호2","부산2");
			
			
			Hashtable table=new Hashtable();
			table.put(1,hash);
			table.put(2,hash2);
			
			
			 //입력 ->Hash_6->Hashtable
			//Hashtable ->Hash_6 
		
			
			
				for(int i=1;i<=table.size();i++) {
					
					Hash_6 hashvalue=(Hash_6)table.get(i);
					System.out.println(hashvalue.getName());	
					System.out.println(hashvalue.getAddress());	
							
					
				}
			
			
			
			
		
		
	}

}
