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
		v.add("��ȭ");
		v.add("��");
		v.add("ģ��");
		v.add("�ڽ�");
		v.add("������");
		v.add("��");
		v.add("�Ƿ�");
		v.add("��");
		v.add("�ǰ�");
		v.add("����");
		v.add("���");
		v.add("��");

		 jcb = new JComboBox<String>(v);
		add(jcb);
		tf = new JTextField(10);
		add(tf);
		jcb.addActionListener(this);
		//�͸�Ŭ����
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
