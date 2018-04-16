package exam1;

import java.util.ArrayList;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + "," + age;
	}
	
}

public class ArrayListTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();

		list.add("이현진");
		list.add(2018);
		list.add(true);
		list.add(183.7);
		Person p = new Person("임연주", 26);
		list.add(p);
		
		System.out.println(list);

//		int[] arr = new int[5];
	
		for(int i = 0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}

}
