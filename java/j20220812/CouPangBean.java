package j20220812;

import java.util.ArrayList;
import java.util.Hashtable;

public class CouPangBean {
	String coupang[] = {"로켓배송", "로켓프레시", "쿠팡비즈", "로켓직구", "골드박스", "와우회원할인", "이벤트/쿠폰", "기획전", "여행/티켓"};
	static int index = 0;
	
	public ArrayList list ;
	public Hashtable board;
	
	// ArrayList에 담긴 데이터 가져오기
	public ArrayList getList() {
		if(list==null) {
			new ArrayList(); // ArrayList 데이터 없으면 생성
		}
		return list; // 데이터 있으면 데이터 리스트로 넘기기
	}
	
	
	public void setList(Object input) {
		list.add(input); // 리스트에서 가져온 데이터 값 저장
	}
	
	
	public void setBoard(String choiceboard, Object input) {
		this.board.put(choiceboard, input);
	}
	
	
	
	public void setcoupang() {
		
		Hashtable table = new Hashtable();
		
		for(int i=0;i<coupang.length;i++) {
			table.put(coupang[i], coupang[i]);
		}
		
	}
	
	public CouPangBean(String coupang1,String coupang2,String coupang3,
			String coupang4,String coupang5,String coupang6,String coupang7,
			String coupang8,String coupang9) {
		
		this.setBoard("board1",new CouPangBean(++index, coupang1, coupang2, coupang3, coupang4, coupang5, coupang6, coupang7, coupang8, coupang9));

	}
	
	// 게시판 0123456
	public CouPangBean(int index, String coupang1,String coupang2,String coupang3,
			String coupang4,String coupang5,String coupang6,String coupang7,
			String coupang8,String coupang9) {
		

	}
	
	
	
	public String[] getCouPang(){
		return coupang;
	}
	
	
	
	
	
	
	
	
}
