package j20220801;

public class NullPointerException_1 {

	public static void main(String[] args) {
//		NullPointerException :null값을 다른것으로 바꿀때 (아무것도 없는데 
//		값을 변할려고할때 
		
			
		try {
			
			//null:초기화 (아무것도 없다)
			
			String name=null;
			name=name.toUpperCase();
			
			System.out.println(name);
			
		} catch (NullPointerException e) {
					e.printStackTrace();
			
		}

		
		
	}
	
	
	
}
