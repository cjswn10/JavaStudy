package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
//미완성......
public class EmpList extends JFrame {
	JFrame f;
	Vector<Vector<String>> rowData;
	Vector<String> colNames;
	JTable table;
	DefaultTableModel dt;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@203.236.209.115:1521:XE";
	String user = "scott";
	String pwd = "tiger";
	
	public EmpList() {
		f = this;
		rowData = new Vector<Vector<String>>();
		colNames = new Vector<String>();
		
		colNames.add("사원번호");
		colNames.add("사원이름");
		colNames.add("부서번호");
		colNames.add("급여");
		colNames.add("직책");
		colNames.add("주민번호");
		colNames.add("급여");
		
		JPanel pInput = new JPanel();
		pInput.setLayout(new BorderLayout());
		JPanel pText = new JPanel();
		JPanel pBtn = new JPanel();
		pInput.add(pText, BorderLayout.CENTER);
		pInput.add(pBtn, BorderLayout.SOUTH);
		JPanel pTable = new JPanel();
		
		dt = new DefaultTableModel(rowData, colNames);
		table = new JTable(dt);
		JScrollPane jsp = new JScrollPane(table);
		pTable.add(jsp);
		
		getTable();
		
		pText.setLayout(new GridLayout(8, 2));
		JLabel l1 = new JLabel("사원번호");
		JTextField t_eno = new JTextField(10);
		JLabel l2 = new JLabel("사원이름");
		JTextField t_ename = new JTextField(10);
		JLabel l3 = new JLabel("부서번호");
		JTextField t_dno = new JTextField(10);
		JLabel l4 = new JLabel("급여");
		JTextField t_esal = new JTextField(10);
		JLabel l5 = new JLabel("직책");
		JTextField t_elevel = new JTextField(10);
		JLabel l6 = new JLabel("주민번호");
		JTextField t_ejumin = new JTextField(15);
		JLabel l7 = new JLabel("주소");
		JTextField t_eaddr = new JTextField(15);
		JLabel l8 = new JLabel("입사일");
		JTextField t_ehiredate = new JTextField(15);

		pText.add(l1);
		pText.add(t_eno);
		pText.add(l2);
		pText.add(t_ename);
		pText.add(l3);
		pText.add(t_dno);
		pText.add(l4);
		pText.add(t_esal);
		pText.add(l5);
		pText.add(t_elevel);
		pText.add(l6);
		pText.add(t_ejumin);
		pText.add(l7);
		pText.add(t_eaddr);
		pText.add(l8);
		pText.add(t_ehiredate);
		

		pBtn.setLayout(new FlowLayout());
		JButton btnAdd = new JButton("추가");
		pBtn.add(btnAdd);
		

		
		pBtn.add(btnAdd);
		
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int eno = Integer.parseInt(t_eno.getText());
				int dno = Integer.parseInt(t_dno.getText());
				int esal = Integer.parseInt(t_esal.getText());
				
				String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
				try {
					
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, pwd);
					PreparedStatement pstmt = conn.prepareStatement(sql);
					
					pstmt.setInt(1, eno);
					pstmt.setString(2, t_ename.getText());
					pstmt.setInt(3, dno);
					pstmt.setInt(4, esal);
					pstmt.setString(5, t_elevel.getText());
					pstmt.setString(6, t_ejumin.getText());
					pstmt.setString(7, t_eaddr.getText());
					pstmt.setString(8, t_ehiredate.getText());
					
					pstmt.executeUpdate();
					
					
					pstmt.close();
				conn.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				
				
				
				
			}
		});
		
	}
	
	private void getTable() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpList();		
	}

}
