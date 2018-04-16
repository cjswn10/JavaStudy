package exam1;

import java.util.Calendar;

//GregorianCalendar is a Calendar
//GregorianCalendar는 Calendar의 자식클래스이기 때무에 Calendar의 메소드를 모두 사용할 수 있다.
//다른점은
//Calendar는 추상클래스이기 때무에 new연산자에 의해 직접 객체 생성할 수 없고 
//getInstance()메소드를 통해 Calendar 객체를 얻어 올 수 있다.
//GregorianCalendar는 new 연산자를 통해 직접 객체를 생성할 수 있다.
//윤년에 대한 정보를 처리하는 기능 isLeapYear()가 있다.

public class GregoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
//		시스템 설정된 오늘 날짜와 시간의 정보를 Calendar type을 반환한다.
//		Calendar 는 new 연산자에 의해 직접 객체생성x
//		Calendar클래스의 static 메소드인
//		getInstance()메소드를 통해 객체를 얻어옴
		
		int year = today.get(Calendar.YEAR);
		System.out.println(year);
	}

}
