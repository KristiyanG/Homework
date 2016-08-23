
public class Book {

	static final int LENDING_TIME=3;
	static final double TAX=2;
	
	
	private static String name;
	public Book(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
