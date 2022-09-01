package common.bean;

public class Diablo3Bean extends BaseBean{
	public String BOARDSUBJECT;
	public String BOARDCURRENTDATE;
	public String BOARDCOUNT;
	public String BOARDLIKE;
	

	public Diablo3Bean() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Diablo3Bean(String nUMINDEX, String uSERID, String pASSWD, String bIRTHDAY, String eMAIL, String jUMIN1,
			String jUMIN2, String pHONE, String aDDRESS, String bOARDSUBJECT, String bOARDCURRENTDATE,
			String bOARDCOUNT, String bOARDLIKE) {
		super(nUMINDEX, uSERID, pASSWD, bIRTHDAY, eMAIL, jUMIN1, jUMIN2, pHONE, aDDRESS);
		BOARDSUBJECT = bOARDSUBJECT;
		BOARDCURRENTDATE = bOARDCURRENTDATE;
		BOARDCOUNT = bOARDCOUNT;
		BOARDLIKE = bOARDLIKE;
	}
	
	public Diablo3Bean(String nUMINDEX, String uSERID, String BOARDSUBJECT, String BOARDCURRENTDATE, String BOARDCOUNT, String BOARDLIKE) {
		
		this.NUMINDEX = nUMINDEX;
		this.USERID = uSERID;
		this.BOARDSUBJECT =BOARDSUBJECT; 
		this.BOARDCURRENTDATE = BOARDCURRENTDATE;
		this.BOARDCOUNT = BOARDCOUNT;
		this.BOARDLIKE = BOARDLIKE;

	}


	public String getBOARDSUBJECT() {
		return BOARDSUBJECT;
	}


	public void setBOARDSUBJECT(String bOARDSUBJECT) {
		BOARDSUBJECT = bOARDSUBJECT;
	}


	public String getBOARDCURRENTDATE() {
		return BOARDCURRENTDATE;
	}


	public void setBOARDCURRENTDATE(String bOARDCURRENTDATE) {
		BOARDCURRENTDATE = bOARDCURRENTDATE;
	}


	public String getBOARDCOUNT() {
		return BOARDCOUNT;
	}


	public void setBOARDCOUNT(String bOARDCOUNT) {
		BOARDCOUNT = bOARDCOUNT;
	}


	public String getBOARDLIKE() {
		return BOARDLIKE;
	}


	public void setBOARDLIKE(String bOARDLIKE) {
		BOARDLIKE = bOARDLIKE;
	}
	
	
	
	

}
