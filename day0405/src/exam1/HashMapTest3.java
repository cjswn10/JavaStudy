package exam1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ����
		TreeMap map = new TreeMap();
		map.put(0, "����");
		map.put(1, "����");
		map.put(2, "��");
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int com = r.nextInt(3);

		System.out.print("����(0), ����(1), ��(2) �߿� �����ϼ���: ");
		int user = scan.nextInt();

		System.out.println("����� : " + map.get(user));
		System.out.println("��ǻ�� : " + map.get(com));

		if(user == com)
			System.out.println("�����ϴ�");
		else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1))
			System.out.println("�̰���ϴ�!!");
		else
			System.out.println("�����ϴ�");
		
	}

}
