package j20220811;

public class Gwang2JspBean extends Gwang2JspInsert {

	public Gwang2JspBean(String userid, String subject, String date, int like, int count) {
		super(userid, subject, date, like, count);
		this.setUserid(userid);
		this.setSubject(subject);
		this.setDate(date);
		this.setLike(like);
		this.setCount(count);
		
		
	}



}
