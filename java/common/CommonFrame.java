package common;

import java.awt.Button;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CommonFrame extends BaseAwtCommand {
	
	public Map hashtype;
	public ArrayList addall;
	public String columns[];
	
	
	
	
	
	
	public Map getHashNew() {

		if (hashtype == null) {
			hashtype = new Hashtable();
		}
		return hashtype;

	}
	
	
	public void setType(Object key, Object inputtype) {

		if (key == null && inputtype == null) {
			hashtype.put(key, inputtype);
			addall.add(hashtype);
		}

	}

	public Map getObjectType() {
		return hashtype;

	}

	public CommonFrame() {
		this("");
	}
	
	public CommonFrame(String layout) {
		// TODO Auto-generated constructor stub
		Panel pan = new Panel();
		
		
		for (int i = 1; i <= 5; i++) {

			Button bu = new Button("bu" + i);
			bu.addActionListener(this);
			pan.add(bu);

		}
		add(pan);

		setSize(300, 200);
		setVisible(true);

		addWindowListener(this);

	}

	@Override
	public void DoAwtExecoute() {
		// TODO Auto-generated method stub
		
	}

}
