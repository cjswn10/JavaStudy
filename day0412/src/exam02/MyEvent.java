package exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyEvent implements ActionListener {
	private RadioTest rTest;
	
	public MyEvent(RadioTest rTest) {
		this.rTest = rTest;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		rTest.text.setText(e.getActionCommand());
		System.out.println("´­·µ³×" + e.getActionCommand());
	}

}
