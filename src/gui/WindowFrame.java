package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PlanManager;

public class WindowFrame extends JFrame{
   
   PlanManager PlanManager;
   
   MenuSelection menuselection;
   ReminderAdder reminderadder;
   ReminderViewer reminderviewer;
   
   public WindowFrame(PlanManager PlanManager) {
      
      this.setSize(500, 300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("My Frame");
      
      this.PlanManager = PlanManager;
      menuselection = new MenuSelection(this);
      reminderadder = new ReminderAdder(this, this.PlanManager);
      reminderviewer = new ReminderViewer();
      

      this.add(menuselection);
      
      this.setVisible(true);
   }

   
   public void setupPanel(JPanel panel) {
      this.getContentPane().removeAll();
      this.getContentPane().add(panel); 
      this.revalidate();
      this.repaint();
   }
   public MenuSelection getMenuselection() {
      return menuselection;
   }


   public void setMenuselection(MenuSelection menuselection) {
      this.menuselection = menuselection;
   }


   public ReminderAdder getReminderadder() {
      return reminderadder;
   }


   public void setReminderadder(ReminderAdder reminderadder) {
      this.reminderadder = reminderadder;
   }


   public ReminderViewer getReminderviewer() {
      return reminderviewer;
   }


   public void setReminderviewer(ReminderViewer reminderviewer) {
      this.reminderviewer = reminderviewer;
   }



   
}