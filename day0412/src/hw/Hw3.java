package hw;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Hw3 extends JFrame implements ActionListener{
	JRadioButton[] size;
	ButtonGroup coffee;
	JLabel[] price;
	JTextField money;
	int total;

	public Hw3() {
		setLayout(new BorderLayout());
		JPanel menu = new JPanel();
		JPanel payment = new JPanel();

		add(menu, BorderLayout.CENTER);
		add(payment, BorderLayout.SOUTH);

		// 메뉴판
		menu.setLayout(new GridLayout(1, 2));

		JPanel m1 = new JPanel();
		JPanel m2 = new JPanel();

		menu.add(m1);
		menu.add(m2);

		m1.setLayout(new GridLayout(4, 1));
		JLabel title_size = new JLabel("커피 크기");
		size = new JRadioButton[3];
		size[0] = new JRadioButton("Small");
		size[1] = new JRadioButton("Medium");
		size[2] = new JRadioButton("Large");

		coffee = new ButtonGroup();

		m1.add(title_size);
		for (int i = 0; i < size.length; i++) {
			coffee.add(size[i]);
			m1.add(size[i]);
			size[i].addActionListener(this);
		}

		m2.setLayout(new GridLayout(4, 1));
		JLabel title_price = new JLabel("가격(원)");
		price = new JLabel[3];
		price[0] = new JLabel("3000");
		price[1] = new JLabel("4000");
		price[2] = new JLabel("5000");

		
		m2.add(title_price);
		for (int i = 0; i < price.length; i++) {
			m2.add(price[i]);
		}

		// 결제 금액
		JLabel l_money = new JLabel("결제 금액 : ");
		money = new JTextField(10);
		
		payment.add(l_money);
		payment.add(money);
		
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size.length; i++) {
			if(size[i].isSelected()) {
				total = Integer.parseInt(price[i].getText());
			}
		}
		money.setText(total + "");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hw3();
	}

	

}
