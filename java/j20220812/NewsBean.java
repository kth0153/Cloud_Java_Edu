package j20220812;

public class NewsBean {

//	<!-- number 홈 사회 정치 경제 국제 문화 IT 연재 포토 팩트체크 -->
	
	private int newnumber;
	private String newhome;
	private String newsociety;
	private String newpolitics;
	private String neweconomy;
	private String newinternational;
	private String newculture;
	private String newit;
	private String newpublish;
	private String newphoto;
	private String newfactcheck;
	
	public int getNewnumber() {
		return newnumber;
	}

	public void setNewnumber(int newnumber) {
		this.newnumber = newnumber;
	}

	public String getNewhome() {
		return newhome;
	}

	public void setNewhome(String newhome) {
		this.newhome = newhome;
	}

	public String getNewsociety() {
		return newsociety;
	}

	public void setNewsociety(String newsociety) {
		this.newsociety = newsociety;
	}

	public String getNewpolitics() {
		return newpolitics;
	}

	public void setNewpolitics(String newpolitics) {
		this.newpolitics = newpolitics;
	}

	public String getNeweconomy() {
		return neweconomy;
	}

	public void setNeweconomy(String neweconomy) {
		this.neweconomy = neweconomy;
	}

	public String getNewinternational() {
		return newinternational;
	}

	public void setNewinternational(String newinternational) {
		this.newinternational = newinternational;
	}

	public String getNewculture() {
		return newculture;
	}

	public void setNewculture(String newculture) {
		this.newculture = newculture;
	}

	public String getNewit() {
		return newit;
	}

	public void setNewit(String newit) {
		this.newit = newit;
	}

	public String getNewpublish() {
		return newpublish;
	}

	public void setNewpublish(String newpublish) {
		this.newpublish = newpublish;
	}

	public String getNewphoto() {
		return newphoto;
	}

	public void setNewphoto(String newphoto) {
		this.newphoto = newphoto;
	}

	public String getNewfactcheck() {
		return newfactcheck;
	}

	public void setNewfactcheck(String newfactcheck) {
		this.newfactcheck = newfactcheck;
	}
	

	// 생성자 생성
	public NewsBean(int newnumber, String newhome, 
			String newsociety, String newpolitics, 
			String neweconomy, String newinternational,
			String newculture,String newit,String newpublish,
			String newphoto,String newfactcheck) {
		
		 this.newnumber=newnumber;
		 this.newhome=newhome;
		 this.newsociety=newsociety;
		 this.newpolitics=newpolitics;
		 this.neweconomy=neweconomy;
		 this.newinternational=newinternational;
		 this.newculture=newculture;
		 this.newit=newit;
		 this.newpublish=newpublish;
		 this.newphoto=newphoto;
		 this.newfactcheck=newfactcheck;
				
		
	}
	
	
}
