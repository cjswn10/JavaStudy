package hw2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class EmpFrame extends JFrame{
	EmpDao dao;
	//
	JButton btn;
	JComboBox<Vector<String>> combo;
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	
	public EmpFrame() {
		dao=new EmpDao();
		
		combo=new JComboBox(dao.getDepts());
		JPanel p1 = new JPanel();
		btn=new JButton("�˻�");
		
		p1.add(combo);
		p1.add(btn);
		add(p1,BorderLayout.NORTH);
		
		colNames = new Vector<String>();
		colNames.add("�����ȣ");
		colNames.add("�����");
		colNames.add("�޿�");
		colNames.add("����");
		colNames.add("�Ի���");
		colNames.add("�ֹι�ȣ");
		colNames.add("�μ���ȣ");
		colNames.add("����");
		colNames.add("�ּ�");
		colNames.add("�����ڹ�ȣ");
		colNames.add("���ڿ���");
		
		rowData = new Vector<Vector<String>>();
		table=new JTable(rowData,colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rowData.clear();
				//���� �ҷ��ͼ� �����ϱ� ���� ���͸� �����.
				ArrayList<EmpVo> list = dao.selectAll(combo.getSelectedItem()+"");
				//�޺����� ������ �μ����� �Ű������� �Ͽ� dao�� ���� �ش�μ��� ��� ��������
				//ArrayList�� ��´�.
				
				//list�� ��� ��ŭ �ݺ� �����Ͽ�
				//JTable�����͸� ǥ���ϱ� ���� Vector
				for(EmpVo v : list) {
					//list�� ��� ������ �ϳ��� �����ͼ� v�� ��´�
					Vector<String> ve = new Vector<String>();
					
					ve.add(v.getEno()+"");
					ve.add(v.getEname());
					ve.add(v.getSal()+"");
					ve.add(v.getComm()+"");
					ve.add(v.getHiredate());
					ve.add(v.getJumin());
					ve.add(v.getDno()+"");
					ve.add(v.getPosition());
					ve.add(v.getAddr());
					ve.add(v.getMgr()+"");
					ve.add(v.getEmail());
					
					rowData.add(ve);
					//�ѻ���� ������ ��� ����ve�� ��ü�����͸� ��� ���� rowData�� ��´�.
				}
				table.updateUI();
				//���̺��� �ٽ� �׷��� ���� ��û�Ѵ�.
			}
		});
		
		add(jsp,BorderLayout.CENTER);
		
		setSize(1300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new EmpFrame();
	}

}
