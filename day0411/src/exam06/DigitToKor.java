package exam06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DigitToKor extends JFrame implements ActionListener{
	private JTextField num;
//	private JLabel kor;
	private JTextField kor;
	
	public DigitToKor() {
		setLayout(new FlowLayout());
		
		JLabel l_num = new JLabel("¼ýÀÚ");
		num = new JTextField(5);
		
		JButton bt = new JButton("ÇÑ±Ûº¯È¯");
		bt.addActionListener(this);
		
//		kor = new JLabel();	
		kor = new JTextField(5);
		
		
		add(l_num);
		add(num);
		add(bt);
		add(kor);
		
		setSize(400, 100);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String[] str = {"¿µ", "ÀÏ", "ÀÌ", "»ï", "»ç", "¿À", "À°", "Ä¥", "ÆÈ", "±¸"};
		String ko = str[Integer.parseInt(num.getText())];
		kor.setText(ko);
	}
}
