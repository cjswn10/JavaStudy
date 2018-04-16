package exam4;

import java.util.Scanner;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String id;
		String pw ;
		while (true) {
			System.out.println("\n아이디를 입력하세요(2자~12자)");
			id = scan.next();
			if(id.length() >= 2 && id.length() <= 12)
				break;
			else if(id.length() < 2) {
				System.out.println("경고!2자 이상 입력하세요");
				continue;
			}
			else {
				System.out.println("경고!12자 이하 입력하세요");
				continue;
			}
		}
		
		while (true) {
			System.out.println("\n비밀번호를 입력하세요(6자~12자)");
			pw = scan.next();
			if(pw.length() >= 6 && pw.length() <= 12)
				break;
			else if(pw.length() < 6) {
				System.out.println("경고!6자 이상 입력하세요");
				continue;
			}
			else {
				System.out.println("경고!12자 이하 입력하세요");
				continue;
			}
		}
		System.out.println("\n아이디: " + id);
		System.out.println("비밀번호: " + pw);
		
	}
}
