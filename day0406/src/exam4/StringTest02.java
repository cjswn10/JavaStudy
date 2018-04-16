package exam4;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello     ";	//뒤에 스페이스 있음
		String str2 = str.trim();	//양쪽 끝의 Whitespace를 제거해주는 기능

		int a = str.length();
		int b = str2.length();
		
		System.out.println(a);
		System.out.println(b);
	}

}
