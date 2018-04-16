package exam1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//순서 유지
		TreeMap map = new TreeMap();
		map.put(0, "가위");
		map.put(1, "바위");
		map.put(2, "보");
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int com = r.nextInt(3);

		System.out.print("가위(0), 바위(1), 보(2) 중에 선택하세요: ");
		int user = scan.nextInt();

		System.out.println("사용자 : " + map.get(user));
		System.out.println("컴퓨터 : " + map.get(com));

		if(user == com)
			System.out.println("비겼습니다");
		else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1))
			System.out.println("이겼습니다!!");
		else
			System.out.println("졌습니다");
		
	}

}
