package coreJava.oops.topics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Income implements Cloneable {
	int salary;
	String company;

	public Income(int salary, String company) {
		super();
		this.salary = salary;
		this.company = company;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Income [salary=" + salary + ", company=" + company + "]";
	}
	
	
	Map<String,String> hashMap = Collections.synchronizedMap(new HashMap<>());

}

class Address implements Cloneable {

	String location;
	String state;
	Income income;

	public Address(String location, String state, Income income) {
		super();
		this.location = location;
		this.state = state;
		this.income = income;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", state=" + state + ",income = " + income + "]";
	}
}

class Person implements Cloneable {

	private String name;
	private int age;
	Address address;

	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.address = (Address) address.clone();
		p.address.income = (Income) address.income.clone();
		return p;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Income income = new Income(120, "XYZ");
		Address address_1 = new Address("India", "Karnataka", income);
		Person person_1 = new Person("Ram", 33, address_1);
		Person person_2 = (Person) person_1.clone();

		System.out.println(person_1);
		System.out.println(person_2);

		System.out.println("After Modifying ");

		person_2.address.state = "AndraPradesh";
		person_2.address.income.salary = 123;

		System.out.println(person_1);
		System.out.println(person_2);

		System.out.println(person_1.address == person_2.address);

	}

}
