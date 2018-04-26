package hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * 부서명을 입력받아 해당 부서에 근무하는 사원의 모든 정보를 출력하는 프로그램 작성
 * 단, 급여가 높은순으로 출력합니다. 급여가 동일할 때에는 이름순으로 출력합니다.
 */
public class EmpDAO {
	public ArrayList<EmpVO> getDeptList(String dname) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		String sql = "SELECT eno, ename, sal, comm, hiredate, jumin, e.dno, position, addr FROM emp e, dept d WHERE dname=? AND d.dno=e.dno ORDER BY sal DESC, ename";

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
				
				list.add(e);
			}
			
			ConnectionProvider.close(rs, pstmt, conn);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}
}
