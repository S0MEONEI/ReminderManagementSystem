import java.util.Scanner;

public class ReminderManagementSystem {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		String deadline = null;
		String wyd = null;
		
		while (num != 6) {
			System.out.println("1. Add Reminder");
			System.out.println("2. Delete Reminder");
			System.out.println("3. Edit Reminder");
			System.out.println("4. View Reminder");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("1부터 6 중 번호를 선택하세요.");
		
		num = input.nextInt();
		input.nextLine();
		
		switch(num) {
		case 1:
			System.out.print("Deadline:");
			deadline = input.nextLine();
			System.out.print("What you do?:");
			wyd = input.nextLine();
			break;
		case 2:
			deadline = null;
			wyd = null;
			break;
		case 3:
			System.out.print("Deadline:");
			deadline = input.nextLine();
			System.out.print("What you do?:");
			wyd = input.nextLine();
			break;
		case 4:
			System.out.println("Deadline: " + deadline);
			System.out.println("What you do?: " + wyd);
			break;
		case 5:
			
			break;
		case 6:
			System.out.println("end");
			break;
		}
	}
	
	}
}

