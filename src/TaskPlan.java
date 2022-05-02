
public class TaskPlan extends Plan {
	
	private String subject;
	
	TaskPlan() {

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void printInfo()
	{
		System.out.println("Deadline: " + getDeadline());
		System.out.println("Subject: " + getSubject());
		System.out.println("Plan: " + getWyd());
	}
}


