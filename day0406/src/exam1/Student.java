package exam1;

public class Student {
	private String name;
	private String tel;
	private String addr;
	private int age;

	public Student(String name, String tel, String addr, int age) {
		super();
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean f = false;
//		나의 이름, 전화, 주소가 매개변수로 전달 받은 객체의 이름, 전화, 주소가
//		동일한지 판별하여 true, false를 반환
		Student s = (Student)obj;
		
		if(name.equals(s.name) && tel.equals(s.tel) && addr.equals(s.addr) && (age == s.age))
			return true;
			
		return f;
	};
}
