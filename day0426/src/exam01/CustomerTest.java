package exam01;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.println("이름? ");
		name = scan.next();
		
		CustomerDAO dao = new CustomerDAO();
		CustomerVO c = dao.getCustomer(name);

		System.out.println("고객 정보");
		System.out.println("아이디: " + c.getCustid());
		System.out.println("이름: " + c.getName());
		System.out.println("주소: " + c.getAddress());
		System.out.println("전화: " + c.getPhone());
		
	}

}
