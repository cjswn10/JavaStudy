package exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar today = new GregorianCalendar();
		
		System.out.println(today.get(Calendar.YEAR) + "��");
		System.out.println((today.get(Calendar.MONTH) + 1) + "��");
		System.out.println(today.get(Calendar.DATE) + "��");
		System.out.println(today.get(Calendar.HOUR) + "��");
		System.out.println(today.get(Calendar.MINUTE) + "��");
		System.out.println(today.get(Calendar.SECOND) + "��");
	}

}
