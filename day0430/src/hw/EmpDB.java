package hw;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EmpDB extends JFrame {

	JFrame f;
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	EmpDAO dao;

	public EmpDB() {
		f = this;
		dao = new EmpDAO();

		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("�����ȣ");
		colNames.add("����̸�");
		colNames.add("����");
		colNames.add("����");
		colNames.add("�Ի���");
		colNames.add("�ֹι�ȣ");
		colNames.add("�μ���ȣ");
		colNames.add("��å");
		colNames.add("�ּ�");
		colNames.add("�����ڹ�ȣ");
		colNames.add("�̸���");

		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		JPanel p1 = new JPanel();
		// JPanel p2 = new JPanel();

		JRadioButton btn1 = new JRadioButton("������");
		JRadioButton btn2 = new JRadioButton("����1��");
		JRadioButton btn3 = new JRadioButton("����2��");
		JRadioButton btn4 = new JRadioButton("�λ���");
		JRadioButton btn5 = new JRadioButton("�ѹ���");
		ButtonGroup dept = new ButtonGroup();

		dept.add(btn1);
		dept.add(btn2);
		dept.add(btn3);
		dept.add(btn4);
		dept.add(btn5);

		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				select(btn1.getText());
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				select(btn2.getText());
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				select(btn3.getText());
			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				select(btn4.getText());
			}
		});
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				select(btn5.getText());
			}
		});

		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(1000, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void select(String dname) {
		rowData.clear();
		ArrayList<EmpVO> arr = new ArrayList<EmpVO>();
		arr = dao.getDeptList(dname);

		for (EmpVO e : arr) {
			Vector<String> v = new Vector<String>();

			v.add(e.getEno() + "");
			v.add(e.getEname());
			v.add(e.getSal() + "");
			v.add(e.getComm() + "");
			v.add(e.getHiredate());
			v.add(e.getJumin());
			v.add(e.getDno() + "");
			v.add(e.getPosition());
			v.add(e.getAddr());
			v.add(e.getMgr() + "");
			v.add(e.getEmail());

			rowData.add(v);
		}
		table.updateUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpDB();
	}

}
