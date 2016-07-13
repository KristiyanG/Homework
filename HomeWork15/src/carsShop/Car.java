package carsShop;

public class Car {

	private String brand;
	private String model;
	private int maxSpeed;
	private int currentSpeed;
	private String color;
	private int currentGear;
	Person owner;
	final int maxGear = 5;
	private double price;
	boolean isSportCar;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand != null)
			this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null)
			this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 0)
			this.maxSpeed = maxSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed >= 0)
			this.currentSpeed = currentSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null)
			this.color = color;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		if (currentGear > 0)
			this.currentGear = currentGear;
	}

	public int getMaxGear() {
		return maxGear;
	}

	Car(String model, boolean isSportCar, String color) {
		setModel(model);
		this.isSportCar = isSportCar;
		setColor(color);
		setCurrentSpeed(0);
		setCurrentGear(1);
	}

	void accelerate() {
		if (currentSpeed < maxSpeed) {
			currentSpeed++;
		}
	}

	void changeGearUp() {
		if (currentGear < maxGear) {
			currentGear++;
		}
	}

	void changeGearDown() {
		if (currentGear > 1) {
			currentGear--;
		}
	}

	void changeGear(int nextGear) {
		if (nextGear >= 1 && nextGear <= maxGear) {
			currentGear = nextGear;
		}
	}

	void changeColor(final String newColor) {

		// more code
		color = newColor;
	}

	boolean isMoreExpensive(Car car) {
		return this.price > car.price;
	}

	void changeOwner(Person newOwner) {
		this.owner = newOwner;
	}

	void setPrice(double newPrice) {
		if (newPrice > 0) {
			this.price = newPrice;
		}
	}

	double getPrice() {
		return price;
	}
}
