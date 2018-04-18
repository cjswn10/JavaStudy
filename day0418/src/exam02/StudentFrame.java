package exam02;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class StudentFrame extends JFrame {

	public StudentFrame() {
		InputTab tab1 = new InputTab();
		OutputTab tab2 = new OutputTab();
		
		
		JTabbedPane jtp = new  JTabbedPane();
		jtp.add("입력", tab1);
		jtp.add("출력", tab2);
		
		add(jtp);
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentFrame();
	}

}
