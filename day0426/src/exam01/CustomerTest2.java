package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String addr;
		
		System.out.println("�ּ�?");
		addr = scan.next();
		
		CustomerDAO dao = new CustomerDAO();
		ArrayList<CustomerVO> list = dao.getAddrList(addr);
		
		System.out.println("�� ����");
		System.out.println("��ȣ\t�̸�\t�ּ�\t\t��ȭ");
		for(CustomerVO c : list) {
			
			System.out.print(c.getCustid() + "\t");
			System.out.print(c.getName() + "\t");
			System.out.print(c.getAddress() + "\t");
			System.out.println(c.getPhone() + "\t");
		}
		
	}

}
