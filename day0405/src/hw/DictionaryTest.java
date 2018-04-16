package hw;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap dic = new HashMap();
		dic.put("apple", "사과");
		dic.put("melon", "멜론");
		dic.put("banana", "바나나");

		int menu = 0;
		while (menu != 4) {
			// 메뉴입력
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.추가 2.삭제 3.검색 4.종료");
			menu = scan.nextInt();

			// 1.추가
			if (menu == 1) {
				System.out.print("추가할 영단어 : ");
				String eng = scan.next();
				
				if(dic.containsKey(eng)) {
					System.out.println("이미 있는 단어입니다.");
					continue;
				}
				
				System.out.print("뜻 : ");
				String kor = scan.next();

				dic.put(eng, kor);
			}

			// 2.삭제
			else if (menu == 2) {
				System.out.print("삭제할 영단어: ");
				String eng = scan.next();
				if(!dic.containsKey(eng)) {
					System.out.println("사전에 없는 단어입니다.");
					continue;
				}
				dic.remove(eng);
			}

			// 3.검색
			else if (menu == 3) {
				String word = "word";
				while (true) {
					System.out.print("단어를 입력: ");
					word = scan.next();
					if (dic.containsKey(word))
						break;
				}
				System.out.println(word + " : " + dic.get(word));
			}
			
		}//전체while문
		
	}
}
