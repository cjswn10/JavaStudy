package hw;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hw2 extends JFrame implements ActionListener {
	JCheckBox[] repair;
	JLabel[] price;
	JTextField money;

	public Hw2() {
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

		m1.setLayout(new GridLayout(5, 1));
		JLabel title_repair = new JLabel("수리");
		repair = new JCheckBox[4];
		repair[0] = new JCheckBox("엔진 오일 교환");
		repair[1] = new JCheckBox("자동 변속기 오일 교환");
		repair[2] = new JCheckBox("에어컨 필터 교환");
		repair[3] = new JCheckBox("타이어 교환");

		m1.add(title_repair);
		for (int i = 0; i < repair.length; i++) {

			m1.add(repair[i]);
			repair[i].addActionListener(this);
		}
		
		
		m2.setLayout(new GridLayout(5, 1));
		JLabel title_price = new JLabel("가격(원)");
		price = new JLabel[4];
		price[0] = new JLabel("45000");
		price[1] = new JLabel("80000");
		price[2] = new JLabel("30000");
		price[3] = new JLabel("100000");

		
		m2.add(title_price);
		for (int i = 0; i < price.length; i++) {
			m2.add(price[i]);
		}

		// 결제 금액
		JLabel l_money = new JLabel("결제 금액 : ");
		money = new JTextField(10);
		
		payment.add(l_money);
		payment.add(money);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i < repair.length; i++) {
			if(repair[i].isSelected()) {
				total += Integer.parseInt(price[i].getText());
			}
		}
		money.setText(total + "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hw2();
	}

}
