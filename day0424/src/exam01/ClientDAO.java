package exam01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class ClientDAO {
	public ArrayList<ClientVO> selectAll() {
		ArrayList<ClientVO> list = new ArrayList<ClientVO>();
		String sql = "select * from client";

		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				ClientVO e = new ClientVO();
				e.setCno(rs.getInt(1));
				e.setCname(rs.getString(2));
				e.setCjumin(rs.getString(3));
				e.setCaddr(rs.getString(4));
				e.setCphone(rs.getString(5));

				list.add(e);
			}

			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

		return list;
	}

	public int insertClient(ClientVO e) {
		String sql = "insert into client values(?,?,?,?,?)";

		int re = -1;

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, e.getCno());
			pstmt.setString(2, e.getCname());
			pstmt.setString(3, e.getCjumin());
			pstmt.setString(4, e.getCaddr());
			pstmt.setString(5, e.getCphone());

			re = pstmt.executeUpdate();

			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

		return re;
	}

	public int UpdateClient(ClientVO e) {
		String sql = "UPDATE client SET cname=?, cjumin=?, caddr=?, cphone=? where cno=?";
		int re = -1;

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, e.getCname());
			pstmt.setString(2, e.getCjumin());
			pstmt.setString(3, e.getCaddr());
			pstmt.setString(4, e.getCphone());
			pstmt.setInt(5, e.getCno());
			re = pstmt.executeUpdate();
			
			ConnectionProvider.close(null, pstmt, conn);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}

		return re;
	}

	public int deleteClient(int cno) {
		String sql = "DELETE client WHERE cno=?";
		int re = -1;

		try {

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cno);
			re = pstmt.executeUpdate();

			// pstmt는 stmt와 상속관계
			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return re;
	}

}
