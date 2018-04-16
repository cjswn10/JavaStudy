package exam05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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

public class ListTest2 extends JFrame {

	Vector<String> data1;
	Vector<String> data2;
	JTextField jtf1;
	JTextField jtf2;
	JList<String> list1;
	JList<String> list2;

	public ListTest2() {
		setLayout(new FlowLayout());
		JPanel li1 = new JPanel();
		JPanel menu = new JPanel();
		JPanel li2 = new JPanel();

		add(li1);
		add(menu);
		add(li2);

		data1 = new Vector<String>();

		data1.add("사랑");
		data1.add("평화");
		data1.add("돈");

		list1 = new JList<String>(data1);
		JScrollPane jsp1 = new JScrollPane(list1);		
		
		li1.setLayout(new BorderLayout());
		li1.add(jsp1, BorderLayout.CENTER);

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 1));
		li1.add(p1, BorderLayout.SOUTH);

		jtf1 = new JTextField(15);
		JButton btnAdd1 = new JButton("추가");
		JButton btnDel1 = new JButton("삭제");
		JButton btnDelAll1 = new JButton("모두삭제");

		p1.add(jtf1);
		p1.add(btnAdd1);
		p1.add(btnDel1);
		p1.add(btnDelAll1);

		btnAdd1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data1.add(jtf1.getText());
				list1.updateUI();

			}
		});

		btnDel1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data1.remove(list1.getSelectedIndex());
				list1.updateUI();

			}
		});

		btnDelAll1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data1.clear();
				list1.updateUI();
			}
		});

		// 메뉴
		menu.setLayout(new GridLayout(4, 1));
		JButton r = new JButton(">");
		JButton l = new JButton("<");
		JButton rr = new JButton(">>");
		JButton ll = new JButton("<<");

		menu.add(r);
		menu.add(l);
		menu.add(rr);
		menu.add(ll);

		r.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// data2.add(data1.get(list1.getSelectedIndex()));
				data2.add(list1.getSelectedValue());
				data1.remove(list1.getSelectedIndex());
				list1.updateUI();
				list2.updateUI();

			}
		});

		l.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data1.add(list2.getSelectedValue());
				data2.remove(list2.getSelectedIndex());
				list1.updateUI();
				list2.updateUI();
			}
		});

		rr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data2.addAll(data1);
				data1.clear();
				list1.updateUI();
				list2.updateUI();
			}
		});

		ll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data1.addAll(data2);
				data2.clear();
				list1.updateUI();
				list2.updateUI();
			}
		});

		//
		// 두번째 리스트
		//
		data2 = new Vector<String>();

		data2.add("친구");
		data2.add("꿈");
		data2.add("건강");

		list2 = new JList<String>(data2);

		JScrollPane jsp2 = new JScrollPane(list2);		
		
		li2.setLayout(new BorderLayout());
		li2.add(jsp2, BorderLayout.CENTER);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 1));
		li2.add(p2, BorderLayout.SOUTH);

		jtf2 = new JTextField(15);
		JButton btnAdd2 = new JButton("추가");
		JButton btnDel2 = new JButton("삭제");
		JButton btnDelAll2 = new JButton("모두삭제");

		p2.add(jtf2);
		p2.add(btnAdd2);
		p2.add(btnDel2);
		p2.add(btnDelAll2);

		btnAdd2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data2.add(jtf2.getText());
				list2.updateUI();
			}
		});

		btnDel2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data2.remove(list2.getSelectedIndex());
				list2.updateUI();

			}
		});

		btnDelAll2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				data2.clear();
				list2.updateUI();
			}
		});

		setSize(450, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListTest2();
	}

}
