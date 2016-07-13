package carsShop;

public class Demo {
	
	public static void main(String[] args) {
		
	
	CarShop shop=new CarShop(5);
	
	Person ivan=new Person("Ivan", 30);
	Person gogo=new Person("Gogo", 30);
	Car audi=new Car("a3", true, "blue");
	Car vw=new Car("golf", false, "black");
	Car mazda=new Car("x8", false, "brown");
	Car seat=new Car("Leon", false, "red");
	audi.owner=ivan;
	vw.owner=gogo;
	seat.owner=ivan;
	mazda.owner=ivan;
	shop.addCar(mazda);
	shop.addCar(audi);
	shop.addCar(seat);
	shop.addCar(vw);
	shop.removeCar(seat);
	shop.showAllCarsInTheShop();
	
	}
}
