package exam1;

import java.util.Random;
import java.util.Scanner;

/*��ǻ�Ϳ� ����ڰ� ����, ����, �� �����ϴ� ���α׷�
 */

public class GameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int com = r.nextInt(3);

		System.out.print("����(0), ����(1), ��(2) �߿� �����ϼ���: ");
		int user = scan.nextInt();

		String[] rsp = { "����", "����", "��" };

		System.out.println("����� : " + rsp[user]);
		System.out.println("��ǻ�� : " + rsp[com]);

		if(user == com)
			System.out.println("�����ϴ�");
		else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1))
			System.out.println("�̰���ϴ�!!");
		else
			System.out.println("�����ϴ�");
	}

}
