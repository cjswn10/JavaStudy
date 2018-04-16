package exam4;

import java.util.Scanner;

public class StringTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String email;
		while (true) {
			System.out.println("이메일 주소? ");
			email = scan.next();

			String[] at = email.split("@");
			
			if (at.length > 2 || at.length == 1) // @ 두개 이상이거나 없을 때
				System.out.println("1올바른 이메일 주소가 아닙니다.\n");
			else if ((at[0].contains(".")) || (email.indexOf(".") == -1)) // .이 @보다 앞에 있거나 없을 때
				System.out.println("2올바른 이메일 주소가 아닙니다.\n");
			else if (at[0].length() < 5) // 아이디가 5자 미만
				System.out.println("3올바른 이메일 주소가 아닙니다.\n");
			else if ( (at[1].indexOf(".") == 0)) // @와 .사이에 한글자 이상 존재하지 않을 때
				System.out.println("4올바른 이메일 주소가 아닙니다.\n");
			else if(email.lastIndexOf(".") >= (email.length() - 2))	//.뒤가 2글자보다 적을 때
				System.out.println("5올바른 이메일 주소가 아닙니다.\n");
			else
				break;

		}
		System.out.println("이메일 주소: " + email);

	}

}
