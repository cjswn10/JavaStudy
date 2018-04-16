package exam05;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListTest extends JFrame {

	Vector<String> data;
	JTextField jtf;
	JList<String> list;

	public ListTest() {
		data = new Vector<String>();

		data.add("���");
		data.add("��ȭ");
		data.add("��");

		list = new JList<String>(data);
		//scroll�����
		JScrollPane jsp = new JScrollPane(list);

		setLayout(new BorderLayout());
		add(jsp, BorderLayout.CENTER);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 1));
		add(p, BorderLayout.SOUTH);

		jtf = new JTextField(15);
		JButton btnAdd = new JButton("�߰�");
		JButton btnDel = new JButton("����");
		JButton btnDelAll = new JButton("��λ���");

		p.add(jtf);
		p.add(btnAdd);
		p.add(btnDel);
		p.add(btnDelAll);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ������ ������ data�� list�ȿ����� �������� ����Ŵ
				data.add(jtf.getText());
				list.updateUI();
			}
		});

		btnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data.remove(list.getSelectedIndex());
				list.updateUI();

			}
		});

		btnDelAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data.clear();
				// ������
				// data.removeAllElements();
				list.updateUI();
			}
		});

		setSize(200, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListTest();
	}

}
