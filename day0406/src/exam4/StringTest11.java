package exam4;

import java.util.Scanner;

public class StringTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String email;
		while (true) {
			System.out.println("�̸��� �ּ�? ");
			email = scan.next();
			
			
			if (email.indexOf("@") == -1)
				System.out.println("�ùٸ� �̸��� �ּҰ� �ƴմϴ�.\n");
			else if(email.indexOf(".") == -1)
				System.out.println("�ùٸ� �̸��� �ּҰ� �ƴմϴ�.\n");
			else
				break;
			
		}
		System.out.println("�̸��� �ּ�: " + email);
		
	}

}
