package common;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import common.BaseAwt_1;

public abstract class BaseAwtCommand extends JFrame implements WindowListener, ActionListener, BaseAwt_1 {

	public String layout[] = { "java.awt.GridLayout", "java.awt.BorderLayout" };
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 String event=e.getActionCommand();
		 	System.out.println(event);
		 
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public String getLayout(int layout) {
		return this.layout[layout];
	}

	@Override
	public abstract void DoAwtExecoute();
}
