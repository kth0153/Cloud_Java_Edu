package j20220727;

public class Switch_1 {

	public static void main(String[] args) {

		/* switch: 해당하는 case 가 걸리면 case 실행 */

		// object:모든 타입을 다 받을수 있다
		// 타입 변환 ,상속(가장어렵다)

		int choice = 1;
		switch (choice) {
		case 1:
			System.out.println(choice);
		//	break;
		case 2:
			System.out.println(choice);
		//	break;
		case 3:
			System.out.println(choice);
		//	break;

		default:
			System.out.println("그밖에:"+choice);
			break;
		}
		System.out.println("다음글입니다.");
	}
}
