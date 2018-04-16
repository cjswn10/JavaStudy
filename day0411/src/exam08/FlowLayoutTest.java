package exam08;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {
	
	public FlowLayoutTest() {
		setLayout(new FlowLayout());
		
		for(int i = 0; i < 15; i++) {
			add(new JButton("¹öÆ°" + (i+1)));
		}
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutTest();
	}

}
