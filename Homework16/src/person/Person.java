package person;

public class Person {
	private String name;
	private int age;
	boolean isMale;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name!=null)
			this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0)
			this.age = age;
	}
	public Person(String name, int age, boolean isMale) {
		
		setName(name);
		setAge(age);
		this.isMale=isMale;
	}
	
	void showPersonInfo(){
		System.out.print("Name - "+getName()+" age - " +getAge());
	}
	@Override
	public String toString() {

			String s="Name - "+getName()+" age - " +getAge();
			return s;

	}
	
}
