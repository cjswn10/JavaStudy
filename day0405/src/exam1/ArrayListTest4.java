package exam1;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();

		list.add("��");
		list.add("�ǰ�");
		list.add("�ູ");
		list.add("���");
		list.add("�ڽ�");

		for(Object str: list)
			System.out.println(str);
	}

}
