package exam4;

import java.util.Scanner;

public class StringTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String email;
		while (true) {
			System.out.println("�̸��� �ּ�? ");
			email = scan.next();

			String[] at = email.split("@");
			
			if (at.length > 2 || at.length == 1) // @ �ΰ� �̻��̰ų� ���� ��
				System.out.println("1�ùٸ� �̸��� �ּҰ� �ƴմϴ�.\n");
			else if ((at[0].contains(".")) || (email.indexOf(".") == -1)) // .�� @���� �տ� �ְų� ���� ��
				System.out.println("2�ùٸ� �̸��� �ּҰ� �ƴմϴ�.\n");
			else if (at[0].length() < 5) // ���̵� 5�� �̸�
				System.out.println("3�ùٸ� �̸��� �ּҰ� �ƴմϴ�.\n");
			else if ( (at[1].indexOf(".") == 0)) // @�� .���̿� �ѱ��� �̻� �������� ���� ��
				System.out.println("4�ùٸ� �̸��� �ּҰ� �ƴմϴ�.\n");
			else if(email.lastIndexOf(".") >= (email.length() - 2))	//.�ڰ� 2���ں��� ���� ��
				System.out.println("5�ùٸ� �̸��� �ּҰ� �ƴմϴ�.\n");
			else
				break;

		}
		System.out.println("�̸��� �ּ�: " + email);

	}

}
