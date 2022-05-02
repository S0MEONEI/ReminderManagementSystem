public class Plan {
	
	private String deadline;
	private String wyd;
	
	Plan() {
		
	}
	
	public String getDeadline() {
		return deadline;
	}
	
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	public String getWyd() {
		return wyd;
	}
	
	public void setWyd(String wyd) {
		this.wyd = wyd;
	}
	
	public void printInfo()
	{
		System.out.println("Deadline: " + getDeadline());
		System.out.println("Plan: " + getWyd());
	}
	
}