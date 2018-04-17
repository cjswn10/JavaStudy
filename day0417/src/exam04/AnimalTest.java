package exam04;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AnimalTest extends JFrame implements ActionListener {
	Icon icon_puppy;
	Icon icon_cat;
	Icon icon_turtle;
	Icon icon_squirrel;
	ButtonGroup am;

	public AnimalTest() {
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		JRadioButton btn_dog = new JRadioButton("강아지");
		JRadioButton btn_cat = new JRadioButton("고양이");
		JRadioButton btn_turtle = new JRadioButton("거북이");
		JRadioButton btn_squirrel = new JRadioButton("다람쥐");

		am = new ButtonGroup();
		am.add(btn_dog);
		am.add(btn_cat);
		am.add(btn_turtle);
		am.add(btn_squirrel);
		
		//패널2
		JLabel jlb = new JLabel();
		icon_puppy = new ImageIcon("puppy.jpg");
		icon_cat = new ImageIcon("cat.jpg");
		icon_turtle = new ImageIcon("turtle.jpg");
		icon_squirrel = new ImageIcon("squirrel.jpg");
		
		btn_dog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jlb.setIcon(icon_puppy);
			}
		});

		btn_cat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jlb.setIcon(icon_cat);
			}
		});

		btn_turtle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jlb.setIcon(icon_turtle);
			}
		});

		btn_squirrel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jlb.setIcon(icon_squirrel);
			}
		});
		
		p1.add(btn_dog);
		p1.add(btn_cat);
		p1.add(btn_turtle);
		p1.add(btn_squirrel);

		p2.add(jlb);

		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnimalTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
