package exam4;

import java.util.Scanner;

public class StringTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String email;
		while (true) {
			System.out.println("이메일 주소? ");
			email = scan.next();
			
			
			if (email.indexOf("@") == -1)
				System.out.println("올바른 이메일 주소가 아닙니다.\n");
			else if(email.indexOf(".") == -1)
				System.out.println("올바른 이메일 주소가 아닙니다.\n");
			else
				break;
			
		}
		System.out.println("이메일 주소: " + email);
		
	}

}
