package hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/*
 * 부서명을 선택하면 해당 부서에 근무하는 모든 직원의 정보를 출력하는 GUI 프로그램을 작성하시오
 */
public class EmpDAO {
	public ArrayList<EmpVO> getDeptList(String dname) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		String sql = "SELECT * FROM emp e, dept d WHERE dname=? AND d.dno=e.dno";

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				EmpVO e = new EmpVO();
				e.setEno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setSal(rs.getInt(3));
				e.setComm(rs.getInt(4));
				e.setHiredate(rs.getString(5));
				e.setJumin(rs.getString(6));
				e.setDno(rs.getInt(7));
				e.setPosition(rs.getString(8));
				e.setAddr(rs.getString(9));
				e.setMgr(rs.getInt(10));
				e.setEmail(rs.getString(11));
				
				list.add(e);
			}
			
			ConnectionProvider.close(rs, pstmt, conn);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}
}
