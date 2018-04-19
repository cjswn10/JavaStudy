package exam05;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(1993);
			byte[] data = new byte[100];
			// 무한대기상태
			while (true) {
				Socket socket = server.accept();
				InputStream is = socket.getInputStream();

				is.read(data);
				String msg = new String(data);
				System.out.println("수신된 데이터: " + msg);

				is.close();
				socket.close();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
