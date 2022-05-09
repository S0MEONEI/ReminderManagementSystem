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
		System.out.print("What is plan name?: ");
		tp[idx].setSubject(input.nextLine());
		input.nextLine();
		System.out.print("Deadline(mm.dd): ");
		tp[idx].setDeadline(input.nextLine());
		input.nextLine();
		System.out.print("What will you do?: ");
		tp[idx].setWyd(input.nextLine());
		input.nextLine();
		this.idx++;
	}
	
	public void deleteReminder() {
		System.out.println("Enter an index to delete");
		int i = input.nextInt();
		input.nextLine();
		tp[i].setSubject(null);
		tp[i].setDeadline(null);
		tp[i].setWyd(null);
	}
	
	public void editReminder() {
		System.out.println("Enter an index to edit: ");
		int i = input.nextInt();
		System.out.print("What is plan name?:");
		tp[idx].setSubject(input.nextLine());
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
			tp[i].printInfo();
		}
	}
}