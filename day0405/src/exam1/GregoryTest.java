package exam1;

import java.util.Calendar;

//GregorianCalendar is a Calendar
//GregorianCalendar�� Calendar�� �ڽ�Ŭ�����̱� ������ Calendar�� �޼ҵ带 ��� ����� �� �ִ�.
//�ٸ�����
//Calendar�� �߻�Ŭ�����̱� ������ new�����ڿ� ���� ���� ��ü ������ �� ���� 
//getInstance()�޼ҵ带 ���� Calendar ��ü�� ��� �� �� �ִ�.
//GregorianCalendar�� new �����ڸ� ���� ���� ��ü�� ������ �� �ִ�.
//���⿡ ���� ������ ó���ϴ� ��� isLeapYear()�� �ִ�.

public class GregoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
//		�ý��� ������ ���� ��¥�� �ð��� ������ Calendar type�� ��ȯ�Ѵ�.
//		Calendar �� new �����ڿ� ���� ���� ��ü����x
//		CalendarŬ������ static �޼ҵ���
//		getInstance()�޼ҵ带 ���� ��ü�� ����
		
		int year = today.get(Calendar.YEAR);
		System.out.println(year);
	}

}
