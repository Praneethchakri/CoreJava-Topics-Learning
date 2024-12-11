package coreJava.lambda.topics.consumer;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String address;
	private double grade;
	private short gcp;
	private List<String> activities;
	private List<String> subjects;
	private List<Integer> rollNumbers;

	public Student(int id, String name, String address, double grade, short gcp, List<String> activities,List<String> subjects,List<Integer> rollNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.grade = grade;
		this.gcp = gcp;
		this.activities = activities;
		this.subjects=subjects;
		this.rollNumbers=rollNumbers;
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

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<Integer> getRollNumbers() {
		return rollNumbers;
	}

	public void setRollNumbers(List<Integer> rollNumbers) {
		this.rollNumbers = rollNumbers;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", grade=" + grade +
				", gcp=" + gcp +
				", activities=" + activities +
				", subjects=" + subjects +
				", rollNumbers=" + rollNumbers +
				'}';
	}
}
