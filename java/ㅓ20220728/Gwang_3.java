package ㅓ20220728;

public class Gwang_3 {

	String name;
	int init = 0;

	public String getName() {

		return name;
	}

//	public Gwang_3() {
//
//	}

	public Gwang_3(String name) {
		this.name = name;
	}

	public Gwang_3(int init) {
		System.out.println(init);

	}

	public Gwang_3() {

		System.out.println(++init);

	}

	public static void main(String[] args) {

		// Gwang_3 gw = new Gwang_3();

		Gwang_3 gw2 = new Gwang_3("김현호");
		System.out.println(gw2.getName());

		for (int i = 1; i <= 5; i++) {
			new Gwang_3(i);

		}
		System.out.println("===============");

		for (int i = 1; i <= 5; i++) {
			new Gwang_3();
		}

	}

}
