package hw;

import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class CancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Calendar today = Calendar.getInstance();

		System.out.print("�ֹι�ȣ�� �Է��ϼ���: ");
		String birth = scan.next();

		// ���� 4�ڸ� ���
		int birthYear = Integer.parseInt(birth.substring(0, 2));
		int thisYear = today.get(Calendar.YEAR);
		if (birthYear <= (thisYear - 2000)) {
			birthYear += 2000;
		} else
			birthYear += 1900;

		// �� ���� ���
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

		// ����
		char gender = birth.charAt(6);
		if (gender == '2') {
			System.out.println("�� " + age + "��, ����");
		} else
			System.out.println("�� " + age + "��, ����");

		// �ϰ��� ����� ���� : �� 40���̻� ���ذ� ¦���ظ� ¦���⵵���
		Boolean target = false;
		if (age >= 40)
			if ((thisYear % 2) == (birthYear % 2))
				target = true;

		ArrayList<String> checkup = new ArrayList<String>();
		if (target) {
			checkup.add("����");
			checkup.add("����");

			if (age >= 50) {
				checkup.add("�����");
			}

			if (gender == '2') {
				checkup.add("�����");
				checkup.add("�ڱþ�");
			}

			System.out.println("�����׸�");
			System.out.println(checkup);

		} else {
			System.out.println("����ϰ��� ����ڰ� �ƴմϴ�");
		}

	}
}