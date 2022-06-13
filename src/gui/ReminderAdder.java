package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ReminderAdderCancelListener;
import listener.ReminderAdderListener;
import manager.PlanManager;

public class ReminderAdder extends JPanel {
   
   WindowFrame frame;
   
   PlanManager planManager;
   
   public ReminderAdder (WindowFrame frame, PlanManager planManager) {
      this.frame = frame;
      this.planManager = planManager;
      
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
      
      JButton saveButton = new JButton("save");
      saveButton.addActionListener(new ReminderAdderListener(fieldSubject, fieldDeadline, fieldPlan, planManager));
      
      JButton cancelButton = new JButton("cancel");
      cancelButton.addActionListener(new ReminderAdderCancelListener(frame));
      
      panel.add(labelPlan);
      panel.add(fieldPlan);
      
      panel.add(saveButton);
      panel.add(cancelButton);
      
      SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
      
      this.add(panel);
      this.setVisible(true);
   }

}