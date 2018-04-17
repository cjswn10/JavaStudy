package exam06;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//vector ����ϱ�
public class JTableTest extends JFrame {

	Vector<String> listNames;
	Vector<String> listData1;
	Vector<String> listData2;
	Vector<String> listData3;
	Vector<String> listData;
	Vector<Vector> list;
	DefaultTableModel dt;
	JTable table;
	
	
	public JTableTest() {
		listNames = new Vector<String>();
		listData1 = new Vector<String>();
		listData2 = new Vector<String>();
		listData3 = new Vector<String>();

		list = new Vector<Vector>();

		listNames.add("�̸�");
		listNames.add("����");
		listNames.add("����");
		listNames.add("����");

		listData1.add("������");
		listData1.add("100");
		listData1.add("100");
		listData1.add("100");

		listData2.add("�ѻ���");
		listData2.add("80");
		listData2.add("90");
		listData2.add("100");

		listData3.add("������");
		listData3.add("90");
		listData3.add("80");
		listData3.add("100");

		list.add(listData1);
		list.add(listData2);
		list.add(listData3);

		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		dt = new DefaultTableModel(list, listNames);
		table = new JTable(dt);
		JScrollPane jsp = new JScrollPane(table);
		

		// �����Է�
		p1.setLayout(new GridLayout(4, 2));

		JLabel n = new JLabel("�̸�");
		JTextField name = new JTextField(15);
		JLabel k = new JLabel("����");
		JTextField kor = new JTextField(15);

		JLabel e = new JLabel("����");
		JTextField eng = new JTextField(15);

		JLabel m = new JLabel("����");
		JTextField math = new JTextField(15);

		p1.add(n);
		p1.add(name);
		p1.add(k);
		p1.add(kor);
		p1.add(e);
		p1.add(eng);
		p1.add(m);
		p1.add(math);

		JButton btn_add = new JButton("�߰�");
		JButton btn_edit = new JButton("����");
		JButton btn_delete = new JButton("����");

		btn_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listData = new Vector<String>();
				listData.add(name.getText());
				listData.add(kor.getText());
				listData.add(eng.getText());
				listData.add(math.getText());
				list.add(listData);
				System.out.println(table.getSelectedRow());
				table.updateUI();
			}
		});

		btn_edit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				table.updateUI();
			}
		});

		btn_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				list.remove(table.getSelectedRow());
				table.updateUI();
			}
		});

		p2.add(btn_add);
		p2.add(btn_edit);
		p2.add(btn_delete);
		
		 // ���̺��� JScrollPane�� ��ƾ���

		p3.add(jsp);
		
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTableTest();
	}

}
