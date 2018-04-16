package hw;

import java.util.Scanner;

public class StringTest2 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력");
		String str = scan.nextLine();
		
		System.out.println("총 문자열의 길이 : " + str.length());
		String[] word = str.split(" ");
		System.out.println("단어의 수 : " + word.length);

		
		//빈도수 구하기
		int[] count = new int[word.length];
		for(int i = 0; i < word.length; i++) {
			count[i] = 1;
			for(int j = i + 1; j < word.length; j++) {
				if(word[i].equals(word[j])) 
					count[i]++;
				
			}
			
		}

		System.out.println("각 단어의 빈도 수");
		//거꾸로 포문을 만들어 처음 중복된 단어 제거
		for(int i = 0; i < word.length; i++) {
			
			for(int k = i - 1; k >= 0; k--) {
				if(word[i].equals(word[k]))
					count[i] = 0;
			}
			
			if(count[i] != 0)
				System.out.println(word[i] + " : " + count[i]);
		}
		
	}

}