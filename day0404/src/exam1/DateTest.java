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
		
		System.out.println("����: " + (year+1900));
		System.out.println("��: " + (month+1));
		System.out.println("��: " + day);
		System.out.println("��: " + hour);
		System.out.println("��: " + minute);
		System.out.println("��: " + second);
		
		
	}

}
