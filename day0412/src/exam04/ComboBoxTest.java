package exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ComboBoxTest extends JFrame implements ActionListener{
	JTextField tf;
	JComboBox<String> jcb;
	
	public ComboBoxTest() {
		setLayout(new FlowLayout());

		Vector<String> v = new Vector<String>();
		v.add("평화");
		v.add("잠");
		v.add("친구");
		v.add("자신");
		v.add("와이프");
		v.add("돈");
		v.add("권력");
		v.add("명예");
		v.add("건강");
		v.add("가족");
		v.add("사랑");
		v.add("꿈");

		 jcb = new JComboBox<String>(v);
		add(jcb);
		tf = new JTextField(10);
		add(tf);
		jcb.addActionListener(this);
		//익명클래스
//		jcb.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				tf.setText(jcb.getSelectedItem().toString());
//			}
//		});

		

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			tf.setText(jcb.getSelectedItem() + "");
		
	}
}
