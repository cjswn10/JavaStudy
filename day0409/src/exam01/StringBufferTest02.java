package exam01;

public class StringBufferTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb2 = new StringBuffer("ģ���� ����߳�");
		sb2.insert(0, "ģ���� ");
		System.out.println(sb2);
		
		StringBuffer sb = new StringBuffer("hello");
		
		System.out.println(sb.append("java"));	//string�� �޸� ���ڿ��� ������ �� �ִ�.
		System.out.println(sb);
	}

}
