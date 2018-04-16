package hw;

/////////////////////�����ǿ�
class ProcessScore {
	private double[] score;
	private double total;
	private double avg;

	public ProcessScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProcessScore(double[] score) throws IllegalScoreException {
		super();
		this.score = score;
		for (double s : score) {
			if (s < 0) {
				throw new IllegalScoreException("������ �ƴ� �ùٸ� ���� �Է��ϼ���");
			}
			total += s;
		}
		avg = total / score.length;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
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

public class ProcessScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double[] score = { 10, 50, 20, 40, -1 };
			ProcessScore s = new ProcessScore(score);
			System.out.println("���: " + s.getAvg());
		} catch (IllegalScoreException e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
