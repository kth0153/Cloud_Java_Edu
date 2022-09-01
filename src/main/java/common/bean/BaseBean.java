package common.bean;

public class BaseBean {
	
	public String NUMINDEX;
	public String USERID;
	public String PASSWD;
	public String BIRTHDAY;
	public String EMAIL;
	public String JUMIN1;
	public String JUMIN2;
	public String PHONE;
	public String ADDRESS;

	
	
	
	public BaseBean(String nUMINDEX, String uSERID, String pASSWD, String bIRTHDAY, String eMAIL, String jUMIN1,
			String jUMIN2, String pHONE, String aDDRESS) {
	
		this.NUMINDEX = nUMINDEX;
		this.USERID = uSERID;
		this.PASSWD = pASSWD;
		this.BIRTHDAY = bIRTHDAY;
		this.EMAIL = eMAIL;
		this.JUMIN1 = jUMIN1;
		this.JUMIN2 = jUMIN2;
		this.PHONE = pHONE;
		this.ADDRESS = aDDRESS;
	}
	
	public BaseBean() {
//		super();
	}




	public String getNUMINDEX() {
		return NUMINDEX;
	}




	public void setNUMINDEX(String nUMINDEX) {
		NUMINDEX = nUMINDEX;
	}




	public String getUSERID() {
		return USERID;
	}




	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}




	public String getPASSWD() {
		return PASSWD;
	}




	public void setPASSWD(String pASSWD) {
		PASSWD = pASSWD;
	}




	public String getBIRTHDAY() {
		return BIRTHDAY;
	}




	public void setBIRTHDAY(String bIRTHDAY) {
		BIRTHDAY = bIRTHDAY;
	}




	public String getEMAIL() {
		return EMAIL;
	}




	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}




	public String getJUMIN1() {
		return JUMIN1;
	}




	public void setJUMIN1(String jUMIN1) {
		JUMIN1 = jUMIN1;
	}




	public String getJUMIN2() {
		return JUMIN2;
	}




	public void setJUMIN2(String jUMIN2) {
		JUMIN2 = jUMIN2;
	}




	public String getPHONE() {
		return PHONE;
	}




	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}




	public String getADDRESS() {
		return ADDRESS;
	}




	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	


	
	



	
	

	
	
	

}
