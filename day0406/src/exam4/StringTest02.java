package exam4;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello     ";	//�ڿ� �����̽� ����
		String str2 = str.trim();	//���� ���� Whitespace�� �������ִ� ���

		int a = str.length();
		int b = str2.length();
		
		System.out.println(a);
		System.out.println(b);
	}

}
