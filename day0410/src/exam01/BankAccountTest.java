package exam01;

class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
		System.out.println("ÀÜ¾×: " + balance);
	}
	
	public void withdraw(int money) {
		try {
		if (balance < money) {
			throw new NegativeBalanceException("ÀÜ¾× ºÎÁ·");
		}
		balance -= money;
		System.out.println("ÀÜ¾×: " + balance);
		} catch (NegativeBalanceException e) {
			System.out.println("¿¹¿Ü¹ß»ý: " + e.getMessage());
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
