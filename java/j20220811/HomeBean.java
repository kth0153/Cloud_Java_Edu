package j20220811;

import common.CommonHome;

public class HomeBean extends CommonHome{

	public HomeBean(String name, int age, String address, String email) {
		super(name, age, address, email);
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
		this.setEmail(email);
	}
}



