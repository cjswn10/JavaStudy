package exam4;

public class StringTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hi hello korea hello java";
		int n = msg.indexOf("k");
		System.out.println(n);
		
		int a = msg.indexOf("hello");
		System.out.println(a);
		
		int b = msg.indexOf(" ");
		System.out.println(b);
		
		int c = msg.lastIndexOf("hello");	//�ڿ������� ã��
		System.out.println(c);
		
		int d = msg.indexOf("z");	//ã�� �� ������ -1��ȯ
		System.out.println(d);
	}

}
