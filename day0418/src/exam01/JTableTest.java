package exam01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTableTest extends JFrame {
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;

	JFrame f;

	public JTableTest() {
		f = this;
		setLayout(new GridLayout(2, 1));

		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수학");

		Vector<String> v1 = new Vector<String>();
		v1.add("임연주");
		v1.add("100");
		v1.add("100");
		v1.add("100");

		Vector<String> v2 = new Vector<String>();
		v2.add("정혜윤");
		v2.add("100");
		v2.add("90");
		v2.add("80");

		Vector<String> v3 = new Vector<String>();
		v3.add("정예은");
		v3.add("80");
		v3.add("100");
		v3.add("90");

		rowData.add(v1);
		rowData.add(v2);
		rowData.add(v3);

		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table); // JScrollPane으로 감싸야 colNames가 보임

		JPanel p_up = new JPanel();
		p_up.setBackground(Color.pink);

		JPanel p_up_1 = new JPanel();
		JPanel p_up_2 = new JPanel();

		p_up.setLayout(new BorderLayout());
		p_up.add(p_up_1, BorderLayout.CENTER);
		p_up.add(p_up_2, BorderLayout.SOUTH);

		p_up_1.setLayout(new GridLayout(4, 2));
		jtf_name = new JTextField(15);
		jtf_kor = new JTextField(15);
		jtf_eng = new JTextField(15);
		jtf_math = new JTextField(15);

		p_up_1.add(new JLabel("이름"));
		p_up_1.add(jtf_name);

		p_up_1.add(new JLabel("국어"));
		p_up_1.add(jtf_kor);
		p_up_1.add(new JLabel("영어"));
		p_up_1.add(jtf_eng);
		p_up_1.add(new JLabel("수학"));
		p_up_1.add(jtf_math);

		JButton btn_add = new JButton("추가");
		JButton btn_update = new JButton("수정");
		JButton btn_delete = new JButton("삭제");

		btn_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Vector<String> v = new Vector<String>();
				if (jtf_name.getText().equals("") || jtf_kor.getText().equals("") || jtf_eng.getText().equals("")
						|| jtf_math.getText().equals("")) {
					JOptionPane.showMessageDialog(f, "전체 칸을 입력하세요", "오류", JOptionPane.INFORMATION_MESSAGE);
				} else {
					v.add(jtf_name.getText());
					v.add(jtf_kor.getText());
					v.add(jtf_eng.getText());
					v.add(jtf_math.getText());
					rowData.add(v);

					jtf_name.setText("");
					jtf_kor.setText("");
					jtf_eng.setText("");
					jtf_math.setText("");
				}
				table.updateUI();

			}
		});

		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = table.getSelectedRow();
				System.out.println(row);
				jtf_name.setText(rowData.get(row).get(0));
				jtf_kor.setText(rowData.get(row).get(1));
				jtf_eng.setText(rowData.get(row).get(2));
				jtf_math.setText(rowData.get(row).get(3));
			}
		});

		btn_update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int row = table.getSelectedRow();

				if (row == -1 || row >= table.getRowCount()) {
					JOptionPane.showMessageDialog(f, "수정할 항목을 선택하세요", "오류", JOptionPane.ERROR_MESSAGE);
					return;
				} else {
					Vector<String> v = new Vector<String>();
					v.add(jtf_name.getText());
					v.add(jtf_kor.getText());
					v.add(jtf_eng.getText());
					v.add(jtf_math.getText());

					rowData.set(row, v);
					table.updateUI();
				}
			}
		});

		btn_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int idx = table.getSelectedRow();
				if (idx == -1 || idx >= table.getRowCount()) {
					JOptionPane.showMessageDialog(f, "삭제할 항목을 선택하세요", "오류", JOptionPane.ERROR_MESSAGE);
					return;
				} else {
					rowData.remove(idx);
					jtf_name.setText("");
					jtf_kor.setText("");
					jtf_eng.setText("");
					jtf_math.setText("");

					table.updateUI();
				}
			}
		});

		p_up_2.add(btn_add);
		p_up_2.add(btn_update);
		p_up_2.add(btn_delete);

		add(p_up);
		add(jsp);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTableTest();
	}

}
