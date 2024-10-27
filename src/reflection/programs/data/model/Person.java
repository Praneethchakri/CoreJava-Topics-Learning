package reflection.programs.data.model;

public class Person {
	private final String name;
	private final String state;
	private final int age;
	private final boolean isDeveloper;
	private final float salary;
	private final Address address;
	private final Company company;

	public Person(String name, String state, int age, boolean isDeveloper, float salary, Address address,
			Company company) {
		super();
		this.name = name;
		this.state = state;
		this.age = age;
		this.isDeveloper = isDeveloper;
		this.salary = salary;
		this.address = address;
		this.company = company;
	}

}
