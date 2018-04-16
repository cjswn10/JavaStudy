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
		
		int c = msg.lastIndexOf("hello");	//뒤에서부터 찾음
		System.out.println(c);
		
		int d = msg.indexOf("z");	//찾는 게 없으면 -1반환
		System.out.println(d);
	}

}
