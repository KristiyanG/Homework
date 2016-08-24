package readings;

public class Reader {

	private String name;
	private Reading book;
	private Library library;
	
	public Reader(String name,Library library) {
		this.name = name;
		this.library=library;
		
	}
	
	public void takeBook(String bookName){
		try {
			this.book= library.giveBook(bookName, this.name);
		} catch (MagazineException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void returnBook(){
		library.returnReading(book);
	}
}
