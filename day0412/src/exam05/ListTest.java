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

		data.add("사랑");
		data.add("평화");
		data.add("돈");

		list = new JList<String>(data);
		//scroll만들기
		JScrollPane jsp = new JScrollPane(list);

		setLayout(new BorderLayout());
		add(jsp, BorderLayout.CENTER);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 1));
		add(p, BorderLayout.SOUTH);

		jtf = new JTextField(15);
		JButton btnAdd = new JButton("추가");
		JButton btnDel = new JButton("삭제");
		JButton btnDelAll = new JButton("모두삭제");

		p.add(jtf);
		p.add(btnAdd);
		p.add(btnDel);
		p.add(btnDelAll);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 참조형 변수라 data랑 list안에꺼랑 같은것을 가리킴
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
				// 같은거
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
