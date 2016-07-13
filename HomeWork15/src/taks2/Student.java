package taks2;

public class Student {
	
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	boolean isDegree;
	private double money;
	

	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		if(grade>=2&&grade<=6){
			this.grade = grade;
		}
	}
	public int getYearInCollege() {
		return yearInCollege;
	}
	public void setYearInCollege(int yearInCollege) {
		if(yearInCollege>0&&yearInCollege<=4){
			this.yearInCollege = yearInCollege;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0){
			this.age = age;
		}
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		if(money>=0){
			this.money = money;
		}
	}
	Student(){
		setGrade(4);
		setYearInCollege(1);
		this.isDegree=false;
		setMoney(0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null)
			this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if(subject!=null)
			this.subject = subject;
	}
	Student(String name,String subject, int age){
		this();
		setName(name);
		setSubject(subject);
		setAge(age);
	}
	void upYear(){
		this.yearInCollege++;
		if(yearInCollege==4){
			isDegree=true;
		}
		if(yearInCollege>4){
			System.out.println("YearInCollege e po-golqmo ot 4");
		}
		
	}
	
	double recieveScholarship(double min,double amount ){
		if(this.grade>min&&this.age<30){
			return this.money+=amount;
		}
		return this.money;
	}
	
	
}
