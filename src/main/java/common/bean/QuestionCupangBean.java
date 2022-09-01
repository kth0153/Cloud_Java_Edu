package console.common.bean;

public class QuestionCupangBean {
	
	public String userid;

	public String passwd;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
	
	public QuestionCupangBean() {
		
	}

	public QuestionCupangBean(String userid, String passwd) {
		
		this.userid = userid;
		this.passwd = passwd;
	} 
	
	
	
}
