package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String addr;
		
		System.out.println("주소?");
		addr = scan.next();
		
		CustomerDAO dao = new CustomerDAO();
		ArrayList<CustomerVO> list = dao.getAddrList(addr);
		
		System.out.println("고객 정보");
		System.out.println("번호\t이름\t주소\t\t전화");
		for(CustomerVO c : list) {
			
			System.out.print(c.getCustid() + "\t");
			System.out.print(c.getName() + "\t");
			System.out.print(c.getAddress() + "\t");
			System.out.println(c.getPhone() + "\t");
		}
		
	}

}
