package person;

public class Demo {

	public static void main(String[] args) {
		
		Person[] person=new Person[10];
		
		Person ivan=new Person("Ivan", 20, true);
		Person georgi=new Person("Georgi", 18, true);
		Student student1=new Student("Kristiyan", 20, true, 5);
		Student student2=new Student("Kristin", 18, false, 6);
		Employee empl1=new Employee("Kockata", 40, true, 40);
		Employee empl2=new Employee("Nakata", 32, true, 56);
		person[0]=ivan;
		person[1]=georgi;
		person[2]=student1;
		person[3]=student2;
		person[4]=empl1;
		person[5]=empl2;
		for (int i = 0; i < person.length; i++) {
			if(person[i]!=null){
				if(person[i] instanceof Person){
					
					System.out.println(person[i]);
					System.out.println();
				}
				else if(person[i] instanceof Student) {
					Student st = (Student) person[i];
					System.out.println(st);
					System.out.println();
				}
				else if(person[i] instanceof Employee){
					Employee emp=(Employee) person[i];
					System.out.println(emp);
					System.out.println();
				}
				
			}
		}
		for (int i = 0; i < person.length; i++) {
			if(person[i] instanceof Employee){
				Employee empl =(Employee) person[i];
				System.out.println(empl);
				empl.calculateOverTime(2);
			}
		
		
		}
		/*
		 * Дефинирането на конструктор без параметри в класа студент не е възможно, защото класа наследява Person, 
		 * който има конструктор с параметри.За да дефинираме конструктор без параметри в класа Student трябва да премахнем параметрите в
		 *  Person конструктора или напълно да премахнем конструктора в Person(ползваме default конструктор).  
		 */

	}

}
