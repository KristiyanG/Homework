package taskEmpl;

public class Task {
	static final double maxHours=8;
	static final double minHours=0;
	private String name;
	private double workingHours;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null){
			this.name = name;
		}
	}
	public double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(double workingHours) {
		if(workingHours>=minHours){
			this.workingHours = workingHours;
		}
	}
	Task(String name,double workingHours){
		setName(name);
		setWorkingHours(workingHours);
		
	}
	
	
}
