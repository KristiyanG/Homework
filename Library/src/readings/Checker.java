package readings;

public class Checker extends Thread {

	private long time;
	private double tax;
	private String name;
	private Library library;
	
	public Checker(long time, double tax, String name, Library library) {
	
		this.time = time;
		this.tax = tax;
		this.name = name;
		this.library = library;
	}
	
	@Override
	public void run() {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			return;
		}
		while(true){
			library.increaseTax(this.name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
	
	

	
	
}
