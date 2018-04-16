package exam01;

public class StringTest01 {
	public static void main(String[] args) {
		
		String str = "   hello   ";
		System.out.println(str);
		System.out.println(str.length());
		
		str.trim();
		System.out.println(str);	//str에 영향없음
		
		str = str.trim();	//새로운 str객체가 생성됨
		System.out.println(str);
		
		//배열 안에 cat찾기
		String[] arr =  {"cat", "lion", "CAT", "tiger", "monkey", "Cat"};
		int n = 0;
		for(String s : arr) {
			s = s.toLowerCase();	//전부 소문자로
			if(s.equals("cat"))
				n++;
			
		}
		System.out.println(n);
		
		
		
	}
}
