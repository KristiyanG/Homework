import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Library {

	private static final int INTEREST = 1; // percent
	private String name;
	private ArrayList<Book> books;
	private double lendingTax;
	private HashMap<String, Double > taxes;
	private HashMap<String , Thread> takenBooks;
	
	public Library(String name) {
		this.name=name;
		this.books=new ArrayList<>();
		this.taxes=new HashMap<>();
		this.takenBooks= new HashMap<>();
		this.lendingTax=Book.TAX;
		books.add(new Book("Java 1"));
		books.add(new Book("Java 2"));
		books.add(new Book("Java 3"));
		books.add(new Book("Java 4"));
		for(Book b : books){
			taxes.put(b.getName(), Book.TAX);
		}
	}

	public Book giveBook() {
		Book b = books.get(new Random().nextInt(books.size()));

		BookChecker checker = new BookChecker(b.getName(), this);
		takenBooks.put(b.getName(), checker);
		checker.start();
		books.remove(b);
		return b;
	}

	public void recieveBook(Book takenBook) {
		books.add(takenBook);
		takenBooks.get(takenBook.getName()).interrupt();
		System.out.println("You owe us - "+ taxes.get(takenBook.getName()));
		taxes.put(takenBook.getName(), Book.TAX);
		
	}

	public void increaseTax(String bookName) {
		double tax = taxes.get(bookName);
		tax=tax + (tax/100)*INTEREST; 
		taxes.put(bookName, tax);
	}
	
	
}
