package exam01;

class Person extends Thread{
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("hello " + name + "!");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("юс©╛аж");
		p1.start();
	}

}
