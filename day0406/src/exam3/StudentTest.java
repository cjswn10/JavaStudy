package exam3;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("���¿�", 50, 60, 70);
		Student s2 = new Student("���¿�", 50, 60, 70);
		
		if(s1.equals(s2))
			System.out.println("���ƿ�");
		else
			System.out.println("�޶��");
	}

}
