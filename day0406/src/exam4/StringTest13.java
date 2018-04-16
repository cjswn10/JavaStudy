package exam4;
//쌤 StringTest10
public class StringTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "tiger@net@s.com";
		int idxAt = email.indexOf("@");
		int idxAt2 = email.indexOf("@", idxAt+1);	//indexOf(값, 인덱스)	인덱스부터 값이 있는지 찾는다.없으면 -1반환
		
		if((idxAt > 0) && (idxAt2 == -1))
			System.out.println("올바른 이메일 입니다");
		else
			System.out.println("올바른 이메일이 아닙니다");
			
		String str = "hello java hello korea";
		String r = str.substring(6, 10);	//6부터 10전까지 반환
		System.out.println(r);
		
//		str = str.substring(6, 10);	 Garbage가 생기고 str은 새로운 객체를 바라봄
		
	}

}
