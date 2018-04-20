package hw;

import java.io.*;
import java.net.*;
//요청한 클라이언트와 1:1
public class MultiServerThread implements Runnable {
	//데이터를 주고 받기 위한 데이터 socket을 멤버변수로 가짐
	private Socket socket;
	//이 클래스는 MultiServer에 의해서 생성되고
	//그 때 매개변수로 MultiServer를 전달받는다
	//그것을 닫기 위한 변수
	private MultiServer ms;
	
	
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public MultiServerThread(MultiServer ms) {
		this.ms = ms;
	}
	
	public synchronized void run() {
		boolean isStop = false;
		
		try {
			socket = ms.getSocket();
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			String message = null;
			while(!isStop) {
				message = (String)ois.readObject();
				String[] str = message.split("#");
				if(str[1].equals("exit")) {
					broadCasting(message);
					isStop = true;
				} else {
					broadCasting(message);
				}
			}
			
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress() + "정상적으로 종료하셨습니다");
			System.out.println("list size: " + ms.getList().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress() + "비정상적으로 종료하셨습니다");
			System.out.println("list size: " + ms.getList().size());
		}
	}

	private void broadCasting(String message) throws IOException {
		for(MultiServerThread ct : ms.getList()) {
			ct.send(message);
		}
	}

	private void send(String message) throws IOException {
		oos.writeObject(message);
	}
	
	
}
