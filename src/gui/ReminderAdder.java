package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ReminderAdder extends JFrame {
	
	public ReminderAdder () {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject  = new JLabel("Subject", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelDeadline  = new JLabel("Deadline", JLabel.TRAILING);
		JTextField fieldDeadline = new JTextField(10);
		labelSubject.setLabelFor(fieldDeadline);
		panel.add(labelDeadline);
		panel.add(fieldDeadline);
		
		JLabel labelPlan  = new JLabel("Plan", JLabel.TRAILING);
		JTextField fieldPlan = new JTextField(10);
		labelSubject.setLabelFor(fieldPlan);
		panel.add(labelPlan);
		panel.add(fieldPlan);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
	

}
