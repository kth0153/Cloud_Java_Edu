package j20220726;

public class Switch_1 {

	public static void main(String[] args) {

		/* switch:조건맞으면 해당하는 case 간다 default 는 일치하는값이 없으면 */

		// System.exit(0);

		switch (4) {

		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("값이없습니다");
			break;

		}

		System.out.println("============================");

		String name = "김현호";

		switch (name) {
		case "김현호":
			System.out.println(name + "검색됨");
//				break;

		case "아무개":
			System.out.println(name + "검색됨");
//				break;

		case "홍길동":
			System.out.println(name + "검색됨");
			break;

		default:
			System.out.println(name + "검색뒤지 않음");
			break;
		}

		// 싱글쿼터는 문자를 나타낸다
		// 문자열 ->문자 + 문자 ->문자열
		char firstname = '김';
			System.out.println("=========================");
			
		switch (firstname) {
		case '김':
			System.out.println(firstname + " 검색됨 ");
			break;

		case '이':

			System.out.println(firstname + " 검색됨 ");
			break;

		case '박':
			System.out.println(firstname + " 검색됨 ");
			break;

		default:
			break;
		}

	}

}
