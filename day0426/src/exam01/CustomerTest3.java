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
			System.out.println("1.이름검색/2.메뉴검색/3.종료");
			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("이름? ");
				name = scan.next();

				CustomerDAO dao = new CustomerDAO();
				CustomerVO c = dao.getCustomer(name);

				System.out.println("고객 정보");
				System.out.println("아이디: " + c.getCustid());
				System.out.println("이름: " + c.getName());
				System.out.println("주소: " + c.getAddress());
				System.out.println("전화: " + c.getPhone());

			} else if (menu == 2) {
				System.out.println("주소?");
				addr = scan.next();

				CustomerDAO dao = new CustomerDAO();
				ArrayList<CustomerVO> list = dao.getAddrList(addr);

				System.out.println("고객 정보");
				System.out.println("번호\t이름\t주소\t\t전화");
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
