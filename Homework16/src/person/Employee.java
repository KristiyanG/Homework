package person;

public class Employee extends Person {
	
	static final int workingHoursForOneDay=8;
	static final int minYearsForOverTime=18;
	private double daySalary;

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if(daySalary>0)
			this.daySalary = daySalary;
	}

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
	double calculateOverTime(double hours){
		if(this.getAge()<minYearsForOverTime){
			return 0;
		}
		
		return hours*1.5*(getDaySalary()/workingHoursForOneDay);
		
	}
	
	@Override
	void showPersonInfo() {

		super.showPersonInfo();
		System.out.println(" Day salary is "+getDaySalary());
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Day salary is "+getDaySalary()+" ";
	}
	
	
	
}
