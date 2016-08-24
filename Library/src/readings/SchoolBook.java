package readings;

public class SchoolBook extends Reading {

	public static final double TAX=3;
	public static final int TIME = 2000;//seconds
	
	public SchoolBook(String name, String publisher) {
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
