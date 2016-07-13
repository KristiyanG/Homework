package taks2;

public class StudentGroup {
	
	private String groupSubject;
	Student[] students;
	private int freePlaces;
	static int indexOfStudents=0;
	
	public String getGroupSubject() {
		return groupSubject;
	}
	public void setGroupSubject(String groupSubject) {
		if(groupSubject!=null){
			this.groupSubject = groupSubject;
		}
	}
	
	public int getFreePlaces() {
		return freePlaces;
	}
	public void setFreePlaces(int freePlaces) {
		if(freePlaces>0)
			this.freePlaces = freePlaces;
	}
	StudentGroup(){
		students=new Student[5];
		setFreePlaces(5);
	}
	StudentGroup(String subject){
		this();
		setGroupSubject(subject);
	}
	
	void addStudent(Student s){
		if(s.getSubject().equals(groupSubject)&&freePlaces>0){
			students[indexOfStudents]=s;
			indexOfStudents++;
			freePlaces--;
		}
	}
	
	void emptyGroup(){
		students=new Student[5];
		this.freePlaces=5;
		indexOfStudents=0;
	}
	
	String theBestStudent(){
		int index=0;
		double temp=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null){
				if(students[i].getGrade()>temp){
					temp=students[i].getGrade();
					index=i;
				}
			}
		}
		return students[index].getName();
	}
	
	void printStudentsInGroup(){
		for (int i = 0; i < students.length; i++) {
		if(students[i]!=null){
			if(students[i].getName()!=null){
				System.out.println("Name "+ students[i].getName()+ " Grade "+students[i].getGrade()+" age "+ students[i].getAge());
			}
		}
	}
	
	}
}
