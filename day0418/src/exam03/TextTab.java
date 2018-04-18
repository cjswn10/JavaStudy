package exam03;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextTab extends JPanel {

	JTextArea input;
	JTextArea output;
	
	public TextTab() {
		setLayout(new GridLayout(1, 2));
		input = new JTextArea();
		output = new JTextArea();
		output.setLineWrap(true);
		output.setBackground(Color.LIGHT_GRAY);
		
		JScrollPane scroll1 = new JScrollPane(input);
		JScrollPane scroll2 = new JScrollPane(output);
		
		add(scroll1);
		add(scroll2);
		
		input.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				output.setText(input.getText());
			}
		});
	}
}
