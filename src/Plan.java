import java.io.Serializable;

public abstract class Plan implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6840686466120215970L;
	
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
	
	abstract void printInfo();
	
}//