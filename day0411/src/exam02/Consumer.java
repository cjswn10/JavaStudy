package exam02;

public class Consumer extends Thread {
	private Product p;

	public Consumer(Product p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			p.getNumber();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
	
}
