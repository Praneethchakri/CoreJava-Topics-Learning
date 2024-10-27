package coreJava.oops.topics;

class Country {

	int countryCode;
	String capital;

	public Country(int countryCode, String capital) {
		super();
		this.countryCode = countryCode;
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", capital=" + capital + "]";
	}

}

class Continent implements Cloneable {
	int position;
	String continentName;
	Country country;

	public Continent(int position, String continentName, Country country) {
		super();
		this.position = position;
		this.continentName = continentName;
		this.country = country;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Continent [position=" + position + ", continentName=" + continentName + ",Country = " + country + "]";
	}

}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("Shallow cloning will clone the referance of the Object but not the actual object.");
		Country india = new Country(1, "Delhi");
		Continent asia = new Continent(1, "Asia", india);
//		Cloning Object
		Continent europe = (Continent) asia.clone();

		System.out.println("Asia " + asia);
		System.out.println("europe " + europe);
// updating the value
 		europe.country.capital = "Berlin";

		System.out.println("IF we modify , it will affect Original & ClonedObjects ");

		System.out.println("Asia " + asia);
		System.out.println("europe " + europe);

	}

}
