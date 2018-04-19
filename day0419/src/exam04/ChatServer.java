package exam04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

//�޽��� ����
public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(1993);
			byte[] data = new byte[100];
			// ���Ѵ�����
			while (true) {
				Socket socket = server.accept();
				InputStream is = socket.getInputStream();

				while (true) {
					is.read(data);
					String msg = new String(data);
					System.out.println("���ŵ� ������: " + msg);
					if (msg.equals("q!"))
						break;
				}

				is.close();
				socket.close();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
