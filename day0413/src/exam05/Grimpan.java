package exam05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Grimpan extends JFrame {
	GraphicPanel lp;
	JTextArea ta;
	JFrame f;
	JFileChooser jfc = new JFileChooser("c:/temp");
	File file;
	boolean isChanged = false;

	public Grimpan() {
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("�׸��� ����");
		JMenu m3 = new JMenu("�׸��� ����");

		JMenuItem m1_new = new JMenuItem("������");
		JMenuItem m1_open = new JMenuItem("����");
		JMenuItem m1_save = new JMenuItem("����");
		JMenuItem m1_saveRename = new JMenuItem("�ٸ� �̸����� ����");
		JMenuItem m1_exit = new JMenuItem("����");

		JMenuItem m2_line = new JMenuItem("��");
		JMenuItem m2_oval = new JMenuItem("��");
		JMenuItem m2_rect = new JMenuItem("�簢��");

		JMenuItem m3_red = new JMenuItem("����");
		JMenuItem m3_blue = new JMenuItem("�Ķ�");
		JMenuItem m3_black = new JMenuItem("����");

		// ���ϸ޴� ActionListener
		m1_new.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (ta.getText().trim().length() > 0) {
					int re = -1;
					if (isChanged)
						re = JOptionPane.showConfirmDialog(f, "����� ������ �����Ͻðڽ��ϱ�?", "Ȯ��",
								JOptionPane.YES_NO_CANCEL_OPTION);

					System.out.println("new " + re);
					if (re == 0) {
						saveFile();
						file = null;
						ta.setText("");
					} else if (re == 1) {
						file = null;
						ta.setText("");
					}
				} else
					ta.setText("");
			}
		});

		//
		m1_open.addActionListener(new ActionListener() {

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

		m1_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saveFile();
			}
		});

		m1_saveRename.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				file = null;
				saveFile();
			}
		});

		m1_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		//
		// �׸��⵵�� ActionListener
		//
		m2_line.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawType = 0;
			}
		});

		m2_oval.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawType = 1;
			}
		});

		m2_rect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawType = 2;
			}
		});

		
		m3_black.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.BLACK;
			}
		});

		m3_red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.RED;
			}
		});

		m3_blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.BLUE;
			}
		});

		m1.add(m1_new);
		m1.add(m1_open);
		m1.add(m1_save);
		m1.add(m1_saveRename);
		m1.add(m1_exit);

		m2.add(m2_line);
		m2.add(m2_oval);
		m2.add(m2_rect);

		m3.add(m3_red);
		m3.add(m3_blue);
		m3.add(m3_black);

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);

		setJMenuBar(mb);

		lp = new GraphicPanel();

		setLayout(new BorderLayout());
		add(lp, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	protected void saveFile() {
		int re = -1;
		if (file == null) { // ó�� ����
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
		new Grimpan();
	}

}
