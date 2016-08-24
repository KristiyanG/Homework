package readings;

public class Magazine extends Reading {

	public static final double TAX=2;
	public static final int TIME = 3;
	
	public Magazine(String name, String publisher) {
		super(name, publisher);
	}

	@Override
	public long getTime() throws MagazineException  {
		throw new MagazineException("Can't get Magazine for read !");
	}

	@Override
	public double getTax() throws MagazineException {
		throw new MagazineException("Can't get Magazine for read !");
	}

}
