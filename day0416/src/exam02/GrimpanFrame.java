package exam02;

import javax.swing.JFrame;

public class GrimpanFrame extends JFrame {
	GrimpanPanel grimpan;
	
	public GrimpanFrame() {
		//Frame은 기본이 borderlayout
		grimpan = new GrimpanPanel();	
		add(grimpan);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GrimpanFrame();
	}

}
