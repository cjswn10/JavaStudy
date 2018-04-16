package exam1;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		
		//Arrays클래스의 binarySearch를 이용
		int n = Arrays.binarySearch(arr, 40);	//40이 있는 인덱스를 반환해줌
		System.out.println(n);
		
		int a = Arrays.binarySearch(arr, 60);	//찾는 게 없으면 음수를 반환함.
		System.out.println(a);
	}

}
