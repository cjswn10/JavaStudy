package exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {
	
	//모든 사원의 목록을 읽어오는 메소드
	//select * from emp
	public ArrayList<EmpVO> selectAll() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		String sql = "select * from emp";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				EmpVO e = new EmpVO();
				e.setEno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setDno(rs.getInt(3));
				e.setEsal(rs.getInt(4));
				e.setElevel(rs.getString(5));
				e.setEjumin(rs.getString(6));
				e.setEaddr(rs.getString(7));
				e.setEhiredate(rs.getString(8));
				
				list.add(e);
			}
			
			ConnectionProvider.close(rs, stmt, conn);
			
			
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		return list;
	}

	//성공한 레코드수를 반환함
	public int insertEmp(EmpVO e) {
		String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
		
		int re = -1;
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, e.getEno());
			pstmt.setString(2, e.getEname());
			pstmt.setInt(3, e.getDno());
			pstmt.setInt(4, e.getEsal());
			pstmt.setString(5, e.getElevel());
			pstmt.setString(6, e.getEjumin());
			pstmt.setString(7, e.getEaddr());
			pstmt.setString(8, e.getEhiredate());
			
			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
		return re;
		
	}
}
