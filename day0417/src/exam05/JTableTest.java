package exam05;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {

	String[] colNames = { "이름", "국어", "영어", "수학" };
	String[][] rowData = {
			{ "이현진", "100", "100", "100" },
			{ "한상협", "80", "90", "100" },
			{ "조성재", "90", "80", "100" }};

	public JTableTest() {
		JTable table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);	//테이블은 JScrollPane에 담아야함
		
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
