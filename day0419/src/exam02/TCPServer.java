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
				Socket socket = server.accept(); // �긦 ���ؼ� �����͸� �ְ����
				System.out.println("Ŭ���̾�Ʈ�� �����߾��!");

				Thread.sleep(1000);

				OutputStream os = socket.getOutputStream(); // Ŭ���̾�Ʈ�� ������ �ٲ���

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
