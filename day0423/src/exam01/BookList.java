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

public class BookList extends JFrame {
	JFrame f;
	Vector<Vector<String>> rowData;
	Vector<String> colNames;
	JTable table;
	DefaultTableModel dt;

	JTextField bno;
	JTextField bname;
	JTextField bcom;
	JTextField bprice;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@203.236.209.115:1521:XE";
	String user = "scott";
	String pwd = "tiger";

	public BookList() {
		f = this;
		rowData = new Vector<Vector<String>>();
		colNames = new Vector<String>();

		colNames.add("도서번호");
		colNames.add("도서이름");
		colNames.add("출판사");
		colNames.add("가격");

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
				bno.setText(v.get(0));
				bname.setText(v.get(1));
				bcom.setText(v.get(2));
				bprice.setText(v.get(3));
			}
		});

		getTable();

		pText.setLayout(new GridLayout(4, 2));
		JLabel l1 = new JLabel("도서번호");
		bno = new JTextField(5);
		JLabel l2 = new JLabel("도서이름");
		bname = new JTextField(10);
		JLabel l3 = new JLabel("출판사");
		bcom = new JTextField(10);
		JLabel l4 = new JLabel("가격");
		bprice = new JTextField(10);

		pText.add(l1);
		pText.add(bno);
		pText.add(l2);
		pText.add(bname);
		pText.add(l3);
		pText.add(bcom);
		pText.add(l4);
		pText.add(bprice);

		pBtn.setLayout(new FlowLayout());
		JButton btnAdd = new JButton("추가");
		JButton btnSearch = new JButton("검색");
		JButton btnUpdate = new JButton("수정");
		JButton btnDel = new JButton("삭제");
		pBtn.add(btnAdd);
		pBtn.add(btnSearch);
		pBtn.add(btnUpdate);
		pBtn.add(btnDel);

		// 도서추가
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "insert into book values(" + bno.getText() + ", '" + bname.getText() + "', '"
						+ bcom.getText() + "', " + bprice.getText() + ")";

				try {

					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, pwd);
					Statement stmt = conn.createStatement();
					stmt.executeUpdate(sql);

					stmt.close();
					conn.close();
					System.out.println("추가됨!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				getTable();
			}
		});

		// 이름으로 검색
		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				rowData.clear();
				String sql = "select * from book where bname = '" + bname.getText() + "'";

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

						rowData.add(row);
					}
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				table.updateUI();
				if (bname.getText().equals(""))
					getTable();

			}
		});

		// 도서번호로 수정
		btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String sql = "update book set bname='" + bname.getText() + "', bcom='" + bcom.getText() + "', bprice="
						+ bprice.getText() + " where bno=" + bno.getText();

				try {
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, pwd);
					Statement stmt = conn.createStatement();

					int re = stmt.executeUpdate(sql);

					if (re > 0)
						JOptionPane.showMessageDialog(f, "해당 도서를 수정하였습니다", "수정", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(f, "수정 실패", "수정", JOptionPane.ERROR_MESSAGE);
					
					stmt.close();
					conn.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
				getTable();
			}
		});

		// 도서번호로 삭제
		btnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int row = table.getSelectedRow();
				int no = Integer.parseInt(rowData.get(row).get(0));

				String sql = "delete book where bno=" + no;

				try {
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, pwd);
					Statement stmt = conn.createStatement();
					// 성공적으로 명령을 수행한 레코드의 수를 반환함
					int re = stmt.executeUpdate(sql);

					if (re > 0)
						JOptionPane.showMessageDialog(f, "해당 도서를 삭제하였습니다", "삭제", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(f, "삭제 실패", "삭제", JOptionPane.ERROR_MESSAGE);

					stmt.close();
					conn.close();
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
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
		rowData.clear();
		String sql = "select * from book";

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
		new BookList();
	}
}