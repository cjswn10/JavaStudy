package exam05;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ReadFileTest extends JFrame {
	JList<String> list;
	JTextArea jta;
	Vector<String> data;
	
	public ReadFileTest() {
	
		data = new Vector<String>();
		//파일 목록을 읽어와서 list에 담는다.
		loadFile();
		list = new JList<String>(data);		
		
		list.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
//					FileReader fr = new FileReader("C:\\javaStudy\\day0326\\" + list.getSelectedValue());
					BufferedReader br = new BufferedReader(new FileReader("C:\\javaStudy\\day0326\\" + list.getSelectedValue()));
					int str = 0;
					String r = "";
					while((str = br.read()) != -1) {
						r += (char)str;
					}
					jta.setText(r);
					br.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		jta = new JTextArea(20, 80);
		JScrollPane jsp = new JScrollPane(jta);
		JScrollPane jspList = new JScrollPane(list);
		
		//JFrame의 기본은 Borderlayout
		add(jspList, BorderLayout.WEST);
		add(jsp, BorderLayout.CENTER);
		
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void loadFile() {
		// TODO Auto-generated method stub
		File file = new File("C:\\javaStudy\\day0326");
		String[] fileList = file.list();
		for(String fname : fileList) {
			if(fname.contains(".java") && !(fname.contains(".bak")))
				data.add(fname);
		}
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReadFileTest();
	}

}
