package hw;

import java.util.Scanner;

public class StringTest2 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ��� �Է�");
		String str = scan.nextLine();
		
		System.out.println("�� ���ڿ��� ���� : " + str.length());
		String[] word = str.split(" ");
		System.out.println("�ܾ��� �� : " + word.length);

		
		//�󵵼� ���ϱ�
		int[] count = new int[word.length];
		for(int i = 0; i < word.length; i++) {
			count[i] = 1;
			for(int j = i + 1; j < word.length; j++) {
				if(word[i].equals(word[j])) 
					count[i]++;
				
			}
			
		}

		System.out.println("�� �ܾ��� �� ��");
		//�Ųٷ� ������ ����� ó�� �ߺ��� �ܾ� ����
		for(int i = 0; i < word.length; i++) {
			
			for(int k = i - 1; k >= 0; k--) {
				if(word[i].equals(word[k]))
					count[i] = 0;
			}
			
			if(count[i] != 0)
				System.out.println(word[i] + " : " + count[i]);
		}
		
	}

}