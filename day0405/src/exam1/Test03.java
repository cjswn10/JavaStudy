package exam1;

import java.util.GregorianCalendar;
import java.util.Scanner;

//��������� ������ �Է� �޾� �� �ذ� �������� �Ǻ��ϴ� ���α׷�
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year;
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("�⵵�� �Է� : ");
		year = scan.nextInt();

		if (gc.isLeapYear(year)) {
			System.out.println(year + "������ �����Դϴ�.");
		} else {
			System.out.println(year + "������ ������ �ƴմϴ�.");

		}

	}

}
