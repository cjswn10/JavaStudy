package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//JRadioButton은 하나의 항목만 선택하도록 하려면
//원하는 것들을 묶어 그룹을 설정해야함
public class RadioTest extends JFrame implements ActionListener {
	ButtonGroup gender;
	JRadioButton female;
	JRadioButton male;
	JTextField text;
	
	public RadioTest() {
		setLayout(new FlowLayout());
		
		female = new JRadioButton("여성");
		male = new JRadioButton("남성");
		text = new JTextField(10);
		
		gender = new ButtonGroup();
		gender.add(female);
		gender.add(male);
		
		female.addActionListener(this);
		male.addActionListener(this);
		
		add(female);
		add(male);
		add(text);
		
		setSize(300, 200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();
		
		text.setText(str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioTest();
	}

}
