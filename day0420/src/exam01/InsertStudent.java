package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertStudent();
		
		String sql = "insert into student values('����ȣ', 100, 100, 100)";
		
		try {
			// 1.jdbc ����̹��� �޸𸮷� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. database Server�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@203.236.209.115:1521:XE";
			String user = "scott";
			String pwd = "tiger";
			
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			//3. �����ͺ��̽� ��ɾ �����ϱ� ���� ��ü(statement)�� �����Ѵ�.
			//Connection ��ü�� ���ؼ� 
			
			Statement stmt = conn.createStatement();
			
			//4. stmt�� ���ؼ� �����ͺ��̽� ����� �����Ѵ�.
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			System.out.println("�߰���!");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
