package manager;

import java.io.Serializable;

public class TaskPlan extends Plan implements subject, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3308952290564782775L;
	
	private String subject;


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void printInfo()
	{	
		System.out.println("Subject: " + getSubject());
		System.out.println("Deadline: " + getDeadline());
		System.out.println("Plan: " + getWyd());
		System.out.println();
			
		
	}

	@Override
	public Object getsubject() {
		// TODO Auto-generated method stub
		return getSubject();
	}
}//


 	 	 	