package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class URLFrame extends JFrame {
	JTextField user_url;
	JTextArea jta;
	JFrame f;
	
	public URLFrame() {
		f = this;
		JPanel p1 = new JPanel();
		user_url = new JTextField(30);
		JButton btn_read = new JButton("�б�");
		JButton btn_save = new JButton("����");
	
		btn_read.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					URL url = new URL(user_url.getText());
					InputStream is = url.openStream();
					
					//���ڵ� ���1
					Reader r = new InputStreamReader(is, "utf-8");	//�ѱ� �νĵǰ� ���ڵ�

					int ch;
					String content = "";
					while((ch = r.read()) != -1) {	//read�� �ƽ�Ű ���ڰ��� ������ 
						content += (char)ch;
					}
					jta.setText(content);		
					
					
					//���ڵ� ���2(������)
//					byte[] data = new byte[100];
//					StringBuffer sb = new StringBuffer();
//					//����Ʈ �迭�� 100�� ����
//					while(is.read(data) != -1) {
//						String str = new String(data, "utf-8");
//						sb.append(str);
//						Arrays.fill(data, (byte)0);	//data�� 0���� ä����
//					}
//					jta.setText(sb.toString());
					
					is.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
			}
		});
		
		btn_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser jfc = new JFileChooser("C:/temp");	// ��ο���   \\ = /	������
				int re = jfc.showSaveDialog(f);
				if(re == JFileChooser.APPROVE_OPTION)	{
					File file = jfc.getSelectedFile();
					try {
						FileWriter fw = new FileWriter(file);
						fw.write(jta.getText());
						fw.close();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					} 
				}
					
			}
		});
		
		
		
		p1.add(user_url);
		p1.add(btn_read);
		p1.add(btn_save);

		jta = new JTextArea(50, 50);
		JScrollPane jsp = new JScrollPane(jta);
		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(800, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new URLFrame();
	}

}
