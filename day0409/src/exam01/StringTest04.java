package exam01;

import java.util.Scanner;

/*
 * 사용자한테 주민등록번호 입력받아
 * 올바른지 확인
 */
public class StringTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
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
			System.out.println("올바른 주민등록번호 입니다.");
		else
			System.out.println("올바르지 않은 주민등록번호 입니다.");

	}

}
