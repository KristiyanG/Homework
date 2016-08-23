
public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Library biblioteka = new Library("Saparevo LB");
		
		Reader gosho = new Reader ("Gosho ");
		
		gosho.takeBook(biblioteka);
		Thread.sleep(7000);
		gosho.returnBook(biblioteka);
		
		
	}
}
