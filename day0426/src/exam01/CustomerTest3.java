package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		String addr;

		int menu;

		while (true) {
			System.out.println("1.�̸��˻�/2.�޴��˻�/3.����");
			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("�̸�? ");
				name = scan.next();

				CustomerDAO dao = new CustomerDAO();
				CustomerVO c = dao.getCustomer(name);

				System.out.println("�� ����");
				System.out.println("���̵�: " + c.getCustid());
				System.out.println("�̸�: " + c.getName());
				System.out.println("�ּ�: " + c.getAddress());
				System.out.println("��ȭ: " + c.getPhone());

			} else if (menu == 2) {
				System.out.println("�ּ�?");
				addr = scan.next();

				CustomerDAO dao = new CustomerDAO();
				ArrayList<CustomerVO> list = dao.getAddrList(addr);

				System.out.println("�� ����");
				System.out.println("��ȣ\t�̸�\t�ּ�\t\t��ȭ");
				for (CustomerVO c : list) {

					System.out.print(c.getCustid() + "\t");
					System.out.print(c.getName() + "\t");
					System.out.print(c.getAddress() + "\t");
					System.out.println(c.getPhone() + "\t");
				}
			} else if (menu == 3)
				break;
			
			System.out.println();
		}
	}

}
