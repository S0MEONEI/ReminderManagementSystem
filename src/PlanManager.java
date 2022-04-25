import java.util.Scanner;
public class PlanManager {
	Scanner input = new Scanner(System.in);
	TaskPlan[] tp = new TaskPlan[10];
	int idx;
	public void arrayInit()
	{
		for(int i = 0; i < 10; i++) {
			this.tp[i] = new TaskPlan();
			this.tp[i].setDeadline("0");
		}
	}
	public void addReminder() {
		System.out.print("What is plan name?:");
		tp[idx].setName(input.nextLine());
		input.nextLine();
		System.out.print("Deadline(mm.dd):");
		tp[idx].setDeadline(input.nextLine());
		input.nextLine();
		System.out.print("What will you do?:");
		tp[idx].setWyd(input.nextLine());
		input.nextLine();
		this.idx++;
	}
	public void deleteReminder() {
		System.out.println("Enter an index to delete");
		input.nextLine();
		int i = input.nextInt();
		tp[i].setName(null);
		tp[i].setDeadline(null);
		tp[i].setWyd(null);
	}
	public void editReminder() {
		System.out.println("Enter an index to edit: ");
		int i = input.nextInt();
		System.out.print("What is plan name?:");
		tp[idx].setName(input.nextLine());
		input.nextLine();
		System.out.print("edit Deadline(mm.dd):");
		tp[i].setDeadline(input.nextLine());
		input.nextLine();
		System.out.print("What will you do?:");
		tp[i].setWyd(input.nextLine());
		input.nextLine();
	
	}
	public void viewReminder() {
		for(int i = 0; i < 10; i++) {
				System.out.println("What is plan name?:" + tp[i].getName());
				input.nextLine();
				System.out.println("Deadline: " + tp[i].getDeadline());
				input.nextLine();
				System.out.println("What you do?: " + tp[i].getWyd());
				input.nextLine();
				System.out.println();
				input.nextLine();
			
		}
	}
}