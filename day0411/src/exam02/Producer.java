package exam02;

public class Producer extends Thread {
	private Product p;
	
	public Producer(Product p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <10; i++) {
			p.makeNumber();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
	
}
