package common.cmd;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import console.common.dao.Diablo3Dao;

// Diablo3BoardCmd 인벤 게시판
public class Diablo3BoardCmd extends CommonCommand {

	public void DoCommand(Map key) {
		// TODO Auto-generated method stub
		
		getOracleConnection();
		
		Diablo3Dao dao = new Diablo3Dao();
		List list = dao.Diablo3BoardList(getOracleConnection(), key);
		
		
		
	}
	
	
}
