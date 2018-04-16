package exam09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame implements ActionListener {
	JTextField display;
	int op1;
	int op2;
	String op;
	int r;
	
	public CalculatorFrame() {
		setLayout(new BorderLayout());

		display = new JTextField();
		JPanel p2 = new JPanel();
		
		add(display, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		display.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.CYAN);

		p2.setLayout(new GridLayout(4, 4));
		String[] cal = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "C", "=", "/" };
		JButton[] btn = new JButton[cal.length];

		for (int i = 0; i < 16; i++) {
			btn[i] = new JButton(cal[i]);
			p2.add(btn[i]);
			btn[i].addActionListener(this);
		}

		setSize(200, 250);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();
		
		if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
			op1 = Integer.parseInt(display.getText());
			op = cmd;
			display.setText("");
			
		} else if (cmd.equals("=") ) {
			op2 = Integer.parseInt(display.getText());
			switch(op)
			{
			case "+": 
				r = op1 + op2;
				break;
			case "-": 
				r = op1 - op2;
				break;
			case "*": 
				r = op1 * op2;
				break;
			case "/": 
				r = op1 / op2;
				break;
			}
			display.setText(r + "");
		} else if (cmd.equals("C")) {
			display.setText("");
		}
		else {
			display.setText(display.getText() + cmd);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculatorFrame();
	}

}
