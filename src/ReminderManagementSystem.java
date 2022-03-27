import java.util.Scanner;

public class ReminderManagementSystem {

	static Scanner input = new Scanner(System.in);
	static double deadline = 0;
	static String wyd = null;
	
	public static void main(String[] args) {
		int num = 0;
		
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
			addReminder();
		}
		else if (num == 2) {
			deleteReminder();
		}
		else if (num == 3) {
			editReminder();
		}
		else if (num == 4) {
			viewReminder();
		}
		else {
			continue;
		}
	}
}
	public static void addReminder() {
		Scanner input = new Scanner(System.in);
		System.out.print("Deadline(mm.dd):");
		deadline = input.nextDouble();
		input.nextLine();
		System.out.print("What you do?:");
		wyd = input.nextLine();
	}
	
	public static void deleteReminder() {
		deadline = 0;
		wyd = null;
	}
	
	public static void editReminder() {
		System.out.print("Deadline:");
		deadline = input.nextDouble();
		input.nextLine();
		System.out.print("What you do?:");
		wyd = input.nextLine();
	}
	
	public static void viewReminder() {
		System.out.println("Deadline: " + deadline);
		System.out.println("What you do?: " + wyd);
	} 
}