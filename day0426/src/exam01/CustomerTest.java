package exam01;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.println("�̸�? ");
		name = scan.next();
		
		CustomerDAO dao = new CustomerDAO();
		CustomerVO c = dao.getCustomer(name);

		System.out.println("�� ����");
		System.out.println("���̵�: " + c.getCustid());
		System.out.println("�̸�: " + c.getName());
		System.out.println("�ּ�: " + c.getAddress());
		System.out.println("��ȭ: " + c.getPhone());
		
	}

}
