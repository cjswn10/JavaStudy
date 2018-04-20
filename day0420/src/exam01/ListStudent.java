package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListStudent {
//�����ͺ��̽� row ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListStudent();
		
		String sql = "select name, kor, eng, math from student";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.115:1521:XE", "scott", "tiger");
			
			Statement stmt = conn.createStatement();
			
			//sql��ɾ��� ������ ���� ����ϴ� �޼ҵ尡 �ٸ�
			//sql��ɾ �ڷḦ �߰�, ����, ���� ==>executeUpdate()
			// sql��ɾ �˻��� ���� ==>executeQuery();
			//executeQuery �˻��� ����� ResultSet���� ��ȯ
			
			ResultSet rs = stmt.executeQuery(sql);
			//��ó������ ����� Ŀ���� ��ġ��
			//rs.next()�޼ҵ带 ���� Ŀ���� ���� ���ڵ�� �ű��.
			//���̻� ���ڵ尡 ���ٸ� false�� ��ȯ
			while(rs.next()) {
				//�����ͺ��̽��� �ε����� 1���� ����
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
