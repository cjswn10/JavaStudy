package exam01;

import java.util.Scanner;

/*
 * ��������� �ֹε�Ϲ�ȣ �Է¹޾�
 * �ùٸ��� Ȯ��
 */
public class StringTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		String jumin = scan.next();
		
		int[] id = new int[jumin.length()];
		for (int i = 0; i < jumin.length(); i++)
			id[i] = Integer.parseInt(jumin.substring(i, i+1));

		int[] num = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int verification = 0;
		for (int i = 0; i < num.length; i++)
			verification += id[i] * num[i];
		verification %= 11;

		if (id[12] == (11 - verification))
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ �Դϴ�.");
		else
			System.out.println("�ùٸ��� ���� �ֹε�Ϲ�ȣ �Դϴ�.");

	}

}
