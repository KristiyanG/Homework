package readings;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

	private String name;
	private HashMap<String,Reading> readings;
	private HashMap<String, Thread> checkers;
	private HashMap<String, Double > taxes;
	private HashMap<String,HashMap<LocalDate,LocalDate>> history;
	private HashMap<String ,String> readers;
	
	public Library(String name) {
		this.name=name;
		this.readings = new HashMap<>();
		this.checkers = new HashMap<>();
		this.taxes = new HashMap<>();
		this.history = new HashMap<>();
		this.readers= new HashMap<>();
	
	}
	
	public Reading giveBook(String name, String reader) throws MagazineException{
		Reading b = readings.get(name);
		readings.remove(name);
		Checker checker=null;
		
		checker = new Checker(b.getTime(),b.getTax(),name,this);
		
		
		taxes.put(b.getName(), b.getTax());
		
		checker.start();
		checkers.put(name, checker);
		readers.put(name, reader);
		history.put(name, new HashMap<>());
		history.get(name).put(LocalDate.now(), null);
		return b;
	}

	public void increaseTax(String name) {
		double tax = taxes.get(name);
		double currentTax = tax + tax*0.1;
		
		taxes.put(name, currentTax);
	}

	public void returnReading(Reading reading) {
		if(reading==null){
			return;
		}
		String name = reading.getName();
		checkers.get(name).interrupt();
//		TODO from to date ...
		checkers.remove(name);
		System.out.println("You owe us : "+ taxes.get(name) + " lv ");
		taxes.remove(name);
		readings.put(name, reading);
		
	}
	
	public void addReading(Reading reading){
		readings.put(reading.getName(), reading);
	}
	
	
	

	
	
}
