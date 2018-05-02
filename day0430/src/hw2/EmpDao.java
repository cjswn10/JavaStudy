package hw2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class EmpDao {
	public ArrayList<EmpVo> selectAll(String dname) {
		
		ArrayList<EmpVo> list = new ArrayList<EmpVo>();
		//검색할 사원의 목록을 담을 ArrayList 생성
		
		try {
			
			String sql = "select * from emp e, dept d where d.dno=e.dno and dname=? ";
			
			Connection conn = ConnectionProvider.getConnection();
			//ConnectionProvider를 통해 Connection을 생성한다.
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			//sql명령어를 실행하기 위한 Statement객체 생성
			//우리가 만든 sql명령어에는 ?를 포함하고 있기 때문에 Statement를 자식 클래스인 PreparedStatement객체를 생성함
			
			psmt.setString(1, dname);
			//?의 위치와 설정될 값을 차례로 써준다.
			
			ResultSet rs = psmt.executeQuery();
			//sql명령어를 실핸한다.
			//executeUpdate() : insert, update, delete 명령어
			//executeQuery() : select 명령어
			//executeQuery는 검색한 결과를 ResultSet으로 반환한다.
			//검색한 결과만큼 반복 수행하여 한사함 한사람의 정보를 EmpVO로 포장하여 list에 담아야 한다.
			
			
			//rs.next()의 메소드를 ResultSet의 커서를 다음행으로 옮겨주는 메소드
			//이미 다음레코드가 있다면 true, 없다면 false 반환
			while(rs.next()) {
				EmpVo v = new EmpVo();
				//현재 rs가 바라보고 있는 레코드를 자바객체로 담기 위한 VO를 생성
				
				v.setEno(rs.getInt(1));
				//현재 rs가 바라보고 있는 레코드의 사원번호를 자바객체 VO의 번호에 설정한다.
				v.setEname(rs.getString(2));
				v.setSal(rs.getInt(3));
				v.setComm(rs.getInt(4));
				v.setHiredate(rs.getDate(5));
				v.setJumin(rs.getString(6));
				v.setDno(rs.getInt(7));
				v.setPosition(rs.getString(8));
				v.setAddr(rs.getString(9));
				v.setMgr(rs.getInt(10));
				v.setEmail(rs.getString(11));
				
				list.add(v);
				//현재 rs가 바라보고 있는 레코드의 속성값이 담긴 자바객체(VO)를 list에 담는다
			}
			//언제 while을 탈출하는가?
			//모든 레코드를 다 담았을때
			
			ConnectionProvider.close(rs, psmt, conn);
			//사용했던 자원을 닫기 위하여
			//ConnectionProvider에게 맡긴다.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
		
	}
	
	//GUI에서 부서를 선택할 수 있도록 모든 부서목록을 검색하여 반환하는 메소드
	public Vector<String> getDepts(){
		Vector<String> list = new Vector<String>();
		try {
			String sql="select dname from dept";
			//모든 부서명을 검색하기 위한 sql명령어를 만든다.
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			//SQL명령어를 실행하기 위한 Statement 객체를 생성한다.
			
			ResultSet rs = stmt.executeQuery(sql);
			//sql명령어를 실행한다.
			//지금 rs에 담긴것은?->모든 부서명
			
			while(rs.next()) {
				list.add(rs.getString(1));
			}
			
			ConnectionProvider.close(rs, stmt, conn);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
