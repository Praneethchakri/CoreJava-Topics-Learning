package solid.principle.examples.singleResponsibilityPrinciple;

import java.io.FileWriter;
import java.io.IOException;


//Before SRP ,which violates it
public class UserDetails_Before_SRP {

	protected String userName;
	protected String email;

	public UserDetails_Before_SRP(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// handling fileSave functionality in UserDetails Class which violates the SRP
	// ,because the if any change in the file Saving functionality cause the
	// Modification in UserDetails class
	public void fileSaveManager() throws IOException {

		FileWriter fileWriter = new FileWriter(userName + "_" + email + ".txt");
		fileWriter.write(email);
		fileWriter.write(userName);
		System.out.println("User Details Save to File Successfully!!!");
		fileWriter.close();
	}

	public static void main(String[] args) throws IOException {
		UserDetails_Before_SRP object = new UserDetails_Before_SRP("Praneeth", "praneeth.itdev@gmail.com");
		object.fileSaveManager();
	}

}
