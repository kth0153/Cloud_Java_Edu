package j20220727;

public class Array_5 {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

		System.out.println("===========");
		int array2[]=new int[10];
		
		for (int i = 0; i < array2.length; i++) {
			
						array2[i]=i+1;
			
						System.out.println(array2[i]);
		}
		
		
		
		System.out.println("=====================");
		
		
		//2차원배열:[][]           행(row)열(column) 
		//int array3[][]=new int  [3]       [3];
		
		
                         //0         1       2  		
		int array3[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < array3.length; i++) {
			
			for (int j = 0; j < array3[i].length; j++) {
				
//				System.out.print("\t 행:"+i +"\t"+j);
			System.out.print(array3[i][j]);	
			
			}
			
			System.out.println();
		}
		
		
		
		//1 ~ 9합을구하시오 2차원배열을 이용해서 .
		//10분 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
