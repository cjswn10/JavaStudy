package exam02;

import java.util.ArrayList;
import java.util.LinkedList;

/*ArrayList�� LinkedArrayList�� ����
 * 
 * 
 */
public class ArrayListAndLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		list.add("����ȣ");
		list.add("������");
		list.add("�۸���");
		list.add("����ȣ");
		list.add("������");
		list.add("�絿��");

		System.out.println(list);
		list.add(2, "�ѻ���");
		System.out.println(list);
		list.add(3, "������");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		
		
		
/*
		ArrayList<String> list = new ArrayList<String>();
		list.add("����ȣ");
		list.add("������");
		list.add("�۸���");
		list.add("����ȣ");
		list.add("������");
		list.add("�絿��");

		System.out.println(list);
		list.add(2, "�ѻ���");
		System.out.println(list);
		list.add(3, "������");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
*/		
		
	}

}
