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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CustomerList extends JFrame {
	JFrame f = this;
	Vector<Vector<String>> rowData;
	Vector<String> colNames;
	DefaultTableModel dt;
	JTable table;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@203.236.209.115:1521:XE";
	String user = "scott";
	String pwd = "tiger";

	public CustomerList() {
		rowData = new Vector<Vector<String>>();
		colNames = new Vector<String>();

		colNames.add("고객번호");
		colNames.add("이름");
		colNames.add("주민번호");
		colNames.add("주소");
		colNames.add("핸드폰");

		JPanel pInput = new JPanel();
		pInput.setLayout(new BorderLayout());
		JPanel pText = new JPanel();
		JPanel pBtn = new JPanel();
		pInput.add(pText, BorderLayout.CENTER);
		pInput.add(pBtn, BorderLayout.SOUTH);
		JPanel pTable = new JPanel();

		pText.setLayout(new GridLayout(5, 2));
		JLabel l1 = new JLabel("고객번호");
		JTextField cno = new JTextField(5);
		JLabel l2 = new JLabel("이름");
		JTextField cname = new JTextField(5);
		JLabel l3 = new JLabel("주민번호");
		JTextField ssn = new JTextField(15);
		JLabel l4 = new JLabel("주소");
		JTextField addr = new JTextField(20);
		JLabel l5 = new JLabel("핸드폰");
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

		dt = new DefaultTableModel(rowData, colNames);
		table = new JTable(dt);
		JScrollPane jsp = new JScrollPane(table);
		pTable.add(jsp);

		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = table.getSelectedRow();
				Vector<String> v = rowData.get(row);
				cno.setText(v.get(0));
				cname.setText(v.get(1));
				ssn.setText(v.get(2));
				addr.setText(v.get(3));
				tel.setText(v.get(4));
			}
		});

		getTable();

		pBtn.setLayout(new FlowLayout());
		JButton btnAdd = new JButton("추가");
		JButton btnSearch = new JButton("검색");
		JButton btnUpdate = new JButton("수정");
		JButton btnDel = new JButton("삭제");

		pBtn.add(btnAdd);
		pBtn.add(btnSearch);
		pBtn.add(btnUpdate);
		pBtn.add(btnDel);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
//				int cno = cno.ge
				
				
				//나중에 파라미터 보내주기
				String sql = "insert into customer values(?,?,?,?,?)";
				try {

					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, pwd);
					PreparedStatement pstmt = conn.prepareStatement(sql);
//					pstmt.setInt(1, cno);
//					pstmt.setString(2, cname);
//					pstmt.setString(3, ssn);
//					pstmt.setString(4, addr);
//					pstmt.setString(5, tel);
//					
					
					pstmt.executeUpdate(sql);

					pstmt.close();
					conn.close();
					System.out.println("추가됨!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				getTable();
			}
		});

		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				rowData.clear();
				// 이름이 같은 row를 가져온다.
				String sql = "select * from customer where cname = '" + cname.getText() + "'";

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
						row.add(rs.getString(5));

						rowData.add(row);
					}
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				table.updateUI();
				// 이름이 비어있으면 전체테이블을 로드한다.
				if (cname.getText().equals(""))
					getTable();

			}
		});

		btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "update customer set cname='" + cname.getText() + "', ssn='" + ssn.getText() + "', addr='"
						+ addr.getText() + "', tel='" + tel.getText() + "' where cno=" + cno.getText();

				try {
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, pwd);
					Statement stmt = conn.createStatement();
					int re = stmt.executeUpdate(sql);

					if (re > 0)
						JOptionPane.showMessageDialog(f, "해당 고객정보를 수정하였습니다", "수정", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(f, "수정 실패", "수정", JOptionPane.ERROR_MESSAGE);

					stmt.close();
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());

				}
				getTable();
			}
		});

		btnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int row = table.getSelectedRow();
				int no = Integer.parseInt(rowData.get(row).get(0));
				
				String sql = "delete customer where cno=?";

				try {
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, pwd);
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, no);
					
					
					int re = pstmt.executeUpdate();

					if (re > 0)
						JOptionPane.showMessageDialog(f, "해당 고객을 삭제하였습니다", "삭제", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(f, "삭제 실패", "삭제", JOptionPane.ERROR_MESSAGE);

				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}
				getTable();
			}
		});

		add(pInput, BorderLayout.NORTH);
		add(pTable, BorderLayout.CENTER);

		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void getTable() {
		// TODO Auto-generated method stub
		// 처음 rowData를 비우고 테이블을 처음부터 다시 담아준다.
		rowData.clear();
		String sql = "select * from customer";

		try {
			// jdbc driver를 메모리에 로드한다
			Class.forName(driver);
			// database 서버에 연결한다
			Connection conn = DriverManager.getConnection(url, user, pwd);
			// 데이터베이스 명령어를 실행하기 위한 객체(Statement)를 연결한 서버를 통해 생성한다.
			Statement stmt = conn.createStatement();
			// 검색쿼리를 실행하고 ResultSet을 이용해 row를 받아온다.
			ResultSet rs = stmt.executeQuery(sql);

			// rs는 맨 처음에 헤드를 가리키고 있다.
			while (rs.next()) {
				Vector<String> row = new Vector<String>();
				// rs의 인덱스(column)는 1부터 시작함
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(4));
				row.add(rs.getString(5));

				rowData.add(row);
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
		new CustomerList();
	}

}
