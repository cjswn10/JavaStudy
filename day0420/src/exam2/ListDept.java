package exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//JTable ��� �μ��� ����� ����ϴ� ���α׷� �ۼ�
//select * from dept
public class ListDept extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	public ListDept() {
		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("�μ���ȣ");
		colNames.add("�μ���");
		colNames.add("��ȭ��ȣ");
		colNames.add("�μ���ġ");
		colNames.add("�ο���");

		
		getDept();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		
		// �����ͺ��̽��� �����Ͽ� ��� �μ��� ����� �о� �ͼ�
		// ���� rowData�� ��� �޼ҵ带 ȣ��
		
		
		
		

		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// ��� �μ��� ����� �˻��Ͽ� ������ rowData�� ��´�.
	private void getDept() {
		// TODO Auto-generated method stub
		String sql = "select * from dept";

		try {
			// 1. jdbc ����̹��� �޸𸮷� �ε��Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. database Server�� �����Ѵ�.
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.115:1521:XE", "scott", "tiger");
			// 3. sql��ɾ �����ϱ� ���� Statement ��ü�� �����Ѵ�.
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			//rs�� ��ó���� �˻��� ���ڵ���� ����� �ٶ󺸰� ����
			while(rs.next()) {
				Vector<String> v = new Vector<String>();
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				
				rowData.add(v);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListDept();
	}

}
