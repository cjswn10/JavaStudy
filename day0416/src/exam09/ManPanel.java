package exam09;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class ManPanel extends JPanel implements KeyListener, Runnable{
	Image image01;
	Image image02;
	Image image03;
	Image image04;
	
	int x = 10;
	int y = 250;
	int step = 10;
	int n = 1;
	
	public ManPanel() {
		setFocusable(true);
		image01 = Toolkit.getDefaultToolkit().getImage("man01.png");
		image02 = Toolkit.getDefaultToolkit().getImage("man02.png");
		image03 = Toolkit.getDefaultToolkit().getImage("man03.png");
		image04 = Toolkit.getDefaultToolkit().getImage("man04.png");
		addKeyListener(this);
		(new Thread(this)).start();
		
	}


	//그림그리는 컴포넌트
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		switch(n) {
		case 1:
			g.drawImage(image01, x, y, null);
			break;
		case 2:
			g.drawImage(image02, x, y, null);
			break;
		case 3:
			g.drawImage(image03, x, y, null);
			break;
		case 4:
			g.drawImage(image04, x, y, null);
			break;
		}
		
		repaint();
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		System.out.println(code);
		
		//좌 : 37
		//위: 38
		//우: 39
		//아래 : 40
		
		switch(code) {
		case 37:
			x = x - step;
			break;
		case 38:
			y = y - step;
			break;
		case 39:
			x = x + step;
			break;
		case 40:
			y = y + step;
			break;
		}
		repaint();
		
		n++;
		
		if(n >= 5) {
			n = 1;
		}
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
			Thread.sleep(100);
			} catch (Exception e) {
				
			}
			x = x + step;
			repaint();
			
		}
	}
	
	
	
}
