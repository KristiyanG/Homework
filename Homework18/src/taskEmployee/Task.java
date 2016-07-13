package taskEmployee;

public class Task {
	
	static final double MAX_HOURS=0;
	private String name;
	private int workingHours;
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		if(name!=null){
			this.name = name;
		}
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public  void setWorkingHours(int workingHours) {
		if(workingHours>=MAX_HOURS){
			this.workingHours = workingHours;
		}
	}
	Task(String name,int workingHours){
		setName(name);
		setWorkingHours(workingHours);
		
	}
	
	
}
