package exam04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GrimpanFrame extends JFrame {
	GrimpanPanel grimpan;

	public GrimpanFrame() {
		// Frame은 기본이 borderlayout
		grimpan = new GrimpanPanel();
		add(grimpan);
		JMenuBar jmb = new JMenuBar();
		JMenu mn = new JMenu("그리기 도구");
		JMenuItem mn_line = new JMenuItem("선");
		JMenuItem mn_oval = new JMenuItem("원");
		JMenuItem mn_rect = new JMenuItem("사각형");

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

		mn.add(mn_line);
		mn.add(mn_oval);
		mn.add(mn_rect);

		jmb.add(mn);
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
