package exam05;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {

	String[] colNames = { "�̸�", "����", "����", "����" };
	String[][] rowData = {
			{ "������", "100", "100", "100" },
			{ "�ѻ���", "80", "90", "100" },
			{ "������", "90", "80", "100" }};

	public JTableTest() {
		JTable table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);	//���̺��� JScrollPane�� ��ƾ���
		
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
