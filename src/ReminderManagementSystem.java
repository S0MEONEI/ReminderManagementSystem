import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class ReminderManagementSystem {
	
	static EventLogger logger = new EventLogger("log.txt");
	
	static String Topic = "Reminder, ToDo List";
	
	
	public static void ManagementTopic (String a) {
	       System.out.println(a);
	   }
	public static void ManagementTopic (String b, String c) {
	       System.out.println("The date of creation: "+b+"."+c);
	   }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		ManagementTopic(Topic);
		ManagementTopic("03", "14");
		
		PlanManager PlanManager = getObject("PlanManager.ser");
		if(PlanManager == null) {
			PlanManager = new PlanManager(input);
		}else {
			PlanManager.input = input;
		}

		
		int num = 0;
		
		try {
			while (num != 6) {
				System.out.println("---Reminder Management System Menu---");
				System.out.println("1. Add Reminder");
				System.out.println("2. Delete Reminder");
				System.out.println("3. Edit Reminder");
				System.out.println("4. View Reminder");
				System.out.println("5. Show a menu");
				System.out.println("6. Exit");
				System.out.println("1부터 6 중 번호를 선택하세요.");
		
				num = input.nextInt();
				input.nextLine();
			
				if (num == 1) {
					PlanManager.addReminder();
					logger.log("Add reminder");
				}
				else if (num == 2) {
					PlanManager.deleteReminder();
					logger.log("Delete reminder");
				}
				else if (num == 3) {
					PlanManager.editReminder();
					logger.log("Edit reminder");
				}
				else if (num == 4) {
					PlanManager.viewReminder();
					logger.log("View reminder");
				}
				else {
					continue;
				}
			}
		
			}
		catch(InputMismatchException e){
			System.out.println("InputMismatchException");
		}
		
		putObject( PlanManager, "PlanManager.ser");
		
	}
	
	
	
	
	public static PlanManager getObject(String filename) {
		PlanManager PlanManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			PlanManager = (PlanManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return PlanManager;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		return PlanManager;
		
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
	

	
}//