package exam1;

import java.util.Arrays;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 5, 1, 9, 15, 2 };
		int[] b = { 7, 5, 1, 9, 3, 2 };
		
		//�� �迭�� ���� ������ �Ǻ��Ͽ� ������ ���� ���
		
		if(Arrays.equals(a, b))
			System.out.println("�� �迭�� �����ϴ�");
		else
			System.out.println("�� �迭�� ���� �ʽ��ϴ�");
	}

}
