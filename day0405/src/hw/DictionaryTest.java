package hw;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap dic = new HashMap();
		dic.put("apple", "���");
		dic.put("melon", "���");
		dic.put("banana", "�ٳ���");

		int menu = 0;
		while (menu != 4) {
			// �޴��Է�
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1.�߰� 2.���� 3.�˻� 4.����");
			menu = scan.nextInt();

			// 1.�߰�
			if (menu == 1) {
				System.out.print("�߰��� ���ܾ� : ");
				String eng = scan.next();
				
				if(dic.containsKey(eng)) {
					System.out.println("�̹� �ִ� �ܾ��Դϴ�.");
					continue;
				}
				
				System.out.print("�� : ");
				String kor = scan.next();

				dic.put(eng, kor);
			}

			// 2.����
			else if (menu == 2) {
				System.out.print("������ ���ܾ�: ");
				String eng = scan.next();
				if(!dic.containsKey(eng)) {
					System.out.println("������ ���� �ܾ��Դϴ�.");
					continue;
				}
				dic.remove(eng);
			}

			// 3.�˻�
			else if (menu == 3) {
				String word = "word";
				while (true) {
					System.out.print("�ܾ �Է�: ");
					word = scan.next();
					if (dic.containsKey(word))
						break;
				}
				System.out.println(word + " : " + dic.get(word));
			}
			
		}//��üwhile��
		
	}
}
