package exam1;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("송명준", "010-1234-5678", "경기도 안양시", 28);
		Student s2 = new Student("송화섭", "010-1234-5678", "경기도 안양시", 28);

		//객체 참조 변수의 == 연산자는 값을 비교하는 것이 아니라
		//어디를 바라보고 있는지 검사한다.
		if(s1.equals(s2)) 
			System.out.println("같아요");
		else
			System.out.println("달라요");
	
		
	}
}
