package exam01;

public class StringBufferTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb2 = new StringBuffer("친구를 사랑했네");
		sb2.insert(0, "친구의 ");
		System.out.println(sb2);
		
		StringBuffer sb = new StringBuffer("hello");
		
		System.out.println(sb.append("java"));	//string과 달리 문자열을 변경할 수 있다.
		System.out.println(sb);
	}

}
