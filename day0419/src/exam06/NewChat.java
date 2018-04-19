package exam06;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NewChat extends JFrame {

	JPanel p1;
	JPanel p2;
	JTextField jtf;
	JButton jbt;
	JTextArea jta;
	
	OutputStream os;
	public NewChat() {
		
		// TODO Auto-generated constructor stub
		p1 = new JPanel();
		p2 = new JPanel();
		jtf = new JTextField(30);
		jbt = new JButton("º¸³»±â");
		
		try {
			Socket socket = new Socket("203.236.209.115", 192);
			//os = socket.getOutputStream();
			os = socket.getOutputStream();
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//jta.setText(jtf.getText());	
					
					try {
						String msg = jtf.getText();						
						os.write(msg.getBytes());								
						//os.close();
					
					}catch (Exception ex) {
						// TODO: handle exception
						System.out.println(ex.getMessage());
					}
					
				
			}
		});
		jta = new JTextArea(30,30);
		
		JScrollPane jsp = new JScrollPane(jta);
		
		p1.add(jsp);
		p2.add(jtf);
		p2.add(jbt);
				
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NewChat();
	}
	

}
