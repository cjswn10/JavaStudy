package exam04;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class LinePanel extends JPanel implements MouseListener{

	int x1;
	int y1;
	int x2;
	int y2;
	ArrayList<LineInfo> list;
	
	//생성자에서 마우스 이벤트를 등록한다.
	public LinePanel() {
		addMouseListener(this);
		
		list = new ArrayList<LineInfo>();
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		//list에 담긴 선의 정보만큼 선을 다시 그려준다
		for(LineInfo info : list) {
			g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//시작점
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		
	}
	//끝점
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		
		list.add(new LineInfo(x1, y1, x2, y2));
		//그래픽을 다시 그려줄 것을 요청한다.
		repaint();
		//내부적으로 paintcomponent가 동작한다.
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
