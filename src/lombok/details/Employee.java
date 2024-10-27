package lombok.details;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Data
//@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Builder
public class Employee {
	@Setter
	@Getter
	private int id;
	private final String name;
	private final String address;
	@NonNull
	private String phoneNumber;

//	@RequiredArgsConstructor   is used to create a constructor with non null value and final value,, and it will exclude the non final values while constructor creation
//	@Getter is used to get the field values 
//	@Setter is used to set the field values.
//  @NoArgsConstructor is used to initialize the constructor with no parameters
//  @AllArgsConstructor is used to include all the parameter types(non null, final, non final fields in class)
//  @ToString , is used to create the object data in string format with the fields
//  @EqualsAndHashCode is used to create equals method and hash code method for the objects, 
//  @Data--> @Getter+@Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode

}
