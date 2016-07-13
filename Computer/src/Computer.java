
public class Computer {

	
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	
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
