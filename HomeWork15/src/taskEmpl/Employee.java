package taskEmpl;

public class Employee {
	static final double maxHours = 8;
	static final double minHours = 0;
	private String name;
	Task currentTask;
	private double hoursLeft;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= minHours && hoursLeft <= maxHours) {
			this.hoursLeft = hoursLeft;
		}
	}

	Employee(String name) {
		setName(name);
	}

	void work() {
		if (currentTask != null) {
			if (this.getHoursLeft() >= currentTask.getWorkingHours()) {
				this.setHoursLeft(this.getHoursLeft()
						- currentTask.getWorkingHours());
				currentTask.setWorkingHours(0);
			} else {
				currentTask.setWorkingHours(currentTask.getWorkingHours()
						- this.getHoursLeft());
				this.setHoursLeft(0);

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

}
