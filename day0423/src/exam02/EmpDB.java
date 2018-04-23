package exam02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class EmpDB extends JFrame {

	JFrame f;

	JTextField field_Eno;
	JTextField field_Ename;
	JTextField field_Dno;
	JTextField field_Esal;
	JTextField field_Elevel;
	JTextField field_Ejumin;
	JTextField field_Eaddr;
	JTextField field_Ehiredate;

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	public EmpDB() {

		f = this;

		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		field_Eno = new JTextField(20);
		field_Ename = new JTextField(20);
		field_Dno = new JTextField(20);
		field_Esal = new JTextField(20);
		field_Elevel = new JTextField(20);
		field_Ejumin = new JTextField(20);
		field_Eaddr = new JTextField(20);
		field_Ehiredate = new JTextField(20);

		JLabel eNo = new JLabel("사원번호");
		JLabel eName = new JLabel("사원이름");
		JLabel dNo = new JLabel("부서번호");
		JLabel eSal = new JLabel("급여");
		JLabel eLevel = new JLabel("직책");
		JLabel eJumin = new JLabel("주민번호");
		JLabel eAddr = new JLabel("주소");
		JLabel eHiredate = new JLabel("입사일");

		colNames.add("사원번호");
		colNames.add("사원이름");
		colNames.add("부서번호");
		colNames.add("급여");
		colNames.add("직책");
		colNames.add("주민번호");
		colNames.add("주소");
		colNames.add("입사일");

		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		JPanel jPanel_top = new JPanel();

		jPanel_top.setLayout(new GridLayout(8, 2));

		jPanel_top.add(eNo);
		jPanel_top.add(field_Eno);

		jPanel_top.add(eName);
		jPanel_top.add(field_Ename);

		jPanel_top.add(dNo);
		jPanel_top.add(field_Dno);

		jPanel_top.add(eSal);
		jPanel_top.add(field_Esal);

		jPanel_top.add(eLevel);
		jPanel_top.add(field_Elevel);

		jPanel_top.add(eJumin);
		jPanel_top.add(field_Ejumin);

		jPanel_top.add(eAddr);
		jPanel_top.add(field_Eaddr);

		jPanel_top.add(eHiredate);
		jPanel_top.add(field_Ehiredate);

		JButton jButton_add = new JButton("추가");

		jButton_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EmpVO ev = new EmpVO();
				ev.setEno(Integer.parseInt(field_Eno.getText()));
				ev.setEname(field_Ename.getText());
				ev.setDno(Integer.parseInt(field_Dno.getText()));
				ev.setEsal(Integer.parseInt(field_Esal.getText()));
				ev.setElevel(field_Elevel.getText());
				ev.setEjumin(field_Ejumin.getText());
				ev.setEaddr(field_Eaddr.getText());
				ev.setEhiredate(field_Ehiredate.getText());
				
				EmpDAO dao = new EmpDAO();
				int re = dao.insertEmp(ev);
				if(re > 0) 
					JOptionPane.showMessageDialog(f, "추가 완료");
				else
					JOptionPane.showMessageDialog(f, "추가 실패");
			}
		});

		JPanel jPanel_mid = new JPanel();
		jPanel_mid.add(jButton_add);

		JPanel jPanel_fildbtn = new JPanel();
		jPanel_fildbtn.setLayout(new BorderLayout());

		jPanel_fildbtn.add(jPanel_top, BorderLayout.CENTER);
		jPanel_fildbtn.add(jPanel_mid, BorderLayout.SOUTH);

		add(jPanel_fildbtn, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		

		setSize(600, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpDB();
	}

}
