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

public class BookList extends JFrame{
	Vector<Vector<String>> rowData;
	Vector<String> colNames;
	JTable table;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@203.236.209.115:1521:XE";
	String user = "scott";
	String pwd = "tiger";
	
	public BookList() {
		/*
		p1.setLayout(new GridLayout(4, 2));
		JLabel l1 = new JLabel("도서번호");
		JTextField bno = new JTextField(5);
		JLabel l2 = new JLabel("도서이름");
		JTextField bname = new JTextField(10);
		JLabel l3 = new JLabel("출판사");
		JTextField bcom = new JTextField(10);
		JLabel l4 = new JLabel("가격");
		JTextField price = new JTextField(10);
		 */
		rowData = new Vector<Vector<String>>();
		colNames = new Vector<String>();
		
		getRow();
		
		JPanel pInput = new JPanel();
		pInput.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		pInput.add(p1, BorderLayout.CENTER);
		pInput.add(p2, BorderLayout.SOUTH);
		JPanel pTable = new JPanel();
		
		p1.setLayout(new GridLayout(4, 2));
		JLabel l1 = new JLabel("도서번호");
		JTextField bno = new JTextField(5);
		JLabel l2 = new JLabel("도서이름");
		JTextField bname = new JTextField(10);
		JLabel l3 = new JLabel("출판사");
		JTextField bcom = new JTextField(10);
		JLabel l4 = new JLabel("가격");
		JTextField price = new JTextField(10);

		p1.add(l1);
		p1.add(bno);
		p1.add(l2);
		p1.add(bname);
		p1.add(l3);
		p1.add(bcom);
		p1.add(l4);
		p1.add(price);
		
		
		p2.setLayout(new FlowLayout());
		JButton btnAdd = new JButton("추가");
		JButton btnSearch = new JButton("검색");
		p2.add(btnAdd);
		p2.add(btnSearch);
		
		
		
		
		DefaultTableModel dt = new DefaultTableModel();
		table = new JTable(dt);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp);
		
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
		new BookList();
	}

}
