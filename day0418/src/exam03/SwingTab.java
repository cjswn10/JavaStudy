package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingTab extends JPanel {

	public SwingTab() {
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		JRadioButton r_check = new JRadioButton("JCheckBox");
		JRadioButton r_btn = new JRadioButton("JButton");
		JRadioButton r_com = new JRadioButton("JComboBox");
		JRadioButton r_jl = new JRadioButton("JLabel");

		ButtonGroup radio = new ButtonGroup();
		radio.add(r_check);
		radio.add(r_btn);
		radio.add(r_com);
		radio.add(r_jl);

		JTextField text = new JTextField(30);

		r_check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(r_check.getText());
			}
		});

		r_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(r_btn.getText());
			}
		});

		r_com.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(r_com.getText());
			}
		});

		r_jl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(r_jl.getText());
			}
		});

		p1.add(r_check);
		p1.add(r_btn);
		p1.add(r_com);
		p1.add(r_jl);

		p2.add(text);

	}
}
