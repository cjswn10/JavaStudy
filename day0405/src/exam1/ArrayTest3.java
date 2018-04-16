package exam1;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 1, 9, 15, 2 };
		
		int n = Arrays.binarySearch(arr, 2);	//음수 반환, 정렬이 안되어있는 건 찾지 못함
		System.out.println(n);
		
		

	}

}
