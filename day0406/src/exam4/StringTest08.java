package exam4;

import java.util.Scanner;

public class StringTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����Է��Ͻÿ�");
		String str = scan.nextLine();
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A')
				count++;
		}
		
		System.out.println("�빮�� A�� ��: " + count);
	}
}
