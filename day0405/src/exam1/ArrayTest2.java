package exam1;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		
		//ArraysŬ������ binarySearch�� �̿�
		int n = Arrays.binarySearch(arr, 40);	//40�� �ִ� �ε����� ��ȯ����
		System.out.println(n);
		
		int a = Arrays.binarySearch(arr, 60);	//ã�� �� ������ ������ ��ȯ��.
		System.out.println(a);
	}

}
