package exam4;

import java.util.Scanner;

//쌤 StringTest14
public class StringTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자한테 문자열을 입력 받아 거꾸로 출력해 봅니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		String str = scan.next();
		
		for(int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
		
		System.out.println("\n두번째 방법 StringBuffer");
		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());
		
		
	}
}
