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
	JFrame f;	//"�����Ͻðڽ��ϱ�?", �����ϰų� ������ �� ������ �����ϱ� ���� ����
	JTextArea ta;
	// ������ ���ų� ������ �� �����ִ� ���̾�α�
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
			
		
		f = this; // BitNote�� this��°� �˷��ֱ� ���� ����(BitNote�� �޼��尡 �ƴ϶� this�� ��)

		
		add(ta);
		JScrollPane jsp = new JScrollPane(ta);
		add(jsp);

		JMenuBar mb = new JMenuBar();
		JMenu mn = new JMenu("����");

		JMenuItem item_new = new JMenuItem("������");
		JMenuItem item_open = new JMenuItem("����");
		JMenuItem item_save = new JMenuItem("����");
		JMenuItem item_saveRename = new JMenuItem("�ٸ� �̸����� ����");
		JMenuItem item_exit = new JMenuItem("����");

		item_new.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// Ȯ�� ���̾�α� ��: 0, �ƴϿ�: 1, ���:2
				
				
				
				if (ta.getText().trim().length() > 0) {	//�޸��忡 ��ĭ�� ���ְ� ������ �ֳ� Ȯ��
					int re = -1;
					//����� ������ ���� �� isChanged�� true�� ��
					if(isChanged)
						re = JOptionPane.showConfirmDialog(f, "����� ������ �����Ͻðڽ��ϱ�?", "Ȯ��", JOptionPane.YES_NO_CANCEL_OPTION);
					
//					re = JOptionPane.showConfirmDialog(f, "�����Ͻðڽ��ϱ�?", "Ȯ��", JOptionPane.YES_NO_CANCEL_OPTION);
					System.out.println("new " + re);
					if (re == 0) { // ��-> ����
						saveFile();
						file = null;
						ta.setText("");
					} else if (re == 1) { // �ƴϿ�->����x
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

				// if (title.equals("")) { // ó������
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
		if (file == null) {	//ó�� ����
			re = jfc.showSaveDialog(f);
			file = jfc.getSelectedFile();
			System.out.println("save " + re); // ����: 0, ���: 1
		} else
			re = 0;

		if (re == 0) {
			try {
				file = jfc.getSelectedFile();

				FileWriter fw = new FileWriter(file);
				fw.write(ta.getText());
				fw.close(); // file�� ����ϸ� �ݾ������
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
