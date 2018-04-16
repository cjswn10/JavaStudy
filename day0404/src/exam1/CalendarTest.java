package exam1;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calendar today = new Calendar();
		// Calendar는 추상클래스이기 때문에
		// 사용자가 직접 객체를 생성할 수 없다.

		Calendar today = Calendar.getInstance();

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);

		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(date + "일");
		System.out.println(today.get(Calendar.HOUR) + "시");
		System.out.println(today.get(Calendar.MINUTE) + "분");
		System.out.println(today.get(Calendar.SECOND) + "초");


	}
}
