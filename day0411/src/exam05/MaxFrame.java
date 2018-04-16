package exam05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MaxFrame extends JFrame implements ActionListener{
	private JTextField num1;
	private JTextField num2;
	private JLabel result;
	
	public MaxFrame() {
		setLayout(new FlowLayout());
		
		JLabel l_num1 = new JLabel("숫자1");
		num1 = new JTextField(5);
		JLabel l_num2 = new JLabel("숫자2");
		num2 = new JTextField(5);
		
		JButton maxBt = new JButton("큰 수 찾기");
		maxBt.addActionListener(this);
		
		result = new JLabel();
		
		add(l_num1);
		add(num1);
		add(l_num2);
		add(num2);
		add(maxBt);
		add(result);
		
		setSize(400, 200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(num1.getText());
		int b = Integer.parseInt(num2.getText());
		int max = a;
		if (a < b)
			max = b;
		
		result.setText(max + "");
	}
	
}
