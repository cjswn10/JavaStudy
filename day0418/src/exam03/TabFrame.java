package exam03;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import exam02.InputTab;
import exam02.OutputTab;

public class TabFrame extends JFrame {

	public TabFrame() {
		TextTab tab1 = new TextTab();
		SwingTab tab2 = new SwingTab();
		LayoutTab tab3 = new LayoutTab();
		JavaTab tab4 = new JavaTab();
		
		JTabbedPane jtp = new  JTabbedPane();
		jtp.add("Text", tab1);
		jtp.add("Swing", tab2);
		jtp.addTab("Layout", tab3);
		jtp.addTab("Java", tab4);
		
		add(jtp);
		
		setSize(800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabFrame();
	}

}
