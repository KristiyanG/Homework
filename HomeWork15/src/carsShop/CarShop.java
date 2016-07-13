package carsShop;

public class CarShop {

	static int index = 0;
	Car[] cars;

	CarShop(int capacity) {
		if (capacity > 0)
			cars = new Car[capacity];

	}

	boolean addCar(Car car) {
		if (cars.length > index) {
			cars[index] = car;
			index++;
			return true;
		}
		return false;

	}

	Car nextCar() {
		if (cars.length < index) {

			return cars[index];
		} else {
			System.out.println("Nqmq sledvashta kola ");
			return cars[index];
		}
	}

	void sellNextCar(Person buyer) {
		if (cars.length > index + 1) {
			if (cars[index + 1] != null) {
				cars[index + 1].owner = buyer;
				removeCar(cars[index + 1]);
			}
		} else {
			System.out.println("Nqmq sledvashta kola ");

		}
	}

	boolean removeCar(Car car) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].equals(car)) {
				for (int j = 0; j < cars.length; j++) {
					if (cars[j] == null) {
						cars[i] = cars[j - 1];
						cars[j - 1] = null;
						return true;
					}
				}
				cars[i] = null;
				return true;
			}

		}
		return false;
	}

	void showAllCarsInTheShop() {
		for (int i = 0; i < cars.length; i++) {

			if (cars[i] != null) {
				System.out.println(cars[i].getModel() + " is sport car "
						+ cars[i].isSportCar + " " + cars[i].getColor());
			}

		}
	}
}
