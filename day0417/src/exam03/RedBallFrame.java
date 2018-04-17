package exam03;

import javax.swing.JFrame;

public class RedBallFrame extends JFrame {
	RedBallPanel rb;
	
	public RedBallFrame() {
		rb = new RedBallPanel();
		add(rb);
		setSize(400, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RedBallFrame();
	}

}
