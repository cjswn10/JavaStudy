package exam4;
//�� StringTest12
public class StringTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "tiger@nate.com";
		
		//email�� ���� id�� �����Ͽ� ���
		String id = email.substring(0, email.indexOf("@"));
		System.out.println(id);

		String company = email.substring(email.indexOf("@") + 1, email.indexOf("."));
		System.out.println(company);
	
	
	}

}
