package exam01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//���� �߰��Ҳ���
public class GrimpanFrame extends JFrame  {
	GrimpanPanel grimpan;
	JFileChooser jfc;
	JFrame f;
	JColorChooser jcc;

	public GrimpanFrame() {
		f = this;
		grimpan = new GrimpanPanel();
		add(grimpan);

		jfc = new JFileChooser("c:/temp"); // �⺻ ���丮
		jcc = new JColorChooser(Color.BLACK);
		
		JMenuBar jmb = new JMenuBar();

		// ���ϸ޴� �߰�
		JMenu mn_file = new JMenu("����");
		JMenuItem file_new = new JMenuItem("������");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		JMenuItem file_exit = new JMenuItem("����");

		file_new.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.list.clear();
				grimpan.repaint();
			}
		});

		file_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int re = jfc.showOpenDialog(f);
				try {
					if (re == JFileChooser.APPROVE_OPTION) {
						File file = jfc.getSelectedFile();
						FileInputStream fis = new FileInputStream(file);
						ObjectInputStream ois = new ObjectInputStream(fis);

						grimpan.list = (ArrayList<GraphicInfo>) ois.readObject();
						grimpan.repaint();
						
						ois.close();
					}
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					System.out.println(ex.getMessage());
				}

			}
		});

		file_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int re = jfc.showSaveDialog(f); // this��� �ϸ� ������ ���̶� GrimpanFrame���� ���� ����.
				// ����� ����
				try {
					if (re == JFileChooser.APPROVE_OPTION) {
						File file = jfc.getSelectedFile();
						FileOutputStream fos = new FileOutputStream(file);
						ObjectOutputStream oos;
						oos = new ObjectOutputStream(fos);
						oos.writeObject(grimpan.list);
						oos.close();
					}
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					System.out.println(ex.getMessage());
				}

			}
		});

		file_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JMenu mn = new JMenu("�׸��� ����");
		JMenuItem mn_line = new JMenuItem("��");
		JMenuItem mn_oval = new JMenuItem("��");
		JMenuItem mn_rect = new JMenuItem("�簢��");

		mn_line.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.drawType = 0;
			}
		});

		mn_oval.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.drawType = 1;
			}
		});

		mn_rect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.drawType = 2;
			}
		});

		JMenu mn_color = new JMenu("�׸��� ����");
		JMenuItem color_red = new JMenuItem("����");
		JMenuItem color_green = new JMenuItem("�ʷ�");
		JMenuItem color_black = new JMenuItem("����");
		
		JMenuItem color_dlg = new JMenuItem("�ٸ�����...");
		
		

		color_red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.drawColor = Color.red;
			}
		});

		color_green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.drawColor = Color.green;
			}
		});

		color_black.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.drawColor = Color.black;
			}
		});

		color_dlg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grimpan.drawColor = jcc.showDialog(f, "������ �����ϼ���", Color.RED);
			}
		});
		
		
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		mn_file.add(file_exit);

		mn.add(mn_line);
		mn.add(mn_oval);
		mn.add(mn_rect);

		mn_color.add(color_red);
		mn_color.add(color_green);
		mn_color.add(color_black);
		mn_color.add(color_dlg);

		jmb.add(mn_file);
		jmb.add(mn);
		jmb.add(mn_color);
		setJMenuBar(jmb);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GrimpanFrame();
	}

}
