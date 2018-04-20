package hw;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiServer {
	private ArrayList<MultiServerThread> list;
	private Socket socket;
	
	public MultiServer() throws IOException{
		list = new ArrayList<MultiServerThread>();
		ServerSocket serverSocket = new ServerSocket(5000);	//port
		MultiServerThread mst = null;
		
		boolean isStop = false;
		while (!isStop) {
			System.out.println("Server ready...");
			//클라이언트 접속을 요청하는 순간 요청을 수락하는
			//accept메소드가 동작되고 이 클라이언트도 데이털르 주고 받기 위한 데이터 소켓을 받음
			//클라이언트가 요청할 때 마다 별도의 socket이 생성됨
			socket = serverSocket.accept();
			
			//서버는 동시에 여러명을 상대해야 하기 때문에
			//각각의 클라이언트와 통신하기 위해서는
			//각각의 클라이언트와 1:1 통신하는 것은 MultiServerThread한테 맡긴다.
			
			//지금 요청한 클라이언트를 상태하기 위하여
			//나자신(MultiServerThread 객체를 생성하여 그에게 맡긴다.
			//MultiServerThread 객체를 생성하여 그에게 맡긴다.
			mst = new MultiServerThread(this);
			
			//요청한 클라이언트가 예를 들어 3명이라고 가정하자
			//이현진, 송명준, 이태호
			//
			//그러면 지금 요청한 클라이언트들을 모두 관리하고 있어야 할 것이다.
			//요청한 순간 클라이언트를 상대하는 객체 MultiServerThread 객체
			//mst를 list에 담는다
			list.add(mst);
			
			//Thread를 가동한다.
			//MultiServerThread의 run메소드에서 
			//클라이언트와 계속하여 통신하는 코드를 거기에 기술한다.
			
			
			Thread t = new Thread(mst);
			t.start();
			
		}
		
	}
	
	public ArrayList<MultiServerThread> getList() {
		return list;
	}
	
	public Socket getSocket() {
		return socket;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new MultiServer();
	}

}
