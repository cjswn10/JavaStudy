package exam1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�츮���� �����ϴ� �����̸����� �����ϰ��� �Ѵ�.
		HashSet names = new HashSet();
		
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
