package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DatagramSocket socket = new DatagramSocket();

			String ip = args[0];
			int port = Integer.parseInt(args[1]);
			InetAddress addr = InetAddress.getByName(ip);

			Scanner sc = new Scanner(System.in);
			
			while (true) {
				System.out.print("ют╥б==>");
				String msg = sc.next();
				byte[] data = msg.getBytes();

				DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);

				socket.send(packet);
				if(msg.equals("q!"))
					break;

			}

			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
	}

}
