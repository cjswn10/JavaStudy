package exam08;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {
	
	public GridLayoutTest() {
		setLayout(new GridLayout(3, 5));
		
		for(int i = 0; i < 13; i++) {
			add(new JButton("¹öÆ°" + (i+1)));
		}
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutTest();
	}

}
