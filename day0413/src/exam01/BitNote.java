package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BitNote extends JFrame {
	JTextArea ta;

	public BitNote() {

		ta = new JTextArea();
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
				ta.setText("");

			}
		});

		item_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					FileReader fr = new FileReader("c:/temp/bit.txt");
					int ch;
					String str = "";
					
					while ((ch = fr.read()) != -1) {
						str += (char)ch;
					}
					ta.setText(str);
					fr.close();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});

		item_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					FileWriter fw = new FileWriter("c:/temp/bit.txt");
					fw.write(ta.getText());
					fw.close(); // file을 사용하면 닫아줘야함

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});

		item_saveRename.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getActionCommand());

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BitNote();
	}

}
