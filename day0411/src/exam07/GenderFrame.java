package exam07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GenderFrame extends JFrame implements ActionListener{
	private JTextField gender;
	
	public GenderFrame() {
		setLayout(new FlowLayout());
		
		JButton woman = new JButton("여자");
		woman.addActionListener(this);
		
		JButton man = new JButton("남자");
		man.addActionListener(this);
		
		gender = new JTextField(10);
		
		add(woman);
		add(man);
		add(gender);
		
		setSize(400, 200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String wm = e.getActionCommand();
		gender.setText("당신은 " + wm + "입니다.");
	}
}
