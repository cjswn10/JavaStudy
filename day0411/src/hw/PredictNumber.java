package hw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PredictNumber extends JFrame implements ActionListener {
	int com;
	int user_num;
	int count;
	JTextField user;
	JTextField result;
	JLabel cnt;
	JButton retry;
	
	public PredictNumber(String title) {
		super(title);

		Random r = new Random();
		com = r.nextInt(100) + 1;

		setLayout(new BorderLayout());
		JPanel top = new JPanel();
		JPanel center = new JPanel();
		JPanel bottom = new JPanel();
		add(top, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(bottom, BorderLayout.SOUTH);

		JLabel l_num = new JLabel("���ڸ� �����ϼ���");
		user = new JTextField(10);
		top.add(l_num);
		top.add(user);

		result = new JTextField(10);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBackground(Color.YELLOW);
		
		cnt = new JLabel("");
		
		center.add(result);
		center.add(cnt);

		retry = new JButton("����");
		retry.setBackground(Color.decode("#BDBDBD"));
		retry.addActionListener(this);
		JButton exit = new JButton("����");
		exit.setBackground(Color.decode("#BDBDBD"));
		exit.addActionListener(this);

		bottom.add(retry);
		bottom.add(exit);

		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	 
		
		if (e.getActionCommand().equals("����")) {
			user_num = Integer.parseInt(user.getText());
			cnt.setText(++count + "��° �õ�");
			
			if (com == user_num) {
				result.setText("�����Դϴ�!!");
				result.setBackground(Color.YELLOW);
				retry.setEnabled(false);
			}
			else if (com < user_num) {
				result.setText("���ڰ� Ů�ϴ�");
				result.setBackground(Color.decode("#6799FF"));
			}
			else {
				result.setText("���ڰ� �۽��ϴ�");
				result.setBackground(Color.decode("#F15F5F"));
			}
		} else
			System.exit(0);
		
		if (count >= 7 && com != user_num) {
			result.setText("�����ϼ̽��ϴ�.");
			result.setBackground(Color.decode("#8C8C8C"));
			cnt.setText("���� : " + com);
			retry.setEnabled(false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PredictNumber("���ڰ���");
	}

}
