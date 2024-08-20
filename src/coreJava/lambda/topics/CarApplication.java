package coreJava.lambda.topics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarApplication {
	public static void main(String[] args) {

		List<Car> cars = Arrays.asList(new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700), new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200), new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300), new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500));

//		printCarByPriceRange(cars, 10000, 17000);
//
//		printCars(cars, (c) -> c.getPrice() >= 14000 && c.getPrice() <= 20000);
//
//		System.out.println("\n");
//
//		printCars(cars, (c) -> c.getColour().equalsIgnoreCase("Blue"));
		
		
		Function<Car,String> priceAndColor = car -> car.getPrice() +" "+car.getColour();
		
		
		
				
	}
	

	public static void printCars(List<Car> car, Predicate<Car> condition) {
		for (Car car2 : car) {
			if (condition.test(car2)) {
				car2.printCar();
			}
		}
	}

	public static void printCarByPriceRange(List<Car> cars, int low, int high) {

		for (Car car : cars) {
			if (low < car.getPrice() && car.getPrice() <= high) {
				car.printCar();
			}
		}
	}

	public static void printCarByColour(List<Car> car, String colour) {

		for (Car car2 : car) {
			if (colour.equals(car2.getColour())) {
				car2.printCar();
			}

		}

	}

}
