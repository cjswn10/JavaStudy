package exam02;

import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OutputTab extends JPanel {
	
	public OutputTab() {

		
		Vector<String> cols = new Vector<String>();
		cols.add("�̸�");
		cols.add("����");
		cols.add("����");
		cols.add("����");
		
		Vector<Vector<String>> rows = new Vector<Vector<String>>();
		
		Vector<String> row1 = new Vector<String>();
		row1.add("�ӿ���");
		row1.add("100");
		row1.add("100");
		row1.add("100");
		
		Vector<String> row2 = new Vector<String>();
		row2.add("������");
		row2.add("90");
		row2.add("80");
		row2.add("100");
		
		Vector<String> row3 = new Vector<String>();
		row3.add("������");
		row3.add("70");
		row3.add("100");
		row3.add("100");
		
		rows.add(row1);
		rows.add(row2);
		rows.add(row3);
		
		add(new JScrollPane(new JTable(rows, cols)));
		
		
	}
}
