package exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BitNote extends JFrame {
	JFrame f;	//"저장하시겠습니까?", 저장하거나 열기할 때 파일을 선택하기 위한 변수
	JTextArea ta;
	// 파일을 열거나 저장할 때 쓸수있는 다이얼로그
	JFileChooser jfc = new JFileChooser("c:/temp");
//	String title;
	File file;
	boolean isChanged = false;
	
	public BitNote() {
		ta = new JTextArea();
		ta.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				isChanged = true;
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
			
		
		f = this; // BitNote가 this라는걸 알려주기 위한 변수(BitNote가 메서드가 아니라 this를 모름)

		
		add(ta);
		JScrollPane jsp = new JScrollPane(ta);
		add(jsp);

		JMenuBar mb = new JMenuBar();
		JMenu mn = new JMenu("파일");

		JMenuItem item_new = new JMenuItem("새파일");
		JMenuItem item_open = new JMenuItem("열기");
		JMenuItem item_save = new JMenuItem("저장");
		JMenuItem item_saveRename = new JMenuItem("다른 이름으로 저장");
		JMenuItem item_exit = new JMenuItem("종료");

		item_new.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 확인 다이얼로그 예: 0, 아니오: 1, 취소:2
				
				
				
				if (ta.getText().trim().length() > 0) {	//메모장에 빈칸을 없애고 내용이 있나 확인
					int re = -1;
					//변경된 내용이 있을 때 isChanged가 true일 때
					if(isChanged)
						re = JOptionPane.showConfirmDialog(f, "변경된 내용을 저장하시겠습니까?", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
					
//					re = JOptionPane.showConfirmDialog(f, "저장하시겠습니까?", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
					System.out.println("new " + re);
					if (re == 0) { // 예-> 저장
						saveFile();
						file = null;
						ta.setText("");
					} else if (re == 1) { // 아니오->저장x
						file = null;
						ta.setText("");
					}
				} else
					ta.setText("");
			}
		});

		//
		item_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int re = jfc.showOpenDialog(f);
				file = jfc.getSelectedFile();
				if (re == 0) {
					try {
						
						FileReader fr = new FileReader(file);
						int ch;
						String str = "";

						while ((ch = fr.read()) != -1) {
							str += (char) ch;
						}
						ta.setText(str);
						fr.close();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		});

		item_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saveFile();
				//				title = jfc.getSelectedFile().getName();
//				System.out.println(title);

				// if (title.equals("")) { // 처음저장
				// saveFile();
				// } else {
//				try {
//					FileWriter fw = new FileWriter("c:/temp/" + title);
//					fw.write(ta.getText());
//					fw.close();
//				} catch (Exception ex) {
//					System.out.println(ex.getMessage());
//				}
				// }
			}
		});

		item_saveRename.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				file = null;
				saveFile();
			}
		});

		item_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		mn.add(item_new);
		mn.add(item_open);
		mn.add(item_save);
		mn.add(item_saveRename);
		mn.add(item_exit);

		mb.add(mn);
		setJMenuBar(mb);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	protected void saveFile() {
		int re = -1;
		if (file == null) {	//처음 저장
			re = jfc.showSaveDialog(f);
			file = jfc.getSelectedFile();
			System.out.println("save " + re); // 저장: 0, 취소: 1
		} else
			re = 0;

		if (re == 0) {
			try {
				file = jfc.getSelectedFile();

				FileWriter fw = new FileWriter(file);
				fw.write(ta.getText());
				fw.close(); // file을 사용하면 닫아줘야함
				isChanged = false;

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BitNote();
	}

}
