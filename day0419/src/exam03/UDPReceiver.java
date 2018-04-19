package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class UDPReceiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DatagramSocket socket = new DatagramSocket(1990);
			byte[] data = new byte[100];
			
			DatagramPacket packet = new DatagramPacket(data, data.length);
			while(true) {
				socket.receive(packet);
				String str = new String(data);
				System.out.println("수신된 데이터: " + str);
				Arrays.fill(data, (byte)0);
			}
		//	socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
