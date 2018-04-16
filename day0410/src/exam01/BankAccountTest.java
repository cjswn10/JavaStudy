package exam01;

class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
		System.out.println("�ܾ�: " + balance);
	}
	
	public void withdraw(int money) {
		try {
		if (balance < money) {
			throw new NegativeBalanceException("�ܾ� ����");
		}
		balance -= money;
		System.out.println("�ܾ�: " + balance);
		} catch (NegativeBalanceException e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}
}

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String msg) {
		super(msg);
	}
}


public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount(3000);
		
		b.deposit(2000);
		b.withdraw(10000);
	}

}
