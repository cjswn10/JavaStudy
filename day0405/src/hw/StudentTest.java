package hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String name;
	private String addr;
	private String tel;

	public Student() {

	}

	public Student(String name, String addr, String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String toString() {
		return name + " " + addr + " " + tel;
	}

}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> st = new ArrayList<Student>();

		Student s1 = new Student("임연주", "마포구", "01090909090");
		Student s2 = new Student("김네모", "성북구", "01023232322");
		Student s3 = new Student("박세모", "영등포구", "01090123130");

		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		int menu = 0;
		while (menu != 4) {
			// 메뉴입력
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.추가 2.삭제 3.검색 4.종료");
			menu = scan.nextInt();

			// 1.추가
			if (menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();

				System.out.print("주소 : ");
				String addr = scan.next();

				System.out.print("전화번호 : ");
				String tel = scan.next();

				Student s = new Student(name, addr, tel);
				st.add(s);
			}

			// 2.삭제
			else if (menu == 2) {
				for(Object o : st)
					System.out.println(o);
				
				System.out.println();
				System.out.print("삭제할 이름: ");
				String name = scan.next();

				for (int i = 0; i < st.size(); i++) {
					if ((st.get(i)).getName().equals(name)) {
						st.remove(i);
						break;
					}
				}

			}

			// 3.검색
			else if (menu == 3) {
				String name = "";
				System.out.print("이름: ");
				name = scan.next();

				for (int i = 0; i < st.size(); i++) {
					if ((st.get(i)).getName().equals(name)) {
						System.out.println( st.get(i));
						break;
					}
				}

			}

		} // 전체while문
	}

}
