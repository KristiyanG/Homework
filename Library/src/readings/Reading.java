package readings;

import java.time.LocalDate;

public abstract class Reading {
	
	private String name ;
	private String publisher;
	private LocalDate takenDate;
	
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
	public void setDate(LocalDate date){
		this.takenDate=date;
	}

	public LocalDate getTakenDate() {
		return takenDate;
	}
	
	
}
