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

//입력받은 내용을 테이블에 추가
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
		listNames.add("이름");
		listNames.add("국어");
		listNames.add("영어");
		listNames.add("수학");
		
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
		JLabel l1 = new JLabel("이름 : ");
		JLabel l2 = new JLabel("국어 : ");
		JLabel l3 = new JLabel("영어 : ");
		JLabel l4 = new JLabel("수학 : ");
		JTextField name = new JTextField(10);
		JTextField kor = new JTextField(10);
		JTextField eng = new JTextField(10);
		JTextField math = new JTextField(10);
		JButton btn = new JButton("추가");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "insert into student values('" + name.getText() + "', " + kor.getText() + ", "
						+ eng.getText() + ", " + math.getText() + ")";

				try {
					// 1.jdbc 드라이버를 메모리로 로드한다.
					Class.forName(driver);

					// 2. database Server에 연결한다.
					Connection conn = DriverManager.getConnection(url, user, pwd);

					// 3. 데이터베이스 명령어를 실행하기 위한 객체(statement)를 생성한다.
					// Connection 객체를 통해서

					Statement stmt = conn.createStatement();

					// 4. stmt를 통해서 데이터베이스 명령을 수행한다.
					stmt.executeUpdate(sql);

					stmt.close();
					conn.close();
					System.out.println("추가됨!");

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
