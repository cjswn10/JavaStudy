package exam02;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputTab extends JPanel {

	public InputTab() {
		setLayout(new GridLayout(4, 2));
		add(new JLabel("이름"));
		add(new JTextField(20));
		add(new JLabel("국어"));
		add(new JTextField(20));
		add(new JLabel("영어"));
		add(new JTextField(20));
		add(new JLabel("수학"));
		add(new JTextField(20));

		
	}
	
	
}
