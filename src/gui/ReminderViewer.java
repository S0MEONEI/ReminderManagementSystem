package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReminderViewer extends JFrame	{

	public ReminderViewer() {
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Subject");
		model.addColumn("Deadline");
		model.addColumn("Plan");		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
