package person;

public class Student extends Person{
	
	static final int minScore=2;
	static final int maxScore=6;
	private double score;
	public Student(String name, int age, boolean isMale,double score) {
		super(name, age, isMale);
		setScore(score);
	}
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		if(score>=minScore&&score<=maxScore)
			this.score = score;
	}
	
	@Override
	void showPersonInfo() {
		// TODO Auto-generated method stub
		super.showPersonInfo();
		System.out.println(" The score of student is "+getScore());
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String s=" The score of student is "+getScore();
		return super.toString()+s;
	}
}
