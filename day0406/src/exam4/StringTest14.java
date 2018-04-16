package exam4;
//쌤 StringTest12
public class StringTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "tiger@nate.com";
		
		//email로 부터 id만 추출하여 출력
		String id = email.substring(0, email.indexOf("@"));
		System.out.println(id);

		String company = email.substring(email.indexOf("@") + 1, email.indexOf("."));
		System.out.println(company);
	
	
	}

}
