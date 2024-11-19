package coreJava.lambda.topics.consumer;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String address;
	private double grade;
	private short gcp;
	private List<String> activities;

	public Student(int id, String name, String address, double grade, short gcp, List<String> activities) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.grade = grade;
		this.gcp = gcp;
		this.activities = activities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public short getGcp() {
		return gcp;
	}

	public void setGcp(short gcp) {
		this.gcp = gcp;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", grade=" + grade + ", gcp=" + gcp
				+ ", activities=" + activities + "]";
	}

}
