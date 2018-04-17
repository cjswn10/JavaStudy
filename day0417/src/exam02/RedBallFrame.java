package exam02;

import javax.swing.JFrame;

public class RedBallFrame extends JFrame {
	RedBallPanel rb;
	
	public RedBallFrame() {
		rb = new RedBallPanel();
		add(rb);
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RedBallFrame();
	}

}
