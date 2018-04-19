package exam05;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {
	JTextArea jta;
	JTextField jtf;

	public ChatClient() {
		jta = new JTextArea(10, 10);
		JScrollPane jsp = new JScrollPane(jta);
		JPanel p1 = new JPanel();
		jtf = new JTextField(30);
		JButton btn = new JButton("ют╥б");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					
					Socket socket_c = new Socket("203.236.209.115", 1993);
					OutputStream os = socket_c.getOutputStream();

					String msg = jtf.getText();
					os.write(msg.getBytes());

					os.close();
					socket_c.close();

				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				
			}
		});

		p1.add(jtf);
		p1.add(btn);

		add(jsp, BorderLayout.CENTER);
		add(p1, BorderLayout.SOUTH);

		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatClient();

	}

}