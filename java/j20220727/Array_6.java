package j20220727;

public class Array_6 {

	public static void main(String[] args) {

		String strvalue[] = { "김현호", "김영호", "아무개" };

		for (int i = 0; i < strvalue.length; i++) {

			System.out.println(strvalue[i]);
		}

		System.out.println("================================================");
		
										//0                 //1
		String strvalue2[][] = { { "김", "이", "박" }, { "오", "강", "최" } };

		for (int i = 0; i < strvalue2.length; i++) {

			for (int j = 0; j < strvalue2[i].length; j++) {

				System.out.print("\t" + strvalue2[i][j] + "\t");
			}
			System.out.println();
		}

		
		//김  이  검색해서 김씨면 김씨  검색 이씨면 이씨  검색
		
		
	}

}
