package exam4;

import java.util.Scanner;

public class StringTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("��ȣ: ");
		String pw = scan.next();
		System.out.println("��ȣ Ȯ��: ");
		String pw2 = scan.next();
		
		if(pw.equals(pw2))
			System.out.println("��ȣ ��ġ");
		else
			System.out.println("��ȣ ����ġ");
	}
}
