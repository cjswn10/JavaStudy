package hw;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CustomerList extends JFrame{
	Vector<Vector<String>> rowData;
	Vector<String> colNames;
	JTable table;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@203.236.209.115:1521:XE";
	String user = "scott";
	String pwd = "tiger";
	
	public CustomerList() {
		rowData = new Vector<Vector<String>>();
		colNames = new Vector<String>();
		
		colNames.add("����ȣ");
		colNames.add("�̸�");
		colNames.add("�ֹι�ȣ");
		colNames.add("�ּ�");
		colNames.add("�ڵ���");

		getRow();
		
		JPanel pInput = new JPanel();
		pInput.setLayout(new BorderLayout());
		JPanel pText = new JPanel();
		JPanel pBtn = new JPanel();
		pInput.add(pText, BorderLayout.CENTER);
		pInput.add(pBtn, BorderLayout.SOUTH);
		JPanel pTable = new JPanel();
		
		pText.setLayout(new GridLayout(5, 2));
		JLabel l1 = new JLabel("����ȣ");
		JTextField cno = new JTextField(5);
		JLabel l2 = new JLabel("�̸�");
		JTextField cname = new JTextField(5);
		JLabel l3 = new JLabel("�ֹι�ȣ");
		JTextField ssn = new JTextField(15);
		JLabel l4 = new JLabel("�ּ�");
		JTextField addr = new JTextField(20);
		JLabel l5 = new JLabel("�ڵ���");
		JTextField tel = new JTextField(15);
		
		pText.add(l1);
		pText.add(cno);
		pText.add(l2);
		pText.add(cname);
		pText.add(l3);
		pText.add(ssn);
		pText.add(l4);
		pText.add(addr);
		pText.add(l5);
		pText.add(tel);
		
		pBtn.setLayout(new FlowLayout());
		JButton btnAdd = new JButton("�߰�");
		JButton btnSearch = new JButton("�˻�");
		pBtn.add(btnAdd);
		pBtn.add(btnSearch);
		
		
		
		
		
		
		DefaultTableModel dt = new DefaultTableModel();
		table = new JTable(dt);
		JScrollPane jsp = new JScrollPane(table);
		pTable.add(jsp);
		
		add(pInput, BorderLayout.NORTH);
		add(pTable, BorderLayout.CENTER);
		
		setSize(500, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private void getRow() {
		// TODO Auto-generated method stub
		
	}


	private void insertRow() {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CustomerList();
	}

}
