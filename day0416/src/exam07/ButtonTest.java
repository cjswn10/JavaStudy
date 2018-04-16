package exam07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonTest extends JFrame{
	JButton btn;
	Icon icon01;
	Icon icon02;
	Icon icon03;
	Icon man01;
	
//	int img = 0;
	
	public ButtonTest() {
		setLayout(new FlowLayout());
		
		icon01 = new ImageIcon("button01.png");	//파일명 대소문자 구분
		icon02 = new ImageIcon("button02.png");
		icon03 = new ImageIcon("button03.png");	
		btn = new JButton(icon01);
		
		btn.setRolloverIcon(icon02);
		btn.setPressedIcon(icon03);
		
		
		man01 = new ImageIcon("man01.png");
		JLabel lb = new JLabel(man01);
		
		add(lb);
		add(btn);
		
/*		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				switch(img) {
				case 0:
					btn.setIcon(new ImageIcon("button02.png"));
					img = 1;
					break;
				case 1:
					btn.setIcon(new ImageIcon("button03.png"));
					img = 2;
					break;
				case 2:
					btn.setIcon(new ImageIcon("button01.png"));
					img = 0;
					break;
				}
				
				
			}
		});
*/
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonTest();
	}
}
