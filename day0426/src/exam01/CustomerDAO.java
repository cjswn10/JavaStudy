package exam01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//Database Access Object
public class CustomerDAO {
	public CustomerVO getCustomer(String name) {
		CustomerVO cv = null;
		String sql = "SELECT * FROM customer WHERE name=?";
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				cv = new CustomerVO();
				cv.setCustid(rs.getInt(1));
				cv.setName(rs.getString(2));
				cv.setAddress(rs.getString(3));
				cv.setPhone(rs.getString(4));
			}
			ConnectionProvider.close(rs, pstmt, conn);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return cv;
	}
	
	public ArrayList<CustomerVO> getAddrList(String addr) {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		String sql = "SELECT * FROM customer WHERE address LIKE '%'||?||'%'";
		
		try {
			
			
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CustomerVO cv = new CustomerVO();
				cv.setCustid(rs.getInt(1));
				cv.setName(rs.getString(2));
				cv.setAddress(rs.getString(3));
				cv.setPhone(rs.getString(4));
				
				list.add(cv);
			}
			
			ConnectionProvider.close(rs, pstmt, conn);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	
	
	
}
