package exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmpTest extends JFrame{
	JTextField jtf_eno;
	JTextField jtf_ename;
	JTextField jtf_sal;
	JTextField jtf_comm;
	JTextField jtf_hiredate;
	JTextField jtf_jumin;
	JTextField jtf_dno;
	JTextField jtf_position;
	JTextField jtf_addr;
	JTextField jtf_mgr;
	JTextField jtf_email;

	JFrame f;
	
	public EmpTest(){
		f = this;
		jtf_eno = new JTextField(15);
		jtf_ename = new JTextField(15);
		jtf_sal = new JTextField(15);
		jtf_comm = new JTextField(15);
		jtf_hiredate = new JTextField(15);
		jtf_jumin = new JTextField(15);
		jtf_dno = new JTextField(15);
		jtf_position = new JTextField(15);
		jtf_addr = new JTextField(15);
		jtf_mgr = new JTextField(15);
		jtf_email = new JTextField(15);
		
		JPanel pCenter  = new JPanel();
		pCenter.setLayout(new GridLayout(11, 2));
		
		pCenter.add(new Label("�����ȣ:"));
		pCenter.add(jtf_eno);
		pCenter.add(new Label("����̸�:"));
		pCenter.add(jtf_ename);
		pCenter.add(new Label("�޿�:"));
		pCenter.add(jtf_sal);
		pCenter.add(new Label("����:"));
		pCenter.add(jtf_comm);
		pCenter.add(new Label("�Ի���:"));
		pCenter.add(jtf_hiredate);
		pCenter.add(new Label("�ֹι�ȣ:"));
		pCenter.add(jtf_jumin);
		pCenter.add(new Label("�μ���ȣ:"));
		pCenter.add(jtf_dno);
		pCenter.add(new Label("��å:"));
		pCenter.add(jtf_position);
		pCenter.add(new Label("�ּ�:"));
		pCenter.add(jtf_addr);
		pCenter.add(new Label("�����ڹ�ȣ:"));
		pCenter.add(jtf_mgr);
		pCenter.add(new Label("�̸���:"));
		pCenter.add(jtf_email);
		
		
		JPanel pSouth = new JPanel();
		JButton btnInsert = new JButton("�߰�");
		pSouth.add(btnInsert);

		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EmpVO ev = new EmpVO();
				ev.setEno(Integer.parseInt(jtf_eno.getText()));
				ev.setEname(jtf_ename.getText());
				ev.setSal(Integer.parseInt(jtf_sal.getText()));
				ev.setComm(Integer.parseInt(jtf_comm.getText()));
				ev.setHiredate(jtf_hiredate.getText());
				ev.setJumin(jtf_jumin.getText());
				ev.setDno(Integer.parseInt(jtf_dno.getText()));
				ev.setPosition(jtf_position.getText());
				ev.setAddr(jtf_addr.getText());
				ev.setMgr(Integer.parseInt(jtf_mgr.getText()));
				ev.setEmail(jtf_ename.getText());
				
				EmpDAO dao = new EmpDAO();
				int re = dao.insertEmp(ev);
				if(re == 1)
					JOptionPane.showMessageDialog(f, "�߰� �Ϸ�");
				else
					JOptionPane.showMessageDialog(f, "�߰� ����");
				
			}
		});
		
		
		add(pCenter, BorderLayout.CENTER);
		add(pSouth, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpTest();
		
	}

}
