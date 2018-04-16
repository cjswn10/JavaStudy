package exam02;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		Producer pd = new Producer(p);
		Consumer cs = new Consumer(p);
				
		pd.start();
		cs.start();
		
		
	}

}
