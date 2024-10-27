package functionalInterface.programs;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

	public static List<Student> getStudentList() {

		List<Student> data = new ArrayList<>();
		List<String> activites = new ArrayList<>();
		activites.add("Badmiton");
		activites.add("Tennies");
		activites.add("Gym");
		activites.add("Badmiton");
		activites.add("Badmiton");
		activites.add("Badmiton");

		Student s = new Student(1, "Praneeth", "Bangalore", 63.4, (short) 2, activites);
		Student s1 = new Student(2, "Ramesh", "Chennai", 60.4, (short) 4, activites);
		Student s2 = new Student(3, "Suresh", "Hyderabad", 73.4, (short) 2, activites);
		Student s3 = new Student(4, "Harish", "Bangalore", 61.4, (short) 1, activites);
		Student s4 = new Student(5, "Sathish", "Bangalore", 60.4, (short) 3, activites);
		Student s5 = new Student(6, "Kumar", "Chennai", 68.4, (short) 3, activites);
		Student s6 = new Student(7, "Paramesh", "Hyderabad", 78.4, (short) 2, activites);
		Student s7 = new Student(8, "Prakash", "Chennai", 79.4, (short) 4, activites);

		data.add(s);
		data.add(s1);
		data.add(s2);
		data.add(s3);
		data.add(s4);
		data.add(s5);
		data.add(s6);
		data.add(s7);

		return data;
	}

}
