package exam1;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDate();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		
		System.out.println("연도: " + (year+1900));
		System.out.println("월: " + (month+1));
		System.out.println("일: " + day);
		System.out.println("시: " + hour);
		System.out.println("분: " + minute);
		System.out.println("초: " + second);
		
		
	}

}
