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
			//Ŭ���̾�Ʈ ������ ��û�ϴ� ���� ��û�� �����ϴ�
			//accept�޼ҵ尡 ���۵ǰ� �� Ŭ���̾�Ʈ�� �����и� �ְ� �ޱ� ���� ������ ������ ����
			//Ŭ���̾�Ʈ�� ��û�� �� ���� ������ socket�� ������
			socket = serverSocket.accept();
			
			//������ ���ÿ� �������� ����ؾ� �ϱ� ������
			//������ Ŭ���̾�Ʈ�� ����ϱ� ���ؼ���
			//������ Ŭ���̾�Ʈ�� 1:1 ����ϴ� ���� MultiServerThread���� �ñ��.
			
			//���� ��û�� Ŭ���̾�Ʈ�� �����ϱ� ���Ͽ�
			//���ڽ�(MultiServerThread ��ü�� �����Ͽ� �׿��� �ñ��.
			//MultiServerThread ��ü�� �����Ͽ� �׿��� �ñ��.
			mst = new MultiServerThread(this);
			
			//��û�� Ŭ���̾�Ʈ�� ���� ��� 3���̶�� ��������
			//������, �۸���, ����ȣ
			//
			//�׷��� ���� ��û�� Ŭ���̾�Ʈ���� ��� �����ϰ� �־�� �� ���̴�.
			//��û�� ���� Ŭ���̾�Ʈ�� ����ϴ� ��ü MultiServerThread ��ü
			//mst�� list�� ��´�
			list.add(mst);
			
			//Thread�� �����Ѵ�.
			//MultiServerThread�� run�޼ҵ忡�� 
			//Ŭ���̾�Ʈ�� ����Ͽ� ����ϴ� �ڵ带 �ű⿡ ����Ѵ�.
			
			
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
