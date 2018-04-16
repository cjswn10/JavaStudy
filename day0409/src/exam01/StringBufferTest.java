package exam01;

public class StringBufferTest {

	public static void pro(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("insert ");
		sb.append("into member");
		sb.append(" values(?, ?, ?, ?, ?)");
		
		pro(sb.toString());	//string으로 변환
	}

}
