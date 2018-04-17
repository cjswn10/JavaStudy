package exam03;
/*
 * 공 움직이기
 * 
 */
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RedBallPanel extends JPanel implements Runnable {
	int x = 10;
	int y = 200;
	int length = 50;	//지름
	int xStep = 10;
	int yStep = -10;
	int width = 400;	//프레임사이즈
	int height = 350;	//프레임 사이즈
	
	public RedBallPanel() {
		// TODO Auto-generated constructor stub

		(new Thread(this)).start();
	
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawOval(x, y, length, length);
		
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, length, length);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			width = (int)getSize().getWidth();
			height = (int)getSize().getHeight();
			
			if(x <= 0 || x >= (width-60))
				xStep *= -1;
			
			if(y <= 0 || y >= (height-60)) 
				yStep *= -1;
			
				
			x = x + xStep;
			y = y + yStep;	
				
				
			repaint();
		}
	}

}
