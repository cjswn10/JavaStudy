package exam1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�츮���� �����ϴ� �����̸����� �����ϰ��� �Ѵ�.
		//�������
		LinkedHashSet names = new LinkedHashSet();
		
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
