package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxTest extends JFrame implements ActionListener {
	JCheckBox[] cb;
	JTextField jtf1;

	public CheckBoxTest() {
		setLayout(new FlowLayout());

		jtf1 = new JTextField(30);

		String[] fruit = {"파인애플", "딸기", "망고", "체리", "오렌지"};
		cb = new JCheckBox[fruit.length];
		
		for(int i = 0; i < fruit.length; i++) {
			cb[i] = new JCheckBox(fruit[i]);
			add(cb[i]);
			cb[i].addActionListener(this);
		}
		add(jtf1);

		setSize(800, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		String r = "";
		
		for(int i = 0; i < cb.length; i++) {
			if(cb[i].isSelected())
				r += cb[i].getActionCommand() + ", ";
			
		}
		if(r.equals(""))
			r = "아무것도 선택하지 않았습니다.";
		else
			r = r.substring(0, r.length()-2) + " 선택하셨습니다";
		
		jtf1.setText(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();
	}
}
