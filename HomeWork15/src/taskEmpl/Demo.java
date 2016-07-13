package taskEmpl;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t=new Task("Purva zadacha",7);
		Task t2=new Task("Vtora zadacha",2);
		Task t3=new Task("Treta zadacha",8);
		Employee pesho=new Employee("Pesho");
		pesho.currentTask=t;
		pesho.setHoursLeft(5);
		Employee ivan=new Employee("Ivan");
		ivan.currentTask=t2;
		ivan.setHoursLeft(8);
		Employee gogo=new Employee("Gogo");
		gogo.currentTask=t3;
		gogo.setHoursLeft(8);
		ivan.work();
		pesho.work();
		gogo.work();
		gogo.showReport();
		pesho.showReport();
		
	}

}
