package ㅓ20220728;

public class Ctr_1 {

	
	/*
	 * 	메소드:메소드는 반드시 괄호가 있다 
	 * 변수는 괄호가 없다 변수는 하나의타입만 받을수있다 
	 * 메소드는 여러타입을 받을수 있다 
	 * 변수는 움직일수 없다
	 * 메소드를 통해서 움직인다 
	 * jdbc ->mvc1
	 */
	
	
	
			String name;
			String address;
			
			
			public void setAddress(String address) {
				this.address = address;
			}
			
			public String getAddress() {
				return address;
			}
			
			
			
			public String getName(                               ) {
				return name;
			}
	
			
			public void setName(String name) {
				this.name = name;
			}
			
			
//			public Ctr_1() {
//				// TODO Auto-generated constructor stub
//				System.out.println("기본생성자입니다.");
//			}
			
			//인자(아귀먼트)가 있는 생성자가오면 기본생성자는 생략할수 없다 
			//고급 자바때 다시 
			
			public Ctr_1(String name,String address) {
				this.name=name;
				this.address=address;
				
			}
			
			
	
	
	public static void main(String[] args) {
	
		//new:메모리 올린다 ->객체 
		//
//		Ctr_1 ctr=new Ctr_1();
		
		Ctr_1 ctl2=new Ctr_1("김현호", "서울");
		
		System.out.println(ctl2.getName());
		System.out.println(ctl2.getAddress());
		
		
		
		
		
		
		
		
		
	}
}
