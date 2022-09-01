package common;
import java.util.ArrayList;
public class Method_2 extends CommonHome {

	public Method_2(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Method_2 me = new Method_2("김현호", 20, "부산");
		System.out.println(me.getName());
		System.out.println(me.getAge());
		System.out.println(me.getAddress());

		ArrayList list=new ArrayList(); 
		
		for(int i=1;i<=5;i++) {
			
			Method_2 me3 = new Method_2("김현호"+i, (20+i), "부산"+i);
			list.add(me3);
			
		}
		
		for (int i = 0; i <list.size(); i++) {
			
		String type=list.get(i).getClass().getName();
		
			
		
		}
		
		
		
		
		
	}

}
