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
//		���� �̸�, ��ȭ, �ּҰ� �Ű������� ���� ���� ��ü�� �̸�, ��ȭ, �ּҰ�
//		�������� �Ǻ��Ͽ� true, false�� ��ȯ
		Student s = (Student)obj;
		
		if(name.equals(s.name) && tel.equals(s.tel) && addr.equals(s.addr) && (age == s.age))
			return true;
			
		return f;
	};
}
