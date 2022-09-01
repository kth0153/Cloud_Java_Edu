package j202220729;

import java.util.Hashtable;

public class Hash_2 {

	public static void main(String[] args) {
		Hashtable hash=new Hashtable();
	
		
		for (int i = 1; i <=5; i++) {
				hash.put(i, i);
		}
	
		for (int i = 1; i <=hash.size(); i++) {
			int intvalue=	(int)hash.get(i);
			System.out.println(intvalue);
		}
		
		
	}
	
}
