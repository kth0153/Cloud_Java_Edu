package j20220801;

public class ClassCastException_1 {

	
	public static void main(String[] args) {
		
		
		try {
			
		//
			Object ob=new Integer(1);
			
			int strvalue=(int)ob;
			System.out.println(strvalue);
			
		} catch (ClassCastException e) {
						e.printStackTrace();
						
		}
		
		
	}
	
}
