package readings;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Library {

	private String name;
	private HashMap<String,Reading> readings;
	private HashMap<String, Thread> checkers;
	private HashMap<String, Double > taxes;
	private HashMap<String,HashMap<LocalDate,LocalDate>> history;
	private HashMap<String ,String> readers;
	private ArrayList<Reading> givenReadings;
	public Library(String name) {
		this.name=name;
		this.readings = new HashMap<>();
		this.checkers = new HashMap<>();
		this.taxes = new HashMap<>();
		this.history = new HashMap<>();
		this.readers= new HashMap<>();
		this.givenReadings= new ArrayList<>();
	
	}
	
	public Reading giveBook(String name, String reader) throws MagazineException{
		Reading b = readings.get(name);
		readings.remove(name);
		Checker checker=null;
		
		checker = new Checker(b.getTime(),b.getTax(),name,this);
		
		
		taxes.put(b.getName(), b.getTax());
		b.setDate(LocalDate.now());
		checker.start();
		checkers.put(name, checker);
		readers.put(name, reader);
		history.put(name, new HashMap<>());
		history.get(name).put(LocalDate.now(), null);
		givenReadings.add(b);
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
		givenReadings.remove(reading);
	}
	
	public void addReading(Reading reading){
		readings.put(reading.getName(), reading);
	}
	
	public void generateFile() {
		givenReadings.sort((v1,v2)->v1.getTakenDate().compareTo(v2.getTakenDate()));
		File file = new File("books.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		PrintStream ps=null;
		try {
			ps = new PrintStream(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		for (Reading reading : givenReadings) {
			ps.append("Book "+  reading.getName()+" date - " + reading.getTakenDate()+"/n");
		}
		
		
		
	}
	

	
	
}
