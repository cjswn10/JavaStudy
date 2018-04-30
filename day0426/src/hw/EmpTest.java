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
			System.out.println("1.검색/2.종료");
			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("부서명?");
				dname = scan.next();

				EmpDAO dao = new EmpDAO();
				ArrayList<EmpVO> list = dao.getDeptList(dname);

				System.out.println("사원번호\t이름\t급여\t수당\t입사일\t\t\t주민번호\t\t부서번호\t직급\t주소");
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
