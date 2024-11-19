package coreJava.lambda.topics.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Product_ConsumerFunctionalInterface {

	private String name;
	private double price;

	public Product_ConsumerFunctionalInterface(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void discount(double discount) {
//		this.price-=this.price*discount;
		this.price = this.price - (this.price * discount);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {

		List<Product_ConsumerFunctionalInterface> productList = new ArrayList<>();

		productList.add(new Product_ConsumerFunctionalInterface("Audi", 100));
		productList.add(new Product_ConsumerFunctionalInterface("Lamborgini", 200));

		Consumer<Product_ConsumerFunctionalInterface> productDiscount = product -> product.discount(0.2);

		productList.forEach(productDiscount);
		productList.forEach(System.out::println);

	}

}
