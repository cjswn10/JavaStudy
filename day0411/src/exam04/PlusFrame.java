package exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//우리가 만든 PlusFrame은 JFrame을 상속받았고
//버튼의 이벤트 처리 담당자가 되어야 한다.
public class PlusFrame extends JFrame implements ActionListener {
	private JTextField jtf01; // 첫번째 수를 입력할 입력상자
	private JTextField jtf02; // 두번째 수를 입력할 입력상자
	private JLabel jlbResult; // 더하기 결과를 출력할 라벨

	public PlusFrame() {
		setLayout(new FlowLayout());

		JLabel jlb01 = new JLabel("숫자1");
		jtf01 = new JTextField(5); // 5자 이내 입력
		JLabel jlb02 = new JLabel("숫자2");
		jtf02 = new JTextField(5); // 5자 이내 입력

		JButton jb01 = new JButton("더하기");

		jb01.addActionListener(this);

		jlbResult = new JLabel("     ");

		add(jlb01); // 요소를 창에 담음, 순서 상관x
		add(jtf01);
		add(jlb02);
		add(jtf02);
		add(jb01);
		add(jlbResult);

		setSize(500, 484);
		setVisible(true);

		// 창을 닫으면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(jtf01.getText());
		int b = Integer.parseInt(jtf02.getText());
		int r = a + b;
		
		jlbResult.setText(r + "");

	}
}
