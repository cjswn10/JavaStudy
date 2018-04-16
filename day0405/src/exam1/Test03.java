package exam1;

import java.util.GregorianCalendar;
import java.util.Scanner;

//사용자한테 연도를 입력 받아 그 해가 윤년인지 판별하는 프로그램
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year;
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("년도를 입력 : ");
		year = scan.nextInt();

		if (gc.isLeapYear(year)) {
			System.out.println(year + "연도는 윤년입니다.");
		} else {
			System.out.println(year + "연도는 윤년이 아닙니다.");

		}

	}

}
