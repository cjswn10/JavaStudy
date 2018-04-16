package exam01;

import java.util.Scanner;

class ProcessScore {
	private double total;
	private double avg;

	public ProcessScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProcessScore(int[] score) throws IllegalScoreException {
		super();
		for (int s : score) {
			if (s < 0) {
				throw new IllegalScoreException("������ �ƴ� �ùٸ� ���� �Է��ϼ���");
			}
			total += s;
		}
		avg = total / score.length;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}

class IllegalScoreException extends Exception {

	public IllegalScoreException(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
}

public class ProcessScoreTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� ���?");
		n = sc.nextInt();
		arr = new int[n];
		try {
			for (int i = 0; i < n; i++) {
				System.out.println((i + 1) + "����: ");
				arr[i] = sc.nextInt();

				if (arr[i] < 0) {

					throw new IllegalScoreException("���ܹ߻� : ���� ����");
				}
			}
		} catch (IllegalScoreException e) {
			System.out.println(e.getMessage());
		}

		// ProcessScore s = new ProcessScore(arr);

		
	}

}
