package taskEmployee;

public class AllWork {

	static Task[] tasks;
	private int freePlacesForTasks;
	static int currentUnassignedTask = -1;

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		if (freePlacesForTasks >= 0)
			this.freePlacesForTasks = freePlacesForTasks;
	}

	public AllWork() {
		setFreePlacesForTasks(10);
		tasks = new Task[getFreePlacesForTasks()];
		
	}

	void addTask(Task task) {
		if (freePlacesForTasks > 0) {
			for (int i = 0; i < tasks.length; i++) {
				if (tasks[i] == null) {
					tasks[i] = task;
					freePlacesForTasks--;
					break;
				}
			}

		}
	}

	public static Task getNextTask() {

		if(isAllWorkDone()){
			currentUnassignedTask++;
			if (currentUnassignedTask < tasks.length) {

				return tasks[currentUnassignedTask];
			}
		}

		return null;

	}

	static boolean isAllWorkDone() {
		if (currentUnassignedTask < tasks.length) {
			return true;
		}
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i].getWorkingHours()>0){
				return true;
			}
		}
//		System.out.println("------------------");
//		System.out.println("Nqma povehe zadachi ...");
		return false;
	}

}
