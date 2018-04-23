package hw;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ClientDB extends JFrame {
	JFrame f;
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	ClientDAO dao;
	
	public ClientDB() {

		f = this;
		dao= new ClientDAO();
		
		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("고객번호");
		colNames.add("이름");
		colNames.add("주민번호");
		colNames.add("주소");
		colNames.add("핸드폰번호");
		
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		select();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l_cno = new JLabel("고객번호");
		JLabel l_cname = new JLabel("이름");
		JLabel l_cjumin = new JLabel("주민번호");
		JLabel l_caddr = new JLabel("주소");
		JLabel l_cphone = new JLabel("핸드폰번호");
		JTextField t_cno = new JTextField(10);
		JTextField t_cname = new JTextField(10);
		JTextField t_cjumin = new JTextField(10);
		JTextField t_caddr = new JTextField(10);
		JTextField t_cphone = new JTextField(10);
		JButton btnAdd = new JButton("추가");

		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ClientVO cv = new ClientVO();
				cv.setCno(Integer.parseInt(t_cno.getText()));
				cv.setCname(t_cname.getText());
				cv.setCjumin(t_cjumin.getText());
				cv.setCaddr(t_caddr.getText());
				cv.setCphone(t_cphone.getText());
				
				int re = dao.insertClient(cv);
				if(re > 0) {
					JOptionPane.showMessageDialog(f, "추가 완료");
					select();
				}
				else
					JOptionPane.showMessageDialog(f, "추가 실패");
				
			}
		});
		
		p1.setLayout(new GridLayout(5, 2));
		p1.add(l_cno);
		p1.add(t_cno);
		p1.add(l_cname);
		p1.add(t_cname);
		p1.add(l_cjumin);
		p1.add(t_cjumin);
		p1.add(l_caddr);
		p1.add(t_caddr);
		p1.add(l_cphone);
		p1.add(t_cphone);

		p2.setLayout(new FlowLayout());
		p2.add(btnAdd);

		p2.add(jsp);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void select() {
		// TODO Auto-generated method stub
		rowData.clear();
		ArrayList<ClientVO> arr = new ArrayList<ClientVO>(); 
		arr = dao.selectAll();
		
		for(ClientVO cv : arr) {
			Vector<String> v = new Vector<String>();
			v.add(cv.getCno() + "");
			v.add(cv.getCname());
			v.add(cv.getCjumin());
			v.add(cv.getCaddr());
			v.add(cv.getCphone());
			
			rowData.add(v);
		}
		table.updateUI();
	}

	public static void main(String[] args) {

		new ClientDB();
	}

}