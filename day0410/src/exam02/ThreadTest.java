package exam02;

import java.util.Date;

public class ThreadTest implements Runnable{
	public void run() {
			while (true) {
				Date d = new Date();
				System.out.println("æ»≥Á«œººø‰ " + d);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest t = new ThreadTest();
		(new Thread(t)).start();
			
	
	}
}
