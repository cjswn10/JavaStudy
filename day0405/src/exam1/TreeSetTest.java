package exam1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڵ����� ��������
		TreeSet names = new TreeSet();
		
		names.add("���");
		names.add("����");
		names.add("�ٳ���");
		names.add("���ξ���");
		boolean a = names.add("������");
		boolean b = names.add("����");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(names);
	}

}
