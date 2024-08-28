package coding.practicals;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountofChars {
	
	public static void main(String[] args) {
		
		
		String str = "Praneeth";
		Arrays.stream(str.split("")).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((x,y)-> System.out.println(x +"-->" + y ));
		
	}

}
