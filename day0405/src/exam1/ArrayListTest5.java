package exam1;

import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();

		list.add("��");
		list.add("�ǰ�");
		list.add("�ູ");
		list.add("���");
		list.add("�ڽ�");

		System.out.println(list);
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

	}

}
