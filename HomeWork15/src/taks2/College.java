package taks2;

public class College {
	public static void main(String[] args) {
		Student pesho= new Student("Pesho", "Fizika", 20);
		Student ivan=new Student("Ivan", "Matematika", 25);
		Student georgi=new Student("Georgi", "Matematika", 29);
	
		StudentGroup purvaGrupa=new StudentGroup("Fizika");
		purvaGrupa.addStudent(pesho);
		StudentGroup vtoraGrupa =new StudentGroup("Matematika");
		purvaGrupa.addStudent(ivan);
		vtoraGrupa.addStudent(ivan);
		vtoraGrupa.addStudent(georgi);
		purvaGrupa.printStudentsInGroup();
		vtoraGrupa.printStudentsInGroup();
		System.out.println(vtoraGrupa.theBestStudent());
	}
}
