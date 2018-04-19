package exam02;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket socket = new Socket("203.236.209.115", 1992);
			InputStream is = socket.getInputStream();	//난수 받을꺼임
			
			for(int i = 0; i < 10; i++) {
				int n = is.read();
				System.out.println("받은 데이터: " + n);
			}
			is.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
