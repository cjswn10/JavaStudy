package exam4;

import java.util.Scanner;

public class StringTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("암호: ");
		String pw = scan.next();
		System.out.println("암호 확인: ");
		String pw2 = scan.next();
		
		if(pw.equals(pw2))
			System.out.println("암호 일치");
		else
			System.out.println("암호 불일치");
	}
}
