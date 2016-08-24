package readings;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Library library = new Library("Zatvora ");
		Reading book = new Book("Java", "Ltd");
		Reading magazine= new Magazine("PlayBoy", "Ltd");
		Reading schoolBook = new SchoolBook("Fizika", "Ltd");
		Reading schoolBook2 = new SchoolBook("Matematika", "Ltd");
		
		library.addReading(book);
		library.addReading(magazine);
		library.addReading(schoolBook);
	
		library.addReading(schoolBook2);
		
		Reader pesho = new Reader("Pesho ",library);
		pesho.takeBook("PlayBoy");
		Thread.sleep(4000);
		pesho.returnBook();
		
	}
}
