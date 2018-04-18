package exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FileDelTest extends JFrame {
	JFrame f;
	
	public FileDelTest() {
		f = this;
		setLayout(new FlowLayout());
		JButton btn = new JButton("삭제");
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				File file = new File("C:\\javaStudy\\day0320\\Hello2.java");
				boolean re = file.delete();
				if(re) {
					JOptionPane.showMessageDialog(f, "파일을 삭제하였습니다.", "확인", JOptionPane.INFORMATION_MESSAGE);
					
				} else
					JOptionPane.showMessageDialog(f, "파일을 삭제 실패!", "확인", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		
		add(btn);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileDelTest();
	}

}
