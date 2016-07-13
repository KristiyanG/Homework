
public class Computer {

	
	private int year;
	private double price;
	 boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>0){
			this.year = year;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>=0){
			this.price = price;
		}
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		if(hardDiskMemory>=0)
			this.hardDiskMemory = hardDiskMemory;
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		if(freeMemory>=0){
			this.freeMemory = freeMemory;
		}
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		if(operationSystem!=null){
			this.operationSystem = operationSystem;
		}
	}
	
	
	Computer(){
		this.isNotebook=false;
		this.operationSystem="Win Xp";
	}
	
	Computer(int year,double price,double hardDiskMemory,double freeMemory){
		this();
		setYear(year);
		setPrice(price);
		setHardDiskMemory(hardDiskMemory);
		setFreeMemory(freeMemory);
	}
	Computer(int year,double price,boolean isNotebook,double hardDiskMemory,double freeMemory,String operationSystem){
		setYear(year);
		setPrice(price);
		setHardDiskMemory(hardDiskMemory);
		setFreeMemory(freeMemory);
		this.isNotebook=isNotebook;
		setOperationSystem(operationSystem);
	}
	int comparePrice(Computer a){
		if(this.price>a.price){
			return -1;
		}
		else if(this.price<a.price){
			return 1;
		}
		else {
			return 0;
		}
	}
	
	void changeOperationSystem(String newOperationSystem){
		if(newOperationSystem!=null){
			operationSystem=newOperationSystem;
		}
	
	}
	void useMemory(double memory){
		if(freeMemory>=memory){
		freeMemory-=memory;
		}
		else{
			System.out.println("Not enough free memory ");
		}
	}
	 
	
	
}
