package exam02;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputTab extends JPanel {

	public InputTab() {
		setLayout(new GridLayout(4, 2));
		add(new JLabel("�̸�"));
		add(new JTextField(20));
		add(new JLabel("����"));
		add(new JTextField(20));
		add(new JLabel("����"));
		add(new JTextField(20));
		add(new JLabel("����"));
		add(new JTextField(20));

		
	}
	
	
}
