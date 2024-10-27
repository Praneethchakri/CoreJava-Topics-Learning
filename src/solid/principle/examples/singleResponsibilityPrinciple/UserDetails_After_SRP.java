package solid.principle.examples.singleResponsibilityPrinciple;

public class UserDetails_After_SRP {
	protected String userName;
	protected String email;

	public UserDetails_After_SRP(String userName, String email) {
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

}
