package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String dname;
		int menu;

		while (true) {
			System.out.println("1.�˻�/2.����");
			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("�μ���?");
				dname = scan.next();

				EmpDAO dao = new EmpDAO();
				ArrayList<EmpVO> list = dao.getDeptList(dname);

				System.out.println("�����ȣ\t�̸�\t�޿�\t����\t�Ի���\t\t\t�ֹι�ȣ\t\t�μ���ȣ\t����\t�ּ�");
				for (EmpVO e : list) {
					System.out.print(e.getEno() + "\t");
					System.out.print(e.getEname() + "\t");
					System.out.print(e.getSal() + "\t");
					System.out.print(e.getComm() + "\t");
					System.out.print(e.getHiredate() + "\t");
					System.out.print(e.getJumin() + "\t");
					System.out.print(e.getDno() + "\t");
					System.out.print(e.getPosition() + "\t");
					System.out.println(e.getAddr());
				}
			} else if (menu == 2)
				break;
		}
	}

}
