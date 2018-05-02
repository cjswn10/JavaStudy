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
		
		pCenter.add(new Label("사원번호:"));
		pCenter.add(jtf_eno);
		pCenter.add(new Label("사원이름:"));
		pCenter.add(jtf_ename);
		pCenter.add(new Label("급여:"));
		pCenter.add(jtf_sal);
		pCenter.add(new Label("수당:"));
		pCenter.add(jtf_comm);
		pCenter.add(new Label("입사일:"));
		pCenter.add(jtf_hiredate);
		pCenter.add(new Label("주민번호:"));
		pCenter.add(jtf_jumin);
		pCenter.add(new Label("부서번호:"));
		pCenter.add(jtf_dno);
		pCenter.add(new Label("직책:"));
		pCenter.add(jtf_position);
		pCenter.add(new Label("주소:"));
		pCenter.add(jtf_addr);
		pCenter.add(new Label("관리자번호:"));
		pCenter.add(jtf_mgr);
		pCenter.add(new Label("이메일:"));
		pCenter.add(jtf_email);
		
		
		JPanel pSouth = new JPanel();
		JButton btnInsert = new JButton("추가");
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
					JOptionPane.showMessageDialog(f, "추가 완료");
				else
					JOptionPane.showMessageDialog(f, "추가 실패");
				
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
