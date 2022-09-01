package ㅓ20220728;

public class Gwang_2 {

						
					String name;
					int age;
					String address;
					
				
			//get,set 
				//get:값얻는다 
					//set,add,put:설정,수정,삽입
					
					public void setName(String name) {
						this.name=name;
						
					} 
					
					public String getName() {
						return name;
					}
					
					
					
					
	
	public static void main(String[] args) {
		
			String name="김현호";
			int age=20;
			String address="서울";
			
			
			
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
			
		Gwang_2 gw=new Gwang_2();
		System.out.println(gw.name); 
		
		gw.age=20;
		gw.address="부산";
		
		System.out.println(gw.age);
		System.out.println(gw.address);
		
		
		/* 이름,나이,주소 전역변수에 값을 저장하고 출력 */
		
		
		
		Gwang_2 gw2=new Gwang_2();
			
		
		gw2.setName("김현호");
		
		System.out.println(gw2.getName());
		
		
	}
	
	
	
	
}
