
public class BookChecker extends Thread  {

	private String bookName;
	private Library biblioteka;
	public BookChecker(String bookName, Library biblioteka) {
		
		this.bookName = bookName;
		this.biblioteka = biblioteka;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(Book.LENDING_TIME*1000);
		} catch (InterruptedException e) {
			return;
		}
		while(true){
			try {
				Thread.sleep(1000);
				biblioteka.increaseTax(bookName);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
	
}
