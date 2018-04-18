package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaTab extends JPanel implements ActionListener{
	JCheckBox[] c;
	JTextField text;
	
	public JavaTab() {
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		
		text = new JTextField(50);
		c = new JCheckBox[4];
		c[0] = new JCheckBox("객체지향");
		c[1] = new JCheckBox("Interpreter 사용");
		c[2] = new JCheckBox("높은 이식성");
		c[3] = new JCheckBox("MultiThread 사용");
		

		for (int i = 0; i < c.length; i++) {
			p1.add(c[i]);
			c[i].addActionListener(this);
		}
		p2.add(text);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String check = "";
		for (int i = 0; i < c.length; i++) {
			if(c[i].isSelected()) {
				check += c[i].getText() + ", ";
			}
		}
		if(check.equals("")) {
			check = "  ";
		}
		text.setText(check.substring(0, check.length()-2));
		
	}
	
	
}
