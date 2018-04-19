package exam04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;
//메세지 보냄
public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String ip = args[0];
			int port = Integer.parseInt(args[1]);
			
			Socket socket = new Socket(ip, port);
			OutputStream os = socket.getOutputStream();
			
			Scanner sc = new Scanner(System.in);
			
			
			while(true) {
				System.out.print("입력=>");
				String msg = sc.next();
				os.write(msg.getBytes());
				
				if(msg.equals("q!"))
					break;
			}
			
			os.close();
			socket.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}