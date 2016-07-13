package carsShop;

public class Person {



	String name;
	int age;
	String sex;
	double weight;
	Person[] friends;
	int health;
	int hunger;
	int mentality;
	double money;
	Car myCar;
	
	Person(){
		age = 0;
		weight = 3.5;
		
	}
	
	Person(String name){
		this();
		if(name!=null){
			this.name = name;
		}
		
		friends = new Person[3];
	}
	
	Person(String name, int age){
		this(name);
		if(age>0){
			this.age = age;
		}
	
	}
	
	Person(String name, String gender){
		this(name);
		this.sex = gender;
	
	}
	
	void eat(){
		hunger--;
	}
	
	void heal(){
		health++;
	}
	
	void buyCar(Car car){
		if(this.money >= car.getPrice()){
			//vzimam q!
			this.money-=car.getPrice();
			this.myCar = car;
			car.changeOwner(this);
		}
	}
	
}

