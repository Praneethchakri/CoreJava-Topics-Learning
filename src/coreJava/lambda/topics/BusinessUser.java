package coreJava.lambda.topics;

import java.util.List;

public class BusinessUser {
	private int userId;
	private String name;
	private double salary;
	private List<String> roles;
	private String location;
	
	public BusinessUser(int userId, String name, double salary, List<String> roles, String location) {
		super();
		this.userId = userId;
		this.name = name;
		this.salary = salary;
		this.roles = roles;
		this.location = location;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BusinessUser [userId=" + userId + ", name=" + name + ", salary=" + salary + ", roles=" + roles
				+ ", location=" + location + "]";
	}
	
	
	

}
