package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class PlanManager implements Serializable {
   /**
    * 
    */
   private static final long serialVersionUID = 7697204917960877385L;
   
   transient Scanner input;
   ArrayList<TaskPlan> TaskPlan = new ArrayList<>();
   
   int idx = 0;


   PlanManager() {
      
   }
   
   PlanManager(Scanner input){
      this.input=input;
   }
   
   public void addReminder(String subject, String Deadline, String Wyd) {
      TaskPlan tp = new TaskPlan();
      
      tp.setSubject(input.nextLine());
      
      tp.setDeadline(input.nextLine());

      tp.setWyd(input.nextLine());
         
      this.TaskPlan.add(tp);
   }
   
   public void addReminder(TaskPlan tp) {
      this.TaskPlan.add(tp);
   }
      
   
   public void addReminder() {
      TaskPlan tp = new TaskPlan();
      
      System.out.print("What is plan name?: ");
      tp.setSubject(input.nextLine());
      input.nextLine();
      System.out.println();
      
      System.out.print("Deadline(mm.dd): ");
      tp.setDeadline(input.nextLine());
      input.nextLine();
      System.out.println();
         
      System.out.print("What will you do?: ");
      tp.setWyd(input.nextLine());
      input.nextLine();
      System.out.println();
         
      this.TaskPlan.add(tp);
   }

   public void deleteReminder() {
      try {
         System.out.println("Enter an index to delete");
         int i = input.nextInt();
         input.nextLine();
         TaskPlan.remove(i);
      }
      catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException");
         System.out.println("10이하의 정수로 다시 입력하세요");
      }
   }
   
   public void editReminder() {
      try {
         System.out.println("Enter an index to edit: ");
         int i = input.nextInt();
         TaskPlan.remove(i);
         
         TaskPlan tp = new TaskPlan();
         
         input.nextLine();
         System.out.print("What is plan name?: ");
         tp.setSubject(input.nextLine());
         input.nextLine();
         System.out.println();
         
         System.out.print("Deadline(mm.dd): ");
         tp.setDeadline(input.nextLine());
         input.nextLine();
         System.out.println();
            

         System.out.print("What will you do?: ");
         tp.setWyd(input.nextLine());
         input.nextLine();
         System.out.println();
         
         this.TaskPlan.add(i, tp);

      }
      catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException");
         System.out.println("10이하의 정수로 다시 입력하세요");
      }
   }
   
   public void viewReminder() {
      for(int i =0;i < TaskPlan.size(); i++)   {
         TaskPlan.get(i).printInfo();
        }
      

   }
   
   public int size() {
      return TaskPlan.size(); 
   }
   
   public Plan get(int index) {
      return TaskPlan.get(index);
   }
}//