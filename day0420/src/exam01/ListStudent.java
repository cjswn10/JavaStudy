package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListStudent {
//데이터베이스 row 삭제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListStudent();
		
		String sql = "select name, kor, eng, math from student";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.115:1521:XE", "scott", "tiger");
			
			Statement stmt = conn.createStatement();
			
			//sql명령어의 종류에 따라 사용하는 메소드가 다름
			//sql명령어가 자료를 추가, 수정, 삭제 ==>executeUpdate()
			// sql명령어가 검색일 때는 ==>executeQuery();
			//executeQuery 검색한 결과를 ResultSet으로 반환
			
			ResultSet rs = stmt.executeQuery(sql);
			//맨처음에는 헤더에 커서가 위치함
			//rs.next()메소드를 통해 커서를 다음 레코드로 옮긴다.
			//더이상 레코드가 없다면 false를 반환
			while(rs.next()) {
				//데이터베이스의 인덱스는 1부터 시작
				String name = rs.getString(1);
				int kor = rs.getInt(2);
				int eng = rs.getInt(3);
				int math = rs.getInt(4);
				System.out.println(name + " " + kor + " " +  eng + " " +  math);
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
