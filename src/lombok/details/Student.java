package lombok.details;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Student {
	
	private int studentId;
	@NonNull
	private String name;
	
	private final String address ="Germany";
	
	private String contactNumber;

}
