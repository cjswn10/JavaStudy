package exam4;
//�� StringTest10
public class StringTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "tiger@net@s.com";
		int idxAt = email.indexOf("@");
		int idxAt2 = email.indexOf("@", idxAt+1);	//indexOf(��, �ε���)	�ε������� ���� �ִ��� ã�´�.������ -1��ȯ
		
		if((idxAt > 0) && (idxAt2 == -1))
			System.out.println("�ùٸ� �̸��� �Դϴ�");
		else
			System.out.println("�ùٸ� �̸����� �ƴմϴ�");
			
		String str = "hello java hello korea";
		String r = str.substring(6, 10);	//6���� 10������ ��ȯ
		System.out.println(r);
		
//		str = str.substring(6, 10);	 Garbage�� ����� str�� ���ο� ��ü�� �ٶ�
		
	}

}
