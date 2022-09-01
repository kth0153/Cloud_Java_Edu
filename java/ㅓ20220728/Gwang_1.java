package ㅓ20220728;


//같은 거면 extends 
//틀린거면 implements 


//Object:모든 클래스는 반드시 상속받는다
//클래스는 하나만 받을수 있다 
//Object는 생략이 가능하다 

//




public class Gwang_1   extends Object  implements Mega_1 {

	
	
	//@어노니테이션:오버라이드  @Override 규약 
	//오버라이드는 부모 리턴타입 메소드명 (아귀먼트 갯수,아귀먼트 타입)이같으면
	//자식이오버라이드된다 
	
	@Override
	public void Print() {
		System.out.println("광안대교1 반입니다.");
		
	}

	@Override
	public void List() {
		System.out.println("5반 있습니다.");
		
	}
	
	public static void main(String[] args) {
		
	
		Gwang_1 gw=new Gwang_1();
		
	gw.Print();
	gw.List();
	
	
	//mega 안에 gwang_1가 속해있다 
	//gwang_1 mega
	//진흥원.5.gwang_1
	//큰데에서 작은데로 
	
	Mega_1 me=new Gwang_1();
	me.Print();
	me.List();
	
	
	}
}
