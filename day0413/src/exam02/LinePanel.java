package exam02;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LinePanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(10, 10, 110, 100);
	
	
	}
	
}
