package exam02;

import java.util.Random;

//��ǰ�� ����
public class Product {
	private int n;
	
	//�����ڴ� ����Ͽ� ���ο� ���� n�� ����� ���� �ϵ��� �Ѵ�
	//�Һ��ڴ� �����ڰ� ������ ���ο� ������ ������ ���� ���� �ϵ��� �Ѵ�.
	
	//���ο� ������ ����Ǿ� �ִ��� ������ ���¸� ������ ����
	//�����ڰ� ���ο� ������ ����� n�� ��� ���� isNew�� true
	//�Һ��ڰ� �� ������ ������ ���� ���� isNew�� false
	boolean isNew;	
	
	//�����ڰ� ���ο� ��ǰ(����) ����� �޼ҵ�
	public synchronized void makeNumber() {
		//1 ~ 100 ������ ������ ����� n�� ����
		
		while(isNew == true) {	//isNew�� false�� �ɶ����� ��ٸ�
			try {
				wait();
			} catch (Exception e) {
			}
		}
		
		Random r = new Random();
		n = r.nextInt(100) + 1;
		
		System.out.println("��ǰ ����: " + n);
		notify();	//�����带 ������
		isNew = true;
	}
	
	public synchronized int getNumber() {
		
		while(isNew == false) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		System.out.println("��ǰ �Һ�: " + n);
		notify();
		isNew = false;
		return n;
	}
	
	
	
}
