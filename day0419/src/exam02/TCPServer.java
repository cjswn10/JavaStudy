package exam02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(1992);
			Random r = new Random();
			while (true) {
				Socket socket = server.accept(); // 얘를 통해서 데이터를 주고받음
				System.out.println("클라이언트가 접속했어요!");

				Thread.sleep(1000);

				OutputStream os = socket.getOutputStream(); // 클라이언트에 난수를 줄꺼임

				for (int i = 0; i < 10; i++) {
					int n = r.nextInt(100) + 1;
					os.write(n);

				}
				os.close();
				socket.close();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
