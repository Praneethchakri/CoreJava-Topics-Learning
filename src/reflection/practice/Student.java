package reflection.practice;

public class Student {
	private final int studentId;
	private final String name;
	private final String address;
	private final School school;

	public Student(int studentId, String name, String address, School school) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.school = school;
	}

	public Student() {
		this.studentId = 0;
		this.name = "SampleStudentData";
		this.address = "India By Default";
		this.school = null;
	}

	public Student(int studentId, String name, String address) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.school = null;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + ", school=" + school
				+ "]";
	}

}
