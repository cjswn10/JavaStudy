package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MenuTest extends JFrame {

	public MenuTest() {
		JMenuBar mb = new JMenuBar();
		JMenu mn = new JMenu("����");

		JMenuItem item1 = new JMenuItem("������");
		JMenuItem item2 = new JMenuItem("����");
		JMenuItem item3 = new JMenuItem("����");
		JMenuItem item4 = new JMenuItem("�ٸ� �̸����� ����");
		JMenuItem item5 = new JMenuItem("����");

		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getActionCommand());
				
			}
		});

		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getActionCommand());

			}
		});

		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getActionCommand());

			}
		});

		item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getActionCommand());

			}
		});
		
		item5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		mn.add(item1);
		mn.add(item2);
		mn.add(item3);
		mn.add(item4);
		mn.add(item5);

		mb.add(mn);
		setJMenuBar(mb);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuTest();
	}

}
