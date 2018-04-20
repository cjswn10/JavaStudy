package exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

//�Է¹��� ������ ���̺� �߰�
public class StudentTest extends JFrame {
	DefaultTableModel dt;
	JTable table;
	Vector<Vector<String>> list;
	Vector<String> listNames;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@203.236.209.115:1521:XE";
	String user = "scott";
	String pwd = "tiger";

	public StudentTest() {
		
		JPanel p_add = new JPanel();
		JPanel p_table = new JPanel();
		
		list = new Vector<Vector<String>>();
		listNames = new Vector<String>();
		listNames.add("�̸�");
		listNames.add("����");
		listNames.add("����");
		listNames.add("����");
		
		dt = new DefaultTableModel(list, listNames);
		table = new JTable(dt);
		JScrollPane jsp = new JScrollPane(table);
		p_table.add(jsp);
	
		select();
		
		p_add.setLayout(new GridLayout(5, 1));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JLabel l1 = new JLabel("�̸� : ");
		JLabel l2 = new JLabel("���� : ");
		JLabel l3 = new JLabel("���� : ");
		JLabel l4 = new JLabel("���� : ");
		JTextField name = new JTextField(10);
		JTextField kor = new JTextField(10);
		JTextField eng = new JTextField(10);
		JTextField math = new JTextField(10);
		JButton btn = new JButton("�߰�");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "insert into student values('" + name.getText() + "', " + kor.getText() + ", "
						+ eng.getText() + ", " + math.getText() + ")";

				try {
					// 1.jdbc ����̹��� �޸𸮷� �ε��Ѵ�.
					Class.forName(driver);

					// 2. database Server�� �����Ѵ�.
					Connection conn = DriverManager.getConnection(url, user, pwd);

					// 3. �����ͺ��̽� ��ɾ �����ϱ� ���� ��ü(statement)�� �����Ѵ�.
					// Connection ��ü�� ���ؼ�

					Statement stmt = conn.createStatement();

					// 4. stmt�� ���ؼ� �����ͺ��̽� ����� �����Ѵ�.
					stmt.executeUpdate(sql);

					stmt.close();
					conn.close();
					System.out.println("�߰���!");

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				select();
				
			}
		});
		
		p1.add(l1);
		p1.add(name);

		p2.add(l2);
		p2.add(kor);

		p3.add(l3);
		p3.add(eng);

		p4.add(l4);
		p4.add(math);

		p_add.add(p1);
		p_add.add(p2);
		p_add.add(p3);
		p_add.add(p4);
		p_add.add(btn);

		add(p_add, BorderLayout.NORTH);
		add(p_table, BorderLayout.CENTER);
		
		setSize(500, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void select() {
		list.clear();
		String sql = "select name, kor, eng, math from student";
		
		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Vector<String> row = new Vector<String>();
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(4));
				list.add(row);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		table.updateUI();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentTest();
	}

}
