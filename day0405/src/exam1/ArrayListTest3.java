package exam1;

import java.util.ArrayList;

public class ArrayListTest3 {

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

		System.out.println(list);
		
//		String obj = (String)list.remove(100);	����
		
		
		boolean f = list.remove("����");
		System.out.println(list);
		System.out.println(f);
	
	}

}
