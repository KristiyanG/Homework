
public class Reader {

	private String name;
	private Book takenBook;
	
	public Reader(String string) {
		this.name=string;
	}

	public void takeBook(Library biblioteka) {
		Book book = biblioteka.giveBook();
		this.takenBook=book;
		System.out.println(name + " take " + takenBook.getName());
		
	}

	public void returnBook(Library biblioteka) {
		System.out.println(name + " return " + takenBook.getName());
		
		biblioteka.recieveBook(takenBook);
		
	}
	
}
