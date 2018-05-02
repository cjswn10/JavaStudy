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
		//�˻��� ����� ����� ���� ArrayList ����
		
		try {
			
			String sql = "select * from emp e, dept d where d.dno=e.dno and dname=? ";
			
			Connection conn = ConnectionProvider.getConnection();
			//ConnectionProvider�� ���� Connection�� �����Ѵ�.
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			//sql��ɾ �����ϱ� ���� Statement��ü ����
			//�츮�� ���� sql��ɾ�� ?�� �����ϰ� �ֱ� ������ Statement�� �ڽ� Ŭ������ PreparedStatement��ü�� ������
			
			psmt.setString(1, dname);
			//?�� ��ġ�� ������ ���� ���ʷ� ���ش�.
			
			ResultSet rs = psmt.executeQuery();
			//sql��ɾ �����Ѵ�.
			//executeUpdate() : insert, update, delete ��ɾ�
			//executeQuery() : select ��ɾ�
			//executeQuery�� �˻��� ����� ResultSet���� ��ȯ�Ѵ�.
			//�˻��� �����ŭ �ݺ� �����Ͽ� �ѻ��� �ѻ���� ������ EmpVO�� �����Ͽ� list�� ��ƾ� �Ѵ�.
			
			
			//rs.next()�� �޼ҵ带 ResultSet�� Ŀ���� ���������� �Ű��ִ� �޼ҵ�
			//�̹� �������ڵ尡 �ִٸ� true, ���ٸ� false ��ȯ
			while(rs.next()) {
				EmpVo v = new EmpVo();
				//���� rs�� �ٶ󺸰� �ִ� ���ڵ带 �ڹٰ�ü�� ��� ���� VO�� ����
				
				v.setEno(rs.getInt(1));
				//���� rs�� �ٶ󺸰� �ִ� ���ڵ��� �����ȣ�� �ڹٰ�ü VO�� ��ȣ�� �����Ѵ�.
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
				//���� rs�� �ٶ󺸰� �ִ� ���ڵ��� �Ӽ����� ��� �ڹٰ�ü(VO)�� list�� ��´�
			}
			//���� while�� Ż���ϴ°�?
			//��� ���ڵ带 �� �������
			
			ConnectionProvider.close(rs, psmt, conn);
			//����ߴ� �ڿ��� �ݱ� ���Ͽ�
			//ConnectionProvider���� �ñ��.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
		
	}
	
	//GUI���� �μ��� ������ �� �ֵ��� ��� �μ������ �˻��Ͽ� ��ȯ�ϴ� �޼ҵ�
	public Vector<String> getDepts(){
		Vector<String> list = new Vector<String>();
		try {
			String sql="select dname from dept";
			//��� �μ����� �˻��ϱ� ���� sql��ɾ �����.
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			//SQL��ɾ �����ϱ� ���� Statement ��ü�� �����Ѵ�.
			
			ResultSet rs = stmt.executeQuery(sql);
			//sql��ɾ �����Ѵ�.
			//���� rs�� ������?->��� �μ���
			
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
