package hw;

import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class CancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Calendar today = Calendar.getInstance();

		System.out.print("주민번호를 입력하세요: ");
		String birth = scan.next();

		// 생년 4자리 계산
		int birthYear = Integer.parseInt(birth.substring(0, 2));
		int thisYear = today.get(Calendar.YEAR);
		if (birthYear <= (thisYear - 2000)) {
			birthYear += 2000;
		} else
			birthYear += 1900;

		// 만 나이 계산
		int birthMonth = Integer.parseInt(birth.substring(2, 4));
		int birthDay = Integer.parseInt(birth.substring(4, 6));
		int age;
		if (today.get(Calendar.MONTH) + 1 > birthMonth) {
			age = thisYear - birthYear;
		} else if (today.get(Calendar.MONTH) + 1 == birthMonth) {
			if (today.get(Calendar.DATE) >= birthDay)
				age = thisYear - birthYear;
			else
				age = thisYear - birthYear - 1;
		} else
			age = thisYear - birthYear - 1;

		// 성별
		char gender = birth.charAt(6);
		if (gender == '2') {
			System.out.println("만 " + age + "세, 여성");
		} else
			System.out.println("만 " + age + "세, 남성");

		// 암검진 대상자 조건 : 만 40세이상 올해가 짝수해면 짝수년도사람
		Boolean target = false;
		if (age >= 40)
			if ((thisYear % 2) == (birthYear % 2))
				target = true;

		ArrayList<String> checkup = new ArrayList<String>();
		if (target) {
			checkup.add("위암");
			checkup.add("간암");

			if (age >= 50) {
				checkup.add("대장암");
			}

			if (gender == '2') {
				checkup.add("유방암");
				checkup.add("자궁암");
			}

			System.out.println("검진항목");
			System.out.println(checkup);

		} else {
			System.out.println("무료암검진 대상자가 아닙니다");
		}

	}
}