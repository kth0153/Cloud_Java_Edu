package j202220729;

import java.util.ArrayList;

public class List_4 {

	
	
	public static void main(String[] args) {
		
		
		//index 0 부터 시작 0부터 값을 저장한다 
		ArrayList list=new  ArrayList(); 
		
		//
		list.add(1);
		int value=(int)list.get(0);
		
		System.out.println(value);
		System.out.println("========================");
		
		
		list.add("김현호");
		String value2=String.valueOf(list.get(1));
		
		System.out.println(value2);
		System.out.println("========================");
		
		
		
		
		//1차 프로젝트 :쇼핑몰 
		//2차 awscloud:backend spring + vue.js + aws + ubuntu + 관제시스템(통계,그래프 ,로그 ,회원관리)
		//object 모든타입을 담을수 있다 
		//index 0 
		//list.add("김현호");
		
		//list.get(0);
		
		
	//1 ~ 10 합을구하시오 
	//index 0 1 
		
		ArrayList array2=new ArrayList();
			
		 for(int i=0;i<10;i++) {
			 	array2.add(i,i+1);
			 
		 }
		
		 int sum=0;
		 for(int i=0;i<array2.size();i++) {
			 	int intvalue=	(int)array2.get(i);
			 	sum+=intvalue;
			 
		 }
		 	System.out.println(sum);
		 
		
		
		
	}
}
