package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.Plan;
import manager.PlanManager;

public class ReminderViewer extends JPanel	{

	WindowFrame frame;
	
	PlanManager PlanManager;


	public ReminderViewer(WindowFrame frame, PlanManager PlanManager) {
		this.frame = frame;
		this.PlanManager = PlanManager;
		
		System.out.println("***" + PlanManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Subject");
		model.addColumn("Deadline");
		model.addColumn("Plan");		
		
		for(int i=0; i< PlanManager.size(); i++) {
			Vector<Object> row = new Vector();
			Plan tp = PlanManager.get(i); 
			row.add(tp.getsubject());
			row.add(tp.getDeadline());
			row.add(tp.getWyd());
			model.addRow(row);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		
		this.add(sp);

	}
}
