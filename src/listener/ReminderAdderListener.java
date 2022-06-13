package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import manager.PlanManager;
import manager.TaskPlan;

public class ReminderAdderListener implements ActionListener {

   JTextField fieldSubject;
   JTextField fieldDeadline;
   JTextField fieldPlan;
   
   PlanManager planManager;
   
   public ReminderAdderListener(JTextField fieldSubject, JTextField fieldDeadline, JTextField fieldPlan, PlanManager planManager) {

      this.fieldSubject = fieldSubject;
      this.fieldDeadline = fieldDeadline;
      this.fieldPlan = fieldPlan;
      this.planManager = planManager;
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println(fieldSubject.getText());
      System.out.println(fieldDeadline.getText());
      System.out.println(fieldPlan.getText());
      
      TaskPlan tp = new TaskPlan();
      tp.setSubject(fieldSubject.getText());
      tp.setDeadline(fieldDeadline.getText());
      tp.setWyd(fieldPlan.getText());
      planManager.addReminder(tp);
      putObject(planManager, "PlanManager.ser");
      tp.printInfo();
          
   }
    
   public static void putObject(PlanManager planManager, String filename) {
      try {
         FileOutputStream file = new FileOutputStream(filename);
         ObjectOutputStream out = new ObjectOutputStream(file);
         
         out.writeObject(planManager);
         
         out.close();
         file.close();
         
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         
      }
      
   }

}
