package taskEmployee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t = new Task("Purva zadacha", 7);
		Task t2 = new Task("Vtora zadacha", 2);
		Task t3 = new Task("Treta zadacha", 9);
		Task t4 = new Task("4-ta zadacha", 100);
		Task t5 = new Task("5-ta zadacha", 5);
		Task t6 = new Task("6-ta zadacha", 6);
		Task t7 = new Task("7-ma zadacha", 7);
		Task t8 = new Task("8-ma zadacha", 11);
		Task t9 = new Task("9-ta zadacha", 6);
		Task t10 = new Task("10-ta zadacha", 1);
		Task t11 = new Task("11-ta zadacha", 3);
		Task t12 = new Task("12 zadacha", 8);

		AllWork allwork = new AllWork();
		allwork.addTask(t);
		allwork.addTask(t2);
		allwork.addTask(t3);
		allwork.addTask(t4);
		allwork.addTask(t5);
		allwork.addTask(t6);
		allwork.addTask(t7);
		allwork.addTask(t8);
		allwork.addTask(t9);
		allwork.addTask(t10);
		allwork.addTask(t11);
		allwork.addTask(t12);
		Employee pesho = new Employee("Pesho");

		Employee ivan = new Employee("Ivan");

		Employee gogo = new Employee("Gogo");

		while (AllWork.isAllWorkDone()) {
			pesho.startWorkingDay();
			ivan.startWorkingDay();
			gogo.startWorkingDay();
		
			pesho.work();
		
			ivan.work();
			
	
			gogo.work();
			
			System.out.println("---------------");
			System.out.println("Krai na rabotniq den");

		}
		System.out.println("Vsichki zadachi sa izpulneni !");

	}

}
