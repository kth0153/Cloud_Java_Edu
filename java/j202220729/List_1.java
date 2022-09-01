package j202220729;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {

		// 배열:해당하는 타입만 받을수 있다
		// 맥스값이 정해져 있다

		String array2[] = { "이름1", "이름2", "이름3" };

		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

		// <E>:element 을받을준비가 됬다
//		ArrayList array=new ArrayList<E>();
		/*
		 * list:index 0 add 0부터 시작 0부터 값을 저장한다
		 * 
		 */

		ArrayList array = new ArrayList();

		array.add(0, 1);
		array.add(1, 2);
		array.add(2, 3);
		array.add(3, 4);
		array.add(4, 5);

		System.out.println("=============");
		// length,size
		for (int i = 0; i < array.size(); i++) {
			int value = (int) array.get(i);

			System.out.println(value);

		}

		// 1 ~ 10값을 저장하고 합을 출력하시오

		array.clear();

		for (int i = 1; i <= 10; i++) {

			array.add(i);

		}

		System.out.println("============");
		int sum=0;
		for (int i = 0; i < array.size(); i++) {

			int intvalue = (int) array.get(i);
				sum=sum+intvalue;
			
		}
				System.out.println(sum);
	}
}
