package exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar today = new GregorianCalendar();
		
		System.out.println(today.get(Calendar.YEAR) + "년");
		System.out.println((today.get(Calendar.MONTH) + 1) + "월");
		System.out.println(today.get(Calendar.DATE) + "일");
		System.out.println(today.get(Calendar.HOUR) + "시");
		System.out.println(today.get(Calendar.MINUTE) + "분");
		System.out.println(today.get(Calendar.SECOND) + "초");
	}

}
