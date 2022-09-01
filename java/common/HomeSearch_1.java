package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class HomeSearch_1 {
	BufferedReader buffer;
	String home[];
	Hashtable hash;
	
	
	

	public BufferedReader NewBuffer() {
		buffer = new BufferedReader(new InputStreamReader(System.in));
		return buffer;
	}

	public Hashtable NewHash() {
		hash = new Hashtable();
		return hash;
	}

	// 이름/나이/주소/주민1/주민2
	//키로 이름/나이/주소 검색되면 출력 
	//3명  검색어 지정 해당하는 라인이면 검색 
	
	
	public Hashtable NewLine(int max) {
		home = new String[max];

		String keyvalue = "";
		for (int i = 0; i < home.length; i++) {
			try {
				home[i] = buffer.readLine();
				hash.put(home[i], home[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return hash;
	}

	public void HomeSearch() throws Exception {
		NewBuffer();
		NewHash();

		System.out.println("입력할 사람의 숫자를 입력하시오?");
		int max = Integer.parseInt(buffer.readLine());
		
		
		System.out.println("개인정보 입력을 입력하시오?");
		Hashtable address = NewLine(max);
		
		System.out.println("검색할조건을 입력하시오?");
		String searchvalue = buffer.readLine();
		// 이름/나이/주소/주민1/주민2

		Enumeration en = address.keys();
		while (en.hasMoreElements()) {
			String name = (String) address.get(en.nextElement());
			StringTokenizer token = new StringTokenizer(name, "/");
			
			while(token.hasMoreElements()) {
				String searchtoken = token.nextToken();
				if (searchtoken.equals(searchvalue)) {
					System.out.println(name + " 검색되었습니다.");
				}		
				
			}
			
			

		}

	}

	public static void main(String[] args) {

		HomeSearch_1 home = new HomeSearch_1();
		try {
			home.HomeSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
