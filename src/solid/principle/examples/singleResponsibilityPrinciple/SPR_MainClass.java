package solid.principle.examples.singleResponsibilityPrinciple;

public class SPR_MainClass {

	public static void main(String[] args) {
		
		System.out.println("Defination of SRP : A class should have only one reason to change, meaning it should have only one job or responsibility.");
		UserDetails_After_SRP object = new UserDetails_After_SRP("Praneeth", "praneeth.chakri26@gmail.com");
		FileSaveFunctionality saveFile = new FileSaveFunctionality();
		saveFile.fileSave(object);
	}

}
