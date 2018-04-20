package exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//JTable 모든 부서의 목록을 출력하는 프로그램 작성
//select * from dept
public class ListDept extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	public ListDept() {
		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("부서번호");
		colNames.add("부서명");
		colNames.add("전화번호");
		colNames.add("부서위치");
		colNames.add("인원수");

		
		getDept();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		
		// 데이터베이스에 접속하여 모든 부서의 목록을 읽어 와서
		// 벡터 rowData에 담는 메소드를 호출
		
		
		
		

		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 모든 부서의 목록을 검색하여 벡터인 rowData에 담는다.
	private void getDept() {
		// TODO Auto-generated method stub
		String sql = "select * from dept";

		try {
			// 1. jdbc 드라이버를 메모리로 로드한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. database Server에 연결한다.
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.115:1521:XE", "scott", "tiger");
			// 3. sql명령어를 수행하기 위한 Statement 객체를 생성한다.
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			//rs는 맨처음에 검색한 레코드들의 헤더를 바라보고 있음
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
