package coreJava.lambda.topics;

public class Car {
	
	String make ,model,colour;
	int price;
	
	public Car(String make, String model, String colour, int price) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", colour=" + colour + ", price=" + price + "]";
	}
	
	public void printCar() {
		System.out.println(this);
	}

}
