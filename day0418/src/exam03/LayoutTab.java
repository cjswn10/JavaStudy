package exam03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutTab extends JPanel {

	public LayoutTab() {
		JComboBox<String> cb = new JComboBox<>();

		cb.addItem("Flow Layout");
		cb.addItem("Grid Layout");
		cb.addItem("Border Layout");
		cb.addItem("Card Layout");

		JTextField text = new JTextField(40);
		
		cb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(cb.getSelectedItem().toString());
			}
		});

		

		add(cb);
		add(text);
	}
}
