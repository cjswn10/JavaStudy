package exam07;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NewChat extends JFrame implements Runnable{

	JPanel p1;
	JPanel p2;
	JTextField jtf;
	JButton jbt;
	JTextArea jta;
	
	OutputStream os;
	InputStream is;
	public NewChat() {
		
		// TODO Auto-generated constructor stub
		p1 = new JPanel();
		p2 = new JPanel();
		jtf = new JTextField(30);
		jbt = new JButton("º¸³»±â");
		
		try {
			Socket socket = new Socket("203.236.209.115", 1994);
			//os = socket.getOutputStream();
			os = socket.getOutputStream();
			is = socket.getInputStream();
			
			(new Thread(this)).start();
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			byte[] data = new byte[100];
			try {
				is.read(data);
				jta.append(new String(data) + "\n");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	

}
