package exam01;

public class StringTest01 {
	public static void main(String[] args) {
		
		String str = "   hello   ";
		System.out.println(str);
		System.out.println(str.length());
		
		str.trim();
		System.out.println(str);	//str�� �������
		
		str = str.trim();	//���ο� str��ü�� ������
		System.out.println(str);
		
		//�迭 �ȿ� catã��
		String[] arr =  {"cat", "lion", "CAT", "tiger", "monkey", "Cat"};
		int n = 0;
		for(String s : arr) {
			s = s.toLowerCase();	//���� �ҹ��ڷ�
			if(s.equals("cat"))
				n++;
			
		}
		System.out.println(n);
		
		
		
	}
}
