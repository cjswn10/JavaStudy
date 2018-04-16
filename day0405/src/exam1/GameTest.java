package exam1;

import java.util.Random;
import java.util.Scanner;

/*컴퓨터와 사용자가 가위, 바위, 보 게임하는 프로그램
 */

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int com = r.nextInt(3);

		System.out.print("가위(0), 바위(1), 보(2) 중에 선택하세요: ");
		int user = scan.nextInt();

		String[] rsp = { "가위", "바위", "보" };

		System.out.println("사용자 : " + rsp[user]);
		System.out.println("컴퓨터 : " + rsp[com]);

		switch (com) {
		case 0:
			if (user == 0)
				System.out.println("비겼습니다");
			else if (user == 1)
				System.out.println("이겼습니다!!");
			else if (user == 2)
				System.out.println("졌습니다");
			break;
		case 1:
			if (user == 0)
				System.out.println("졌습니다");
			else if (user == 1)
				System.out.println("비겼습니다");
			else if (user == 2)
				System.out.println("이겼습니다!!");
			break;
		case 2:
			if (user == 0)
				System.out.println("이겼습니다!!");
			else if (user == 1)
				System.out.println("졌습니다");
			else if (user == 2)
				System.out.println("비겼습니다");
			break;
		}
/*
		if(user == com)
			System.out.println("비겼습니다");
		else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1))
			System.out.println("이겼습니다!!");
		else
			System.out.println("졌습니다");
		
*/
	}

}
