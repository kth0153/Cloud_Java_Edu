package ㅓ20220728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstNameSearch_1 {

		
	

	
	public static void main(String[] args) throws Exception{
		/*
		 * BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));
		 * buffer.readLine();
		 */	
			
		
		String name[]= {"김현호","아무개","홍길동"};
		
		/* 성을 바꾸어서 다시 배열에 입력하고 출력하시오 */
			// 오 이 김
		//무한입력 
		
		
		char names[]= {'이','오','박'};
		
		String temp="";
		
		for (int i = 0; i < name.length; i++) {
			
			for (Integer j = 0; j < name[i].length(); j++) {
				char charvalue=	name[i].charAt(j);
				
					if(j.equals(0)) {
						temp =String.valueOf(names[i]);
						
					}else {
						temp+=String.valueOf(charvalue);
					}
					
				}
		
					name[i]=temp;
		}
		
				System.out.println("======================");
		
		for (int i = 0; i < names.length; i++) {
		
					System.out.println(name[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	
	//1시간 
	
}
