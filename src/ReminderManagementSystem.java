import java.util.Scanner;

public class ReminderManagementSystem {
	
	static String Topic = "Reminder, ToDo List";
	
	
	public static void ManagementTopic (String a) {
	       System.out.println(a);
	   }
	public static void ManagementTopic (String b, String c) {
	       System.out.println("The date of creation: "+b+"."+c);
	   }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		ManagementTopic(Topic);
		ManagementTopic("03", "14");
		
		PlanManager pm = new PlanManager();
		pm.arrayInit();
		
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
			
			if (num == 1) {
				pm.addReminder();
			}
			else if (num == 2) {
				pm.deleteReminder();
			}
			else if (num == 3) {
				pm.editReminder();
			}
			else if (num == 4) {
				pm.viewReminder();
			}
			else {
				continue;
			}
		}
	}
}