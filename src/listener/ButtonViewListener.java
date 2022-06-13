package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.ReminderViewer;
import gui.WindowFrame;
import manager.PlanManager;

public class ButtonViewListener implements ActionListener {

   WindowFrame frame;
   
   public ButtonViewListener(WindowFrame frame) {
      this.frame = frame;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      ReminderViewer viewer = frame.getReminderviewer();
      PlanManager planManager = getObject("PlanManager.ser");
      viewer.setReminderViewer(planManager);
      
      frame.getContentPane().removeAll();
      frame.getContentPane().add(viewer);
      frame.revalidate();
      frame.repaint();

   }
   
   public static PlanManager getObject(String filename) {
      PlanManager studentManager = null;
      try {
         FileInputStream file = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(file);
         
         studentManager = (PlanManager) in.readObject();
         
         in.close();
         file.close();
      } catch (FileNotFoundException e) {
         return studentManager;
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return studentManager;
   }
   
}