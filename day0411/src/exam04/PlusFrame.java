package exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//�츮�� ���� PlusFrame�� JFrame�� ��ӹ޾Ұ�
//��ư�� �̺�Ʈ ó�� ����ڰ� �Ǿ�� �Ѵ�.
public class PlusFrame extends JFrame implements ActionListener {
	private JTextField jtf01; // ù��° ���� �Է��� �Է»���
	private JTextField jtf02; // �ι�° ���� �Է��� �Է»���
	private JLabel jlbResult; // ���ϱ� ����� ����� ��

	public PlusFrame() {
		setLayout(new FlowLayout());

		JLabel jlb01 = new JLabel("����1");
		jtf01 = new JTextField(5); // 5�� �̳� �Է�
		JLabel jlb02 = new JLabel("����2");
		jtf02 = new JTextField(5); // 5�� �̳� �Է�

		JButton jb01 = new JButton("���ϱ�");

		jb01.addActionListener(this);

		jlbResult = new JLabel("     ");

		add(jlb01); // ��Ҹ� â�� ����, ���� ���x
		add(jtf01);
		add(jlb02);
		add(jtf02);
		add(jb01);
		add(jlbResult);

		setSize(500, 484);
		setVisible(true);

		// â�� ������ ���α׷��� �����ϵ��� ����
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
