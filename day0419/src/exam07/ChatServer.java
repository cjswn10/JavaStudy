package exam07;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ServerSocket server = new ServerSocket(1994);
			
			Socket socket ;
			InputStream is;
			
			while(true)//클라이언트의 접속을 무한 대기하고자하는 대기루프
			{
				socket = server.accept(); //
				is = socket.getInputStream();
				while(true)	
				{
						byte[] data = new byte[100];
						is.read(data);
						String msg = new String(data);
						System.out.println("수신된 데이터: " + msg.trim());
						if(msg.equals("q!"))
							break;
						//Arrays.fill(data, (byte)0);
				}
				
				
					 
			
				is.close();
				socket.close();
			
			
			}
		}catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		}
	}

}

