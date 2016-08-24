package readings;

public class Book extends Reading {

	public static final double TAX=2;
	public static final int TIME = 3;
	public Book(String name, String publisher) {
		super(name, publisher);
	}

	@Override
	public long getTime() {
		return TIME;
	}

	@Override
	public double getTax() {
		return TAX;
	}

	
}
