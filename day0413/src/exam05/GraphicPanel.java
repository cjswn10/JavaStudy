package exam05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GraphicPanel extends JPanel implements MouseListener{

	int x1;
	int y1;
	int x2;
	int y2;
	ArrayList<GraphicInfo> list;
	
	int drawType = 0;	//선: 0, 원: 1, 사각형: 2
	Color drawColor = Color.BLACK;
	//우리가 만든 LinPanel에 마우스 이벤트를 등록해야한다.
	//생성자에서
	public GraphicPanel() {
		
		addMouseListener(this);
		list = new ArrayList<GraphicInfo>();
		//언제 list에 데이터 담기나요?
		//하나의 선이 완성될때(손을 뗄때)
		
		
	}
	
	//실제로 그리는 역할을 함
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		super.paintComponent(g);
		
		for(GraphicInfo info : list) {
			g.setColor(info.getDrawColor());
			
			int width = Math.abs(info.getX2()-info.getX1());
			int height = Math.abs(info.getY2()-info.getY1());
			switch(info.getDrawType()) {
			case 0:
				g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
				break;
			case 1:
				g.drawOval(info.getX1(), info.getY1(), width, height);
				break;
			case 2:
				g.drawRect(info.getX1(), info.getY1(), width, height);
				break;
			}
			
		}
		

		
		
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
		x2 = e.getX();
		y2 = e.getY();
		
		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, drawColor));
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

	
}
