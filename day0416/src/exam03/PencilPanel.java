package exam03;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PencilPanel extends JPanel implements MouseListener, MouseMotionListener {
	//Panel은 기본이 borderlayout
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	ArrayList<GraphicInfo> list;
	ArrayList<ArrayList<GraphicInfo>> all;	//하나의 곡선이 담길 변수
	
	public PencilPanel() {
		addMouseListener(this);
		addMouseMotionListener(this);
		
		list = new ArrayList<GraphicInfo>();
		all = new ArrayList<ArrayList<GraphicInfo>>();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		for(GraphicInfo info : list) {
			g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
		}
		
		g.drawLine(x1, y1, x2, y2);
		x1 = x2;
		y1 = y2;
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		x2 = e.getX();
//		y2 = e.getY();
//		
//		list.add(new GraphicInfo(x1, y1, x2, y2));
//		
//		repaint();
		all.add(list);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		list.add(new GraphicInfo(x1, y1, x2, y2));
		repaint();
//		x1 = e.getX();
//		y1 = e.getY();

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
