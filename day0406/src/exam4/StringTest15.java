package exam4;

import java.util.Scanner;

//�� StringTest14
public class StringTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������� ���ڿ��� �Է� �޾� �Ųٷ� ����� ���ϴ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է�");
		String str = scan.next();
		
		for(int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
		
		System.out.println("\n�ι�° ��� StringBuffer");
		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());
		
		
	}
}
