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
		try {
			System.out.print("What is plan name?: ");
			tp[idx].setSubject(input.nextLine());
			input.nextLine();
			System.out.println();
			
			System.out.print("Deadline(mm.dd): ");
			tp[idx].setDeadline(input.nextLine());
			System.out.println();
			
			System.out.print("What will you do?: ");
			tp[idx].setWyd(input.nextLine());
			System.out.println();
			
			this.idx++;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("10이하의 정수로 다시 입력하세요");
		}
	}
	
	public void deleteReminder() {
		try {
			System.out.println("Enter an index to delete");
			int i = input.nextInt();
			input.nextLine();
			tp[i].setSubject(null);
			tp[i].setDeadline(null);
			tp[i].setWyd(null);
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
			
			tp[i].printInfo();
			System.out.println();
						
			System.out.print("What is plan name?:");
			tp[idx].setSubject(input.nextLine());
			System.out.println();
			
			System.out.print("edit Deadline(mm.dd):");
			tp[i].setDeadline(input.nextLine());
			System.out.println();
			
			System.out.print("What will you do?:");
			tp[i].setWyd(input.nextLine());
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("10이하의 정수로 다시 입력하세요");
		}
	}
	
	public void viewReminder() {
		for(int i = 0; i < 10; i++) {
				System.out.println("INDEX: " + i);
				tp[i].printInfo();	
			
			
		}
	}
}//