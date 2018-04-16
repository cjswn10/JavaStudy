package exam03;

import javax.swing.JFrame;

public class PencilFrame extends JFrame {
	PencilPanel grimpan;
	
	public PencilFrame() {
		//Frame은 기본이 borderlayout
		grimpan = new PencilPanel();	
		add(grimpan);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PencilFrame();
	}

}
