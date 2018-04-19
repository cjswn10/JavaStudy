package exam01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println(addr);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
