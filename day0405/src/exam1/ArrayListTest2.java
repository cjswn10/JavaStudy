package exam1;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add("ü��");
		list.add("����");
		list.add("���");
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("����");
	
		String removed = (String)list.remove(2);	//Object������ ��ȯ�ϱ� ������ Object�� �ڽ��� String���� ĳ���� ����
		System.out.println(removed);
		System.out.println(list);
	}

}
