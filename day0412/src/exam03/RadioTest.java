package exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//JRadioButton�� �ϳ��� �׸� �����ϵ��� �Ϸ���
//���ϴ� �͵��� ���� �׷��� �����ؾ���
public class RadioTest extends JFrame {
	ButtonGroup gender;
	JRadioButton female;
	JRadioButton male;
	JTextField text;

	
	public RadioTest() {
		setLayout(new FlowLayout());

		female = new JRadioButton("����");
		male = new JRadioButton("����");
		text = new JTextField(10);

		
		//�̸� ���� �̳�Ŭ���� ->����Ŭ����
		female.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText("����� �����Դϴ�.");
			}
		});
		
		male.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText("����� �����Դϴ�.");
				
			}
		});

		gender = new ButtonGroup();
		gender.add(female);
		gender.add(male);

		add(female);
		add(male);
		add(text);

		setSize(300, 200);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioTest();
	}

}
