package lombok.details;

import lombok.Builder;

public class StudentImpl {
	public static void main(String[] args) {
		
		Student s = new Student(0, "Praneeth", "+49-abcefghij");
		System.out.println(s);
		Student s1 = new Student(0, "Praneeth", "+49-abcefghij");
		System.out.println(s1);
		System.out.println(s.equals(s1));
		Student s2 = Student.builder().studentId(123).name("TestBuilder").contactNumber("1234567892").build();
		System.out.println(s2);
//		@Data Annotation will create all the required setter and Getter methods & toString , @EqualsAndHashCode & @RequriedArgsconstructor( this constructor will be created with
//		Only non null and final fields, remaining non final fields will be excluded) 
		
//		if the model class have a @Noargconstructor , and it has a final field the we need to initlize the value , else we cannot create the consturctor
		
//	@Builder  annotation is requried @AllArgConstructor, if we dont add that , and the model class has all type of params , liek non null, final ,not null fields,
//		it will throw error due to it require all the fields  
		
	}

}
