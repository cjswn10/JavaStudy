package exam4;

import java.util.Scanner;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String id;
		String pw ;
		while (true) {
			System.out.println("\n���̵� �Է��ϼ���(2��~12��)");
			id = scan.next();
			if(id.length() >= 2 && id.length() <= 12)
				break;
			else if(id.length() < 2) {
				System.out.println("���!2�� �̻� �Է��ϼ���");
				continue;
			}
			else {
				System.out.println("���!12�� ���� �Է��ϼ���");
				continue;
			}
		}
		
		while (true) {
			System.out.println("\n��й�ȣ�� �Է��ϼ���(6��~12��)");
			pw = scan.next();
			if(pw.length() >= 6 && pw.length() <= 12)
				break;
			else if(pw.length() < 6) {
				System.out.println("���!6�� �̻� �Է��ϼ���");
				continue;
			}
			else {
				System.out.println("���!12�� ���� �Է��ϼ���");
				continue;
			}
		}
		System.out.println("\n���̵�: " + id);
		System.out.println("��й�ȣ: " + pw);
		
	}
}
