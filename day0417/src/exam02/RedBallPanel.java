package exam02;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RedBallPanel extends JPanel {
	int x = 10;
	int y = 300;
	int width = 50;
	int height = 50;
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
		g.setColor(Color.RED);
		g.fillOval(x, y, width, height);
	}

}
