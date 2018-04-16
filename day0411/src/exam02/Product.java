package exam02;

import java.util.Random;

//제품은 정수
public class Product {
	private int n;
	
	//생산자는 계속하여 새로운 정수 n을 만드는 일을 하도록 한다
	//소비자는 생산자가 생산한 새로운 정수를 가져다 쓰는 일을 하도록 한다.
	
	//새로운 정수가 생산되어 있는지 없는지 상태를 저장할 변수
	//생산자가 새로운 정수를 만들어 n에 담는 순간 isNew는 true
	//소비자가 이 정수를 가져다 쓰는 순간 isNew는 false
	boolean isNew;	
	
	//생산자가 새로운 제품(정수) 만드는 메소드
	public synchronized void makeNumber() {
		//1 ~ 100 사이의 난수를 만들어 n에 저장
		
		while(isNew == true) {	//isNew가 false가 될때까지 기다림
			try {
				wait();
			} catch (Exception e) {
			}
		}
		
		Random r = new Random();
		n = r.nextInt(100) + 1;
		
		System.out.println("제품 생산: " + n);
		notify();	//쓰레드를 깨워줌
		isNew = true;
	}
	
	public synchronized int getNumber() {
		
		while(isNew == false) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		System.out.println("제품 소비: " + n);
		notify();
		isNew = false;
		return n;
	}
	
	
	
}
