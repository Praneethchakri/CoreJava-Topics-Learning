package reflection.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Constructor_Details {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		/*
		 * Topic1 : Ways of Obtaining Constructors Topic2 : Constructor Parameter
		 * inspection using Reflection Topic3 : Dynamic Object Creation using Reflection
		 * 
		 * Introduction to Constructor<?> and ways of Obtaining,
		 * 1.Class.getDeclaredConstuucotrs()( which gives Both public and on public);
		 * 2.Class.getConstructors( which give only Public constructors)
		 */
		Constructor<?>[] onlyPublicConstructor = Person.class.getConstructors();
		Constructor<?>[] defaultConstrucotrs = Person.class.getDeclaredConstructors();
		System.out.println(defaultConstrucotrs.toString());
//		printConstructorData(Person.class);
		Address a =  createInstanceWithArguments(Address.class, "Bangalore","India");
		Person p =  createInstanceWithArguments(Person.class,33,"Praneeth",a);
		System.out.println(p);

	}

	// Constructor Parameter inspection using Reflection
	public static void printConstructorData(Class<?> clazz) {
		Constructor<?>[] constructor = clazz.getDeclaredConstructors();
		System.out.println(
				String.format("Class %s has %d declatared Constructors ", clazz.getSimpleName(), constructor.length));

		for (int i = 0; i < constructor.length; i++) {

			Class<?>[] parameterTypes = constructor[i].getParameterTypes();

			List<String> paramterTypeNames = Arrays.stream(parameterTypes)
					.map(parameterType -> parameterType.getSimpleName()).collect(Collectors.toList());
			System.out.println(paramterTypeNames);
		}

	}

	// Dynamic Object Creation using Reflection

	public static <T> T createInstanceWithArguments(Class<T> clazz, Object... args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
			if (constructor.getParameterTypes().length == args.length) {
				return (T) constructor.newInstance(args);
			}
		}
		System.out.println("An appropriate Constructor Not Found!!!");
		return null;
	}

	public static class Person {

		private final int age;
		private final String name;
		private final Address address;

		public Person() {
			this.age = 0;
			this.address = null;
			this.name = "Anonymous";
		}

		public Person(int age, String name) {
			this.age = age;
			this.name = name;
			this.address = null;
		}

		public Person(int age, String name, Address address) {
			this.age = age;
			this.name = name;
			this.address = address;
		}

		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
		}

	}

	public static class Address {
		private String location;
		private String country;
		
		

		public Address(String location, String country) {
			this.location = location;
			this.country = country;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "Address [location=" + location + ", country=" + country + "]";
		}

	}

}
