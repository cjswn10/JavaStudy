package exam1;

import java.util.Arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 1, 9, 15, 2 };
		
		int n = Arrays.binarySearch(arr, 2);	//���� ��ȯ, ������ �ȵǾ��ִ� �� ã�� ����
		System.out.println(n);
		
		System.out.println(Arrays.toString(arr));
		
		//arr�迭�� ��� ����� ���� 1�� ä������
		Arrays.fill(arr, 1);
		System.out.println(Arrays.toString(arr));
		
	}

}
