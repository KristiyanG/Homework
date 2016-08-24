package readings;

public abstract class Reading {
	
	private String name ;
	private String publisher;
	
	public Reading(String name, String publisher) {
		super();
		this.name = name;
		this.publisher = publisher;
	}

	public abstract long getTime() throws MagazineException;
	
	public abstract double getTax() throws MagazineException;
	
	public String getName() {
		return name;
	}
	
}
