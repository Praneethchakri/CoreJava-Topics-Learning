package reflection.practice;

public class School {

	private final String schoolName;

	private final String schoolAddress;

	public School(String schoolName, String schoolAddress) {
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
	}

	public School(String schoolName) {
		this.schoolName = schoolName;
		this.schoolAddress = null;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + "]";
	}

}
