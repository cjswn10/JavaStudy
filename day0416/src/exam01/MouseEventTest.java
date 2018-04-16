package exam01;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseEventTest extends JFrame implements MouseListener {

	
	public MouseEventTest() {
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ�� �߻���Ű���� ����ڿ� �̺�Ʈ�� ����� ��� �Ѵ�
		addMouseListener(this);
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 Ŭ��");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ������");	

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ������");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ����");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ����");
	}

	
	public static void main(String[] args) {
		new MouseEventTest();
	}
}
