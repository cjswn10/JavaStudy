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
		JButton btn_read = new JButton("읽기");
		JButton btn_save = new JButton("저장");
	
		btn_read.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					URL url = new URL(user_url.getText());
					InputStream is = url.openStream();
					
					//인코딩 방법1
					Reader r = new InputStreamReader(is, "utf-8");	//한글 인식되게 인코딩

					int ch;
					String content = "";
					while((ch = r.read()) != -1) {	//read는 아스키 숫자값을 가져옴 
						content += (char)ch;
					}
					jta.setText(content);		
					
					
					//인코딩 방법2(선생님)
//					byte[] data = new byte[100];
//					StringBuffer sb = new StringBuffer();
//					//바이트 배열이 100개 있음
//					while(is.read(data) != -1) {
//						String str = new String(data, "utf-8");
//						sb.append(str);
//						Arrays.fill(data, (byte)0);	//data를 0으로 채워줘
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
				JFileChooser jfc = new JFileChooser("C:/temp");	// 경로에서   \\ = /	같은것
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
