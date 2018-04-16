package exam3;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		Student s = (Student)obj;
		boolean f = false;
		if(name.equals(s.name) && kor == s.kor && eng == s.eng && math == s.math)
			f = true;
	
		return f;
	}
	
	
	
}
