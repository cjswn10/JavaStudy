package exam2;

import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap str = new HashMap();
		str.put(0, "����");
		str.put(1, "����");
		str.put(2, "��");
		
		int user = 1;
		int com = 2;
		
		str.get(user);
		
		System.out.println("�����: " + str.get(user));
		System.out.println("��ǻ��: " + str.get(com));
		
	}

}
