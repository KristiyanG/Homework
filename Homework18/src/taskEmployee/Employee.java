package taskEmployee;

public class Employee {
	static final double maxHours = 8;
	static final double minHours = 0;

	static AllWork allwork;
	private String name;
	Task currentTask;
	int hoursLeft;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= minHours && hoursLeft <= maxHours) {
			this.hoursLeft = hoursLeft;
		}
	}

	Employee(String name) {
		setName(name);
	}

	void work() {
		while (hoursLeft > 0) {

			if (currentTask != null) {
				System.out.println(name+" working...");
				if (currentTask.getWorkingHours() > 0) {

					if (currentTask.getWorkingHours() > hoursLeft) {
						
						currentTask.setWorkingHours(currentTask
								.getWorkingHours() - hoursLeft);
						hoursLeft = 0;
						System.out.println("Rabotq po " + currentTask.getName()
								+ " Ostavat mi " + hoursLeft);
						

					}
					else if(currentTask.getWorkingHours() > hoursLeft){
						hoursLeft = 0;
						currentTask.setWorkingHours(0);
						System.out.println("Svurshih  " + currentTask.getName()
								+ " Ostavat mi " + hoursLeft);
						currentTask = AllWork.getNextTask();
					}
					else {
						
						hoursLeft = hoursLeft - currentTask.getWorkingHours();
						currentTask.setWorkingHours(0);
						System.out.println("Svurshih s  " + currentTask.getName()
								+ " Ostavat mi " + hoursLeft);
						currentTask = AllWork.getNextTask();

					}
				} else {
					currentTask = AllWork.getNextTask();
				}
			} else {

				currentTask = AllWork.getNextTask();
				if(currentTask==null){
					return;
				}
			}

		}
		
	}

	void showReport() {
		if (currentTask != null) {

			System.out.println(this.name + " raboti po zadacha "
					+ currentTask.getName() + " na rabotnika ostavat "
					+ this.getHoursLeft() + " na zadachata ostavat "
					+ currentTask.getWorkingHours());

		}
	}

	void startWorkingDay() {
		setHoursLeft(8);
	}

}
