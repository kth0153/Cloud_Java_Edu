package ㅓ20220728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputChangeNameSearch {

	static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
	public static void ChangeLastNameSearch(int max) throws Exception {
		Object str[] = new Object[max];
		System.out.println();
		System.out.println("input name:");
		for (int i = 0; i < str.length; i++) {
			str[i] = buffer.readLine();
		}

		System.out.println("search last name input:");
		String searchname = buffer.readLine();
		System.out.println(" change last name input:");
		String changename = buffer.readLine();
		String chartemp = "";

		for (int i = 0; i < str.length; i++) {

			if (str[i].getClass().getName().equals("java.lang.String")) {

				String strvalue = String.valueOf(str[i]);

				for (int j = 0; j < strvalue.length(); j++) {

					String charvalue = String.valueOf(strvalue.charAt(j));

					if (searchname.equals(charvalue)) {

						chartemp = changename;

					} else {

						chartemp += charvalue;
					}
				}

				str[i] = chartemp;
				chartemp = "";
			}
		}

		for (int i = 0; i < str.length; i++) {
			System.out.println(i + ":" + str[i]);
		}
	}

	public static void main(String[] args) throws Exception {

		System.out.println();

		System.out.println("input name count?");

		int namecount = Integer.parseInt(buffer.readLine());

		InputChangeNameSearch.ChangeLastNameSearch(namecount);

	}

}
