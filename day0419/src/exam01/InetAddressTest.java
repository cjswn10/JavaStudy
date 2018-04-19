package exam01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress[] addr = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress ad : addr)
				System.out.println(ad);
			
			System.out.println(addr);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
