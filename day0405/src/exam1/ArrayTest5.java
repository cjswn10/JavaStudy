package exam1;

import java.util.Arrays;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 5, 1, 9, 15, 2 };
		int[] b = { 7, 5, 1, 9, 3, 2 };
		
		//두 배열이 서로 같은지 판별하여 적당한 문장 출력
		
		if(Arrays.equals(a, b))
			System.out.println("두 배열은 같습니다");
		else
			System.out.println("두 배열은 같지 않습니다");
	}

}
